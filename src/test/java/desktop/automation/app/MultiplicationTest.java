package desktop.automation.app;

import org.testng.annotations.Test;

import desktop.automation.exception.NotNumberException;
import junit.framework.Assert;

public class MultiplicationTest extends CalculatorTest{
	@Test
    public void testMultiplicationOfFiveAndThree() throws NotNumberException
    {
        calculator.multiply(5, 3);
        Assert.assertEquals("15", calculator.getResult());
    }
	@Test
    public void testMultipleMultiplication() throws NotNumberException
    {
        calculator.multiply(2, 2);
        calculator.multiply(2, 2);
        Assert.assertEquals("16", calculator.getResult());
    }
	@Test(expectedExceptions = NotNumberException.class)
    public void testNotANumberException() throws NotNumberException
    {
        calculator.multiply(21, 3);
    }
}
