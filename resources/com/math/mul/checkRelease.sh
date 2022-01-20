#!/bin/bash
deployRelease=$1 
versionClassifier=$2
if [ $1 == "true" ]
then 
  if [ -n $2 ]
  then 
    echo "you cannot have a version classifier when deploying"
  fi
else
  if [ -z $2 ]
  then
     echo "Please Specify Version Classifier"
  fi
fi
# echo "$1"
# echo "$dr"
# echo "$vc"
# echo "$2"

echo "$deployRelease"
echo "$versionClassifier"
