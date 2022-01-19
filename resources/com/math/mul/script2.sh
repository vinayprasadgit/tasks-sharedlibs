#!/bin/bash
source ./script1.sh

printenv

echo "This is from script2"
echo "$VAL1"
echo "$VAL2"
sum=$(($VAL1 + $VAL2))

# echo "$sum"
