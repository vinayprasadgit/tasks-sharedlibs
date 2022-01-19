def call(){
  
  def content = libraryResource "com/math/mul/script1.sh"
  writeFile file: "script1.sh", text: content
  sh "chmod a+x ./script1.sh"
  sh "./script1.sh"
  
  def content = libraryResource "com/math/mul/script2.sh"
  writeFile file: "script2.sh", text: content
  sh "chmod a+x ./script2.sh"
  sh "./script2.sh"
  
  
}
