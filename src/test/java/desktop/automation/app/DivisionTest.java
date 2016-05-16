package desktop.automation.app;

import org.testng.annotations.Test;

import desktop.automation.exception.NotNumberException;
import junit.framework.Assert;

public class DivisionTest extends CalculatorTest{
	@Test
    public void testDivisionOfFiveAndSeven() throws NotNumberException
    {
        calculator.multiply(5,7);
        Assert.assertEquals("35", calculator.getResult());
    }

}
