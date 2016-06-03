package desktop.automation.app;

import java.io.File;

import java.lang.*;
import com.cobra.ldtp.*;


public class DebbugingClass {

	
//	 "Notepad++" + 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Ldtp ldtp = new Ldtp("Notepad");
		//System.out.println(ldtp.getTextValue("txt0"));
		Ldtp ldtp = new Ldtp("*Notepad*");
		//System.out.println(ldtp.getAppList());
		String[] appList = ldtp.getAppList();
		
		for(int i=0; i<appList.length; i++) {
			System.out.println(appList[i]);
		}
		
		//System.out.println(obiecte[0]);
		//ldtp.activateWindow("notepad++");
		ldtp.launchApp("notepad++");
		String[] windows = ldtp.getWindowList();
		
		for(int i=0; i<windows.length; i++) {
			System.out.println(windows[i]);
		}
		
		String[] obj= ldtp.getObjectList();
		for (int i = 0; i < obj.length; i++) {
			System.out.println(obj[i]);
		}
		
		//ldtp.minimizeWindow(windows[3]);
		
	}
}
