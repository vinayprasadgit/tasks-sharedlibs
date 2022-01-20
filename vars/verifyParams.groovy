def call(def deployrelease,def versionclassifier)
{
  def content1 = libraryResource "com/math/mul/checkRelease.sh"
  writeFile file: "checkRelease.sh", text: content1
  sh "chmod a+x ./checkRelease.sh"
  sh "./checkRelease.sh $deployrelease $versionclassifier"
}
  
  
