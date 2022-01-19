def call(x,y){
  
  def content1 = libraryResource "com/math/mul/script1.sh"
  writeFile file: "script1.sh", text: content1
  sh "chmod a+x ./script1.sh"
  sh "./script1.sh ${x} ${y}"
  
//   def content2 = libraryResource "com/math/mul/script2.sh"
//   writeFile file: "script2.sh", text: content2
//   sh "chmod a+x ./script2.sh"
//   sh "./script2.sh"
  
  
}
