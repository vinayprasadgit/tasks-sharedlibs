#!/bin/bash

if [ $1 == "true" ]
then 
  if [ -n $2 ]
  then 
    echo "you cannot have a version classifier when deploying"
  fi
fi
echo "$1"
echo "$deployRelease"
echo "$versionClassifier"
echo "$2"
