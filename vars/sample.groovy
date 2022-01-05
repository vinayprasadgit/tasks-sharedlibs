def call()
{
  def res = {
    def v1 = new Vehicle("Benz","Black")
    println v1.getName()
    println v1.getColor()
  }
  res.call()
}
  
