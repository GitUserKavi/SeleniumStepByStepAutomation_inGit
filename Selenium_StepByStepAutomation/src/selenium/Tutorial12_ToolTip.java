package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tutorial12_ToolTip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", 
		//		"C:\\Users\\sathy\\OneDrive\\Desktop\\Kavitha\\Selenium\\WebDrivers\\Chrome_Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/tooltip.html");
		
		
		// Case 1: Working with tool tip
		WebElement nameTextBox = driver.findElement(By.id("age"));
		String toolTipTextCaptured = nameTextBox.getAttribute("title");
		System.out.println("The text present in tool tip is : " + toolTipTextCaptured);
		
	}

}
