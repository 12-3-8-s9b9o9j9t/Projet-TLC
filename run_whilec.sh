#!/bin/sh

help_message() {
    echo "Usage: ./run_whilec.sh [options] input_file"
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
    echo "You must provide only one input file, but you provided $#:\n$@"
    exit 1
fi

if [ ! -e $input_file ]; then
    echo "Input file $input_file does not exist"
    exit 1
fi

input_file=$(realpath $input_file)

if [ -n "$output_file" ]; then
    echo "Output file will be named $output_file"
    output_file="$(realpath $PWD/$output_file)"
else
    echo "Default output file name will be used"
    output_file="$PWD/a.out"
fi

echo "Generating C++ code from $input_file"
java -jar ./whilec/whilec.jar $input_file

if [ $? -eq 0 ]; then
  if [ ! -e whilestd/build/libwhilestd.a ]; then
      echo "whilestd library not found, building it"
      make -C whilestd
  fi

  echo "Compiling into $output_file"

  generated_files="$input_file.cpp"
  if [ -f "$input_file.h" ]; then
      generated_files="$generated_files $input_file.h"
  fi

  g++ $generated_files -o $output_file -Iwhilestd/include/ -Lwhilestd/build/ -lwhilestd

  if [ "$remove_temp" = true ] ; then
      echo "Removing temporary files"
      rm $generated_files
  fi
  echo "Compilation successful"
else
  echo "Compilation failed"
  exit 1
fi
