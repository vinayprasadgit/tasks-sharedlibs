#!/bin/bash

if [ $1 == "true" ]
then 
  if [ -n $2 ]
  then 
    echo "you cannot have a version classifier when deploying"
#     currentBuild.result='UNSTABLE'
  fi
else
  if [ -z $2 ]
  then
     echo "Please Specify Version Classifier"
fi
echo "$1"
echo "$dr"
echo "$vc"
echo "$2"
