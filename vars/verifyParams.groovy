#!/usr/bin/env groovy
import org.apache.commons.lang.StringUtils

def call(deployRelease,versionClassifier)
{
  def flag = deployRelease
  
  def content1 = libraryResource "com/math/mul/checkRelease.sh"
  writeFile file: "checkRelease.sh", text: content1
  sh "chmod a+x ./checkRelease.sh"
  sh "./checkRelease.sh $deployRelease $versionClassifier"
  
  if (!flag){
    currentBuild.result='UNSTABLE'
    print "from if"
  }
//   else{
//     currentBuild.result='UNSTABLE'
//     print "from else"
//   }
  
  print deployRelease
  print flag
    
 
}
  
  
