
def call(deployRelease,versionClassifier)
{
  
  def content1 = libraryResource "com/math/mul/checkRelease.sh"
  writeFile file: "checkRelease.sh", text: content1
  sh "chmod a+x ./checkRelease.sh"
  sh "./checkRelease.sh $deployRelease $versionClassifier"
  
//   if (!deployRelease){
//     currentBuild.result='UNSTABLE'
//     print "from if"
//   }
    
 
}
  
  
