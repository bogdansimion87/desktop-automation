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

}
