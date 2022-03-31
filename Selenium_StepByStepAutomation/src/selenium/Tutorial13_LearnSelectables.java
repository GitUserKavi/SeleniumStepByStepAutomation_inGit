package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tutorial13_LearnSelectables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\sathy\\OneDrive\\Desktop\\Kavitha\\Selenium\\WebDrivers\\Chrome_Driver\\chromedriver.exe"
		 * );
		 */
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/selectable.html");
		
		
		//Case 1: Select first 3 elements in the list of seven Items
		List<WebElement> listElements  = driver.findElements(By.xpath("//*[@id=\'selectable\']/li"));
		
		int listSize = listElements.size();
		System.out.println(listSize);
		
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL)
		.click(listElements.get(0))
				.click(listElements.get(1))
				.click(listElements.get(2))
				.build().perform();
		
////OR use the other way of Selecting list
//		
//		Actions actions = new Actions(driver);
//		actions.clickAndHold(listElements.get(0))
//		.clickAndHold(listElements.get(1))
//		.clickAndHold(listElements.get(2))
//		.build().perform();
//		
		
//		// Or way to click and hold 
//		Actions actions = new Actions(driver);
//		actions.clickAndHold(listElements.get(0));
//		actions.clickAndHold(listElements.get(1));
//		actions.clickAndHold(listElements.get(2));
//		actions.build().perform();
//		
	}

}
