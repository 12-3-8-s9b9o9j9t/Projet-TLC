#!/bin/sh
java -jar ./whilec/whilec.jar code.txt
g++ code.txt.cpp -o code -I. -I./whilestd/include/ -L./whilestd/build/ -lwhilestd
