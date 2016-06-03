package desktop.automation.app;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NotepadPlusPlusTest {
	NotepadPlusPlus notePad;

	
	@Test
	public void f() throws Exception {
		notePad = new NotepadPlusPlus();
		notePad.openApplication();
	}
	
	
	
	
	//it doesn't work from this point on 
	@AfterTest
	public void closeCalculator() {
		notePad.closeWindow();
	}

}
