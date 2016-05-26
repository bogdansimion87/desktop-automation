package desktop.automation.app;

import org.testng.Assert;
import org.testng.annotations.Test;

import desktop.automation.exception.NotNumberException;

public class ScientificCalculatorTest extends CalculatorTest {

	ScientificCalculator ScientificCalculator;

	@Test
	public void checkIfScientificViewEnabled() throws NotNumberException {
		ScientificCalculator.selectScientificView();
		Assert.assertTrue(ScientificCalculator.getLdtp().objectExist("Log") == 1);
	}

}
