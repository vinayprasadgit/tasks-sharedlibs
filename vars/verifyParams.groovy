def call(deployRelease,versionClassifier)
{
  def dr = deployRelease
  def vc = versionClassifier
  
  def content1 = libraryResource "com/math/mul/checkRelease.sh"
  writeFile file: "checkRelease.sh", text: content1
  sh "chmod a+x ./checkRelease.sh"
  sh "./checkRelease.sh $deployRelease $versionClassifier"
  
  printf dr
  printf vc
}
  
  
