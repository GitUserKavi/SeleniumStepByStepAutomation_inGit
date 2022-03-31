package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tutorial11_DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\sathy\\OneDrive\\Desktop\\Kavitha\\Selenium\\WebDrivers\\Chrome_Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://leafground.com/pages/drop.html");


		// Case 1:  Play with Droppable
		WebElement dragMeBox = driver.findElement(By.id("draggable"));

		WebElement dropOnMe = driver.findElement(By.id("droppable"));

		Actions actions = new Actions(driver);

		//actions.clickAndHold(dragMeBox).moveToElement(dropOnMe).build().perform();  //or

		actions.dragAndDrop(dragMeBox, dropOnMe).build().perform();


	}

}
