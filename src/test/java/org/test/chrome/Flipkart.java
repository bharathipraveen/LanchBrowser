package org.test.chrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\LaunchBrowser\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://www.flipkart.com/");

	}

}
