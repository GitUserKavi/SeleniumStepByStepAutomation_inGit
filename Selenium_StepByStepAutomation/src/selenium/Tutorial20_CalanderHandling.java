package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tutorial20_CalanderHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 				
				"C:\\Users\\sathy\\OneDrive\\Desktop\\Kavitha\\Selenium\\WebDrivers\\Chrome_Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/Calendar.html");


		// Case 1 :Select 10th day of following month  {Using SendKeys}
		WebElement dateText = driver.findElement(By.id("datepicker"));
		dateText.sendKeys("04/10/2022" + Keys.ENTER);

		Thread.sleep(2000);
		dateText.clear();
		Thread.sleep(2000);

		// Case 1 :Select 10th day of following month  {By clicking 'next' button and choose the date '10' by using Xpath}
		WebElement dateText1 = driver.findElement(By.id("datepicker"));
		dateText1.click();

		WebElement nextButton = driver.findElement(By.xpath("//a[@title =\'Next\']"));
		nextButton.click();


		WebElement dateToBeGiven = driver.findElement(By.xpath("//a[contains(text(),10)]"));
		dateToBeGiven.click();

	}

}
