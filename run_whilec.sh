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

if [ "$#" -ge 2 ]
then
    echo "You must provide only one input file, but you provided $#:\n$@"
    exit 1
fi

if [ -n "$output_file" ]; then
    echo "Output file will be named $output_file"
    #your code to rename the output file
else
    echo "Output file will be named default_output.out"
fi

if [ "$remove_temp" = true ] ; then
    echo "Removing temporary files"
    #your code to remove the temporary files
fi

#if [ ! -e ./whilestd/build/libwhilestd.a ]; then
#    make -C./whilestd
#fi


# java -jar ./whilec/whilec.jar code.txt
# g++ code.txt.cpp -o code -I. -I./whilestd/include/ -L./whilestd/build/ -lwhilestd
