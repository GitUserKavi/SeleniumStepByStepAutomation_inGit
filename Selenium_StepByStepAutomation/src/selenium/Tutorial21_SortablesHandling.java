package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tutorial21_SortablesHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 				
				"C:\\Users\\sathy\\OneDrive\\Desktop\\Kavitha\\Selenium\\WebDrivers\\Chrome_Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/sortable.html");

		//case 1 : Drag and drop the "Items"
		//copied X path -- //*[@id="sortable"]/li[1] Then, modifid to catch all elements in the list --- //*[@id="sortable"]/li
		List<WebElement> list  = driver.findElements(By.xpath("//*[@id=\'sortable\']/li"));
		int listSize = list.size();
		System.out.println(listSize);

		WebElement fromElement = list.get(6);
		WebElement toElement = list.get(0);
		
			
		Actions actions = new Actions(driver);
		actions.clickAndHold(fromElement);
		actions.moveToElement(toElement);
		actions.release(toElement).build().perform();


	}

}
