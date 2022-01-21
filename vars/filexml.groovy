def call(){
  def val = sh script("bash ./info2.sh" ,returnStdout: true).trim().split('\n')
  println val[0]
  println val[0]
  println val[0]
}
