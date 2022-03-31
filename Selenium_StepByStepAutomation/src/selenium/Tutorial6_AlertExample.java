package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tutorial6_AlertExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// http://leafground.com/pages/Alert.html
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\sathy\\OneDrive\\Desktop\\Kavitha\\Selenium\\WebDrivers\\Chrome_Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Alert.html");
		
			// Case 1:Click the button to display a alert box.
		
			WebElement alertBoxTest = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/button"));
			alertBoxTest.click();
			Thread.sleep(3000);
			Alert alert = driver.switchTo().alert();
			alert.accept();
			
			// Case 2: Click the button to display a confirm box.
						
			WebElement confirmAlert= driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
			confirmAlert.click();
			Alert alertConfirm  = driver.switchTo().alert();
			Thread.sleep(3000);			
			alertConfirm.dismiss();
			
			// Case 3: Click the button to display a prompt box.		
			
			WebElement promptBox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/button"));
			promptBox.click();
						
			Alert alertText = driver.switchTo().alert();						
			alertText.sendKeys("Duckling");
			Thread.sleep(3000);
			alertText.accept();
			
			
				}

}
