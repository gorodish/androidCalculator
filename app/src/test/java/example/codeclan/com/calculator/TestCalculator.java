package example.codeclan.com.calculator;

import org.junit.Before;
import org.junit.Test;
import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by user on 28/02/2017.
 */

public class TestCalculator {

    private int num1;
    private int num2;


    @Before
    public void before() {
        Calculator calc = new Calculator(num1, num2);
    }

    @Test
    public void testCanAdd() {
        assertEquals(5, Calculator.add(2, 3));
    }
}


