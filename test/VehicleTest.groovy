package test;
import groovy.test.GroovyTestCase
import com.demo.Vehicle

class VehicleTest extends GroovyTestCase {
    void testDisplay() {
        def v1 = new Vehicle("Benz","Black")
        def expected = "Benz","Green"
        assertToString(stud.Display(), expected)
        println("All Tests Are Passed")
    }
}
