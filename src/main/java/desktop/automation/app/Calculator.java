package desktop.automation.app;

import java.io.File;

import org.alfresco.os.win.Application;
import org.alfresco.utilities.LdtpUtils;

import desktop.automation.exception.NotNumberException;
 
/**
 * Calculator wrapper
 * 
 * @author Paul Brodner
 */
public class Calculator extends Application
{
    public Calculator()
    {
        setApplicationName("calc.exe");
        setApplicationPath(new File(LdtpUtils.getSystem32(), getApplicationName()).getPath());
        setWaitWindow("Calculator");
    }

    public void add(int a, int b) throws NotNumberException
    {
        clickNumber(a);
        add();
        clickNumber(b);
        add();
    }
    
    public void multiply(int a, int b) throws NotNumberException
    {
        clickNumber(a);
        multiply();
        clickNumber(b);
        multiply();
    }
    
    
    public void divide(int a, int b) throws NotNumberException
    {
    	clickNumber(a);
    	divide();
        clickNumber(b);
        divide();
    }
    
    public void logarithm(int a) throws NotNumberException{
    	selectScientificView();
    	clickNumbers(a);
    	logarithm();
    }
    
    /**
     * Just click on the </> button
     */
    public void divide()
    {
        clickButton("Divide");
    }   
    /**
     * Just click on the <+> button
     */
    public void add()
    {
        clickButton("Add");
    }

    /**
     * Just click on the <*> button
     */
    public void multiply()
    {
        clickButton("Multiply");
    }
    
    
    public void logarithm()
    {
        clickButton("Log");
    }
    /**
     * Clear the Result value, clicking on C button
     */
    public void clear()
    {
        clickButton("Clear");
    }

    /**
     * @return the results of the arithmetic operation
     */
    public String getResult()
    {
        return getLdtp().getObjectList()[5].replace("lbl", ""); // the 5th element object of calculator is the Result label
    }

    /**
     * Click on a number for Calculator
     * 
     * @param number
     * @throws NotNumberException
     */
    private void clickNumber(int number) throws NotNumberException
    {
        if (number < 0 || number > 9)
        {
            throw new NotNumberException(number);
        }
        getLdtp().click(String.valueOf(number));
        
        
    }
    
   
    private void clickNumbers(int number) throws NotNumberException {
    	String number_string = String.valueOf(number);    	
    	for (char c : number_string.toCharArray()) {
    		getLdtp().click(String.valueOf(c));
    	}
    }
    
    public void selectScientificView() {
    	clickOnViewMenu();
    	getLdtp().waitTime(2);
    	getLdtp().selectMenuItem("Scientific");
    	//getLdtp().generateKeyEvent("<alt>+2");
    }
    
    public void clickOnViewMenu() {
    	getLdtp().doubleClick("View");
    }


}
