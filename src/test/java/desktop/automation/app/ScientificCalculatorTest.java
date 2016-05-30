package desktop.automation.app;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;



public abstract class ScientificCalculatorTest  {

	ScientificCalculator scientificCalculator;

	

    @BeforeTest
    public void openScientificCalculator() throws Exception
    {
    	scientificCalculator = new ScientificCalculator();
    }
    
    
    @AfterTest
    public void closeCalculator()
    { 
    	scientificCalculator.closeWindow();       
    }
    
    
    @BeforeMethod
    public void clearResults()
    {
    	scientificCalculator.clear();
        
    }
    
	//@Test
	//public void checkIfScientificViewEnabled() throws NotNumberException {
		//ScientificCalculator.selectScientificView();
		//Assert.assertTrue(ScientificCalculator.getLdtp().objectExist("Log") == 1);
	//}

}
