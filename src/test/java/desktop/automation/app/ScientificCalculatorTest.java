package desktop.automation.app;

import org.testng.Assert;
import org.testng.annotations.Test;
import desktop.automation.exception.NotNumberException;



public class ScientificCalculatorTest extends CalculatorTest {
	
	@Test
    public void checkIfScientificViewEnabled() throws NotNumberException
    {
        calculator.selectScientificView();
        Assert.assertTrue(calculator.getLdtp().objectExist("Log")==1);       
    }
           
}
