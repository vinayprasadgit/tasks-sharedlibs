#!/bin/bash
# source ./script1.sh

echo "Hello from script2"
echo $1
echo $2
sum=$(($1 + $2))

echo "sum is : $sum"
