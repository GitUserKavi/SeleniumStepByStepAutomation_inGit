package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tutorial2_WorkingWithLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\sathy\\OneDrive\\Desktop\\Kavitha\\Selenium\\WebDrivers\\Geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://leafground.com/pages/Link.html");
		
//		// Click on the hyperlink "Go to Home Page" using linkText		
//		driver.findElement(By.linkText("Go to Home Page")).click();
		
		// Click on the hyperlink "Go to Home Page" using partialLinkText		
		driver.findElement(By.partialLinkText("Home Page")).click();

	}

}
