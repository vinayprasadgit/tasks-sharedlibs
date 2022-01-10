package resources
import groovy.test.GroovyTestCase
import com.demo.Vehicle

class VehicleTest extends GroovyTestCase {
    void testDisplay() {
        def v1 = new groovy.Vehicle("Benz","Black")
        def expected = "Car Name : Benz, Car Color : Black"
        assertToString(v1.display(),expected)
        println("All Tests Are Passed")
    }
}
