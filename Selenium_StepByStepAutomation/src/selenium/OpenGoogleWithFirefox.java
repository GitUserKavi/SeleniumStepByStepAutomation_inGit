package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenGoogleWithFirefox {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\sathy\\OneDrive\\Desktop\\Kavitha\\Selenium\\WebDrivers\\Geckodriver\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		// Functions are like verbs, example: get, quit
		
		driver.get("https://google.ca");
		
		driver.quit();

	}

}
