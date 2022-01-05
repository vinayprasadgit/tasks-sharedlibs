import test.*
import hudson.model.*
import com.demo.*
    
 
def call()
{
    VehicleTest.testDisplay()  
    echo "Hello"
   def res = {
    def v1 = new Vehicle("Benz","Black")
    println v1.getName()
    println v1.getColor()
   }
   res.call()
}
  
