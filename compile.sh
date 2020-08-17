#!/bin/bash

cd $1
find -name "*.java" > sources.txt
javac @sources.txt
rm sources.txt

