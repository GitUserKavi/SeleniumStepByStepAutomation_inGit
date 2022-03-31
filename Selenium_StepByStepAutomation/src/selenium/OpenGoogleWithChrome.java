package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogleWithChrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//	1. Open Google Page using the URL
		// 	2. Goto google home page
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sathy\\OneDrive\\Desktop\\Kavitha\\Selenium\\WebDrivers\\Chrome_Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.ca/");
	}

}
