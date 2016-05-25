package desktop.automation.app;
import java.lang.Math;
public class ScientificCalculator extends Calculator
{
	  public ScientificCalculator() {
		  
               super();
      }
	  
	  public void calculateSinus(double[] numbers)
	    {
	    	for (int i=0; i<numbers.length+1;i++)
	    		
	    		System.out.println(Math.sin(numbers[i]));
	    }
}
