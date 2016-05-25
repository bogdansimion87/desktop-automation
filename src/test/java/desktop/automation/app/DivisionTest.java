package desktop.automation.app;

import org.testng.annotations.Test;

import com.cobra.ldtp.Ldtp;

import desktop.automation.exception.NotNumberException;
import junit.framework.Assert;

public class DivisionTest extends CalculatorTest{
	@Test
    public void testDivisionOfFiveAndTwo() throws NotNumberException
    {
        calculator.divide(8,2);
        Assert.assertEquals("4", calculator.getResult());
    }
	@Test
	public void testDivisionByZero() throws NotNumberException
    {
        calculator.divide(5,0);
        Assert.assertEquals("Cannotdividebyzero", calculator.getResult());
    }
	@Test(expectedExceptions = NotNumberException.class)
    public void testNotANumberException() throws NotNumberException
    {
        calculator.divide(21, 3);
    }
	
	@Test
	public void aa()
	{
		Ldtp ldtp = calculator.getLdtp();
		
		String[] obiecte = ldtp.getObjectList();
		
		for (int i = 0; i < obiecte.length; i++) {
			System.out.println("Am gasit: " + obiecte[i]);
		}
		
		System.out.println("Rwesult: " + ldtp.getObjectList()[5]);
		
	}
	
	
}
