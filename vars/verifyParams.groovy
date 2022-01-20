def call(deployRelease,versionClassifier)
{
  def env.dr = deployRelease
  def env.vc = versionClassifier
  
  def content1 = libraryResource "com/math/mul/checkRelease.sh"
  writeFile file: "checkRelease.sh", text: content1
  sh "chmod a+x ./checkRelease.sh"
  sh "./checkRelease.sh $deployRelease $versionClassifier"
  
  printf "from groovy "+dr
  printf "from groovy "+vc
}
  
  
