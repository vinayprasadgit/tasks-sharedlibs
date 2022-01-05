def call()
{
  def res = {
    def v1 = new Vehicle("Benz","Black")
    printf v1.getName()
    printf v1.getColor()
  }
  res.call()
}
  
