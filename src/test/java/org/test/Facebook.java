package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL\\eclipse-workspace\\LaunchBrowser\\driver\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.facebook.com/");
}

}
