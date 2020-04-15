package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GreensTechnologys {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL\\eclipse-workspace\\LaunchBrowser\\driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.greenstechnologys.com/selenium-course-content.html\r\n");
	}

}
