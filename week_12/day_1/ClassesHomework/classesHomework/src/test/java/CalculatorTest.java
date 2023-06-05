import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void addTwoIntegers(){
        assertEquals(7, calculator.addNumbers(2, 5));
    }

    @Test
    public void subtractIntegers(){
        assertEquals(4, calculator.subtractNumbers(9,5));
    }

    @Test
    public void multiplyIntegers(){
        assertEquals(8, calculator.multiplyNumbers(4,2));
    }

    @Test
    public void divideTwoNumbers(){
        assertEquals(4.0, calculator.divideNumbers(8.0, 2.0), 0.0);
    }

}
