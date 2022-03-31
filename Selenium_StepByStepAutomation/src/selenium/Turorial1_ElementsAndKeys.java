package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Turorial1_ElementsAndKeys {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\sathy\\OneDrive\\Desktop\\Kavitha\\Selenium\\WebDrivers\\Geckodriver\\geckodriver.exe");		
		WebDriver driver = new FirefoxDriver();				
		driver.get("https://google.ca");
		
		// Enter the search term in google - Erode.
		// Click the Wikipedia link.
		
		driver.findElement(By.name("q")).sendKeys("Erode"+Keys.ENTER);
		
		
		
		
		// driver.quit();
		
		
	}

}
