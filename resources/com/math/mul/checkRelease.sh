#!/bin/bash

deployRelease=$1 
versionClassifier=$2

if [[ $deployRelease == "true"  || ! -z $versionClassifier ]]
then 
  if [ -n $versionClassifier ]
  then 
    echo "you cannot have a version classifier when deploying"
    exit
  fi
else
  if [ -z $versionClassifier ]
  then
     echo "Please Specify Version Classifier"
  fi
fi
