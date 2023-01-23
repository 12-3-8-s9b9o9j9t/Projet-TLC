#!/bin/sh

help_message() {
  echo "Usage: run_whilec.sh [options] input_file"
  echo "Options:"
  echo "   -r    Remove temporary files"
  echo "   -o    Output file name"
  echo "   -h    Show this help message"
  exit 0
}

while getopts ":rho:" opt; do
  case $opt in
    r)
      remove_temp=true
      ;;
    o)
      output_file="$OPTARG"
      ;;
    h)
      help_message
      ;;
    \?)
      echo "Invalid option: -$OPTARG" >&2
      exit 1
      ;;
    :)
      echo "Option -$OPTARG requires an argument." >&2
      exit 1
      ;;
  esac
done

shift $((OPTIND-1))
input_file="$1"

if [ -z "$input_file" ]
then
  echo "You must provide an input file"
  exit 1
fi

if [ "$#" -gt 1 ]
then
  echo "You must provide only one input file, but you provided $#:"
  for i in "$@"
  do
    echo "  $i"
  done
  exit 1
fi

if [ ! -e $input_file ]; then
  echo "Input file $input_file does not exist"
  exit 1
fi

input_file=$(realpath $input_file)

if [ -n "$output_file" ]; then
  output_file="$(realpath $PWD/$output_file)"
else
  output_file="$PWD/a.out"
fi

output_dir=$(dirname $output_file)
input_name=$(basename $input_file)

echo "Output file will be found at $output_file"

script_dir=$(dirname $(realpath $0))

echo "Generating C++ code from $input_file"

if [ ! -e $script_dir/whilec/whilec.jar ]; then
  echo "whilec.jar not found, building it"
  build_dir="$script_dir/whilec"

  cd $build_dir
  mkdir -p bin
  javac src/*.java -cp lib/antlr-3.5.3-runtime.jar:src/ -d bin/
  cd bin
  jar xfv ../lib/antlr-3.5.3-runtime.jar
  jar cvfe ../whilec.jar App .

  cd $scipt_dir
fi

java -jar $script_dir/whilec/whilec.jar $input_file

if ! cmp -s "$input_file.cpp" "$output_dir/$input_name.cpp"; then
  mv "$input_file.cpp" $output_dir
fi

generated_files="$output_dir/$input_name.cpp"

if [ -f "$input_file.h" ]; then
  if ! cmp -s "$input_file.h" "$output_dir/$input_name.h"; then
    mv "$input_file.h" $output_dir
  fi
  generated_files="$generated_files $output_dir/$input_name.h"
fi

if [ $? -eq 0 ]; then
  if [ ! -e $script_dir/whilestd/build/libwhilestd.a ]; then
    echo "libwhilestd.a not found, building it"
    make -C $script_dir/whilestd
  fi

  echo "Compiling into $output_file"

  g++ $generated_files -o $output_file -I$script_dir/whilestd/include/ -Wall -Werror -O3 -std=c++20 -L$script_dir/whilestd/build/ -lwhilestd

  if [ "$remove_temp" = true ] ; then
    echo "Removing temporary files"
    rm $generated_files
  fi
  echo "Compilation successful"
else
  echo "Compilation failed"
  exit 1
fi
