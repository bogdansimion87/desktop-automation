package desktop.automation.app;

import org.testng.annotations.Test;

import desktop.automation.exception.NotNumberException;
import junit.framework.Assert;

public class LogaritmTest extends ScientificCalculatorTest{
  @Test
  public void testLogOfOneThousand() throws NotNumberException
  {
	  scientificCalculator.logarithm(1000);
      Assert.assertEquals("3", scientificCalculator.getResult());
  }
}
