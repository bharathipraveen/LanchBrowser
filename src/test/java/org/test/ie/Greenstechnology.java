package org.test.ie;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Greenstechnology {
	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver", "C:\\Users\\DELL\\eclipse-workspace\\LaunchBrowser\\driver\\IEDriverServer.exe"); 
	WebDriver driver=new InternetExplorerDriver();
	driver.get("http://www.greenstechnologys.com/");
	}

}
