package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SuiteExample {
	WebDriver driver;
	long startTime;

	//Aim : Open Chrome and Go to 
	// 1. Google.ca, 2.bing.com, 3. amazon.ca and Finally close the browser

	@BeforeSuite
	public void openBrowser() {
		startTime = System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver", 				
				"C:\\Users\\sathy\\OneDrive\\Desktop\\Kavitha\\Selenium\\WebDrivers\\Chrome_Driver\\chromedriver.exe");
		driver = new ChromeDriver();

	}
	
	@Test(priority = 0)
	public void openGoogle() {
		driver.get("http://www.google.ca");
	}
	
	@Test(priority = 1)
	public void openBing() {
		driver.get("http://www.bing.ca");
	}
	
	@Test(priority = 2)
	public void openYahoo() {
		driver.get("https://www.amazon.ca");
		
	}
	
	@AfterSuite
	public void closeBrowser() {
		long endTime = System.currentTimeMillis();
		long totalExecutioTime = endTime - startTime;
		System.out.println("Total Execution time is : " + totalExecutioTime);
		driver.quit();
	}

}
