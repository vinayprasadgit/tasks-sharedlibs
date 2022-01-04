def call(x,y)
{
  def content = libraryResource "com/math/mul/resMul.sh"
  writeFile file: "resMul.sh", text: content
}
