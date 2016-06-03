package desktop.automation.app;

import java.io.File;
import org.alfresco.os.win.Application;
import org.alfresco.utilities.LdtpUtils;


public class NotepadPlusPlus extends Application {
	    public NotepadPlusPlus()  {	    	
	    	setApplicationName("notepad++.exe");
	    	//File file = new File(System.getenv("ProgramFiles(x86)"),"\\Notepad++\\notepad++.exe");
	    	setApplicationPath("C:\\Program Files (x86)\\Notepad++\\notepad++.exe");
	    	setWaitWindow("Notepad++");
	    }
	    
	    //public void writeText(String text)  {
	    //	getLdtp().appendText(getLdtp().getObjectList()[1], text);
			
		//}

}
