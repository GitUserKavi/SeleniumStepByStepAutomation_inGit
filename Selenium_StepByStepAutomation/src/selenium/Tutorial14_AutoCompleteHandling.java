package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tutorial14_AutoCompleteHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\sathy\\OneDrive\\Desktop\\Kavitha\\Selenium\\WebDrivers\\Chrome_Driver\\chromedriver.exe"
		 * );
		 */
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/autoComplete.html");

		// Case 1: Enter 's' in typelist box
		WebElement selectText = driver.findElement(By.id("tags"));
		selectText.sendKeys("s");
		
		Thread.sleep(4000); // Explicit Wait   // Implicit Wait
		List<WebElement> unorderedListElements = driver.findElements(By.xpath("//*[@id=\'ui-id-1\']/li"));
		int numberOfElements = unorderedListElements.size();
		System.out.println(numberOfElements);

		//Case 2: Select "Web Services" from the list
		for (WebElement iteratelistElement : unorderedListElements) {
			if (iteratelistElement.getText().equals("SOAP")) {
				iteratelistElement.click();
				System.out.println("If Part");
				break;
			} else {
				System.out.println("Else Part");
			}
			
		} 
		
		
		
	}



}
