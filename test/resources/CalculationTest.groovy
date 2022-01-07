package test.resources

import com.demo.Calculation
import org.junit.Test
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.RepeatedTest
import org.junit.jupiter.api.RepetitionInfo

class CalculationTest implements Serializable
{
    def calc = new Calculation()
    @Test
    @DisplayName("Assert Equals Test Case")
    void addTest1() {
        int output = calc.add(2, 5);
        Assertions.assertEquals(7, output,()->"Assertion Failed for Addition Test1");
    }

    @RepeatedTest(3)
    @DisplayName("Test Repeatations")
    void addRep(RepetitionInfo info)
    {
        if(info.getCurrentRepetition()==1)
        {
            Assertions.assertEquals(0,calc.sub(5,5));}
        else if(info.getCurrentRepetition()==2)
        {
            Assertions.assertEquals(4,calc.sub(9,5));
        }
        else {
            Assertions.assertEquals(-4,calc.sub(1,5));
        }
    }



}
