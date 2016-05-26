package desktop.automation.app;

import org.testng.annotations.Test;

import desktop.automation.exception.NotNumberException;
import junit.framework.Assert;

public class CopyPasteTest extends CalculatorTest{
  @Test
  public void testCopyPaste() throws NotNumberException
  {
	  calculator.copyPaste(1200);
	  Assert.assertEquals("1200", calculator.getResult());
  }
}
