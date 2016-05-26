package desktop.automation.app;

import desktop.automation.exception.NotNumberException;

public class ScientificCalculator extends Calculator {
	

	public ScientificCalculator() {
		super();
		selectScientificView();
	}

	public void selectScientificView() {
		clickOnViewMenu();
		getLdtp().waitTime(2);
		getLdtp().selectMenuItem("Scientific");
		// or: getLdtp().generateKeyEvent("<alt>+2");
	}

	public void logarithm(int a) throws NotNumberException {
		selectScientificView();
		clickNumbers(a);
		logarithm();
	}
}
