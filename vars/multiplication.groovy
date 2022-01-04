def call(x,y)
{
  def content = libraryResource "com/math/mul/resMul.sh"
  writeFile file: "resMul.sh", text: content
  sh "./resMul.sh ${x} ${y}"
}
