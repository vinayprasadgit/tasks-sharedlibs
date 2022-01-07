import com.demo.*
import resources.*
  
def call()
{
  def calcTest = new CalculationTest();
  calcTest.addTest1()
  calcTest.addRep()
  
  def calc1 = new Calculation();
  println calc1.add(50,50)
  println calc1.sub(50,10)
  println calc1.str("Vinay Prasad")
}
  
