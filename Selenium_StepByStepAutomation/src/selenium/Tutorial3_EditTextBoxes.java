package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Tutorial3_EditTextBoxes {

	public static void main(String[] args) {
				// TODO Auto-generated method stub
		
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\sathy\\OneDrive\\Desktop\\Kavitha\\Selenium\\WebDrivers\\Chrome_Driver\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("http://leafground.com/pages/Edit.html");
				
		//	case1 : Enter your email address in the text box
		WebElement emailBox = driver.findElement(By.id("email"));
		emailBox.sendKeys("Kavitha.Sathiya@gmail.com");
		
		//	case 2: Append a text and press keyboard tab in the text box
		WebElement appendBox =  driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input"));
		appendBox.sendKeys("family");
		
		//	case 3: Get default text entered
		WebElement getTextBox = driver.findElement(By.name("username"));
		String value =  getTextBox.getAttribute("value");
		System.out.println(value);
		//		String value = driver.findElement(By.name("username")).getAttribute("value");
			
		
		// 	case 4: Clear the text
		//		WebElement clearBox =  driver.findElement(By.name("username"));
		WebElement clearBox =  driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div/div/input"));
		clearBox.clear();
		
		//	case 5: Confirm that edit field is disabled
		WebElement disabledBox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[5]/div/div/input"));
		boolean disabled = disabledBox.isDisplayed();
		System.out.println(disabled);
	}

}
