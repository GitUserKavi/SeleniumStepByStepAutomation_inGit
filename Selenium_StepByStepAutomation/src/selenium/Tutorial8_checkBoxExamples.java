package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tutorial8_checkBoxExamples {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sathy\\OneDrive\\Desktop\\Kavitha\\Selenium\\WebDrivers\\Chrome_Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		
		//Interact with Checkboxes
		//Case 1: Select the languages that you know? // to check java and C
		WebElement javaElement = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[1]/div[1]/input"));
		javaElement.click();
		Thread.sleep(2000);
		WebElement cLangElement = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[1]/div[4]/input"));
		cLangElement.click();
		
		//Case 2: Confirm Selenium is checked
		WebElement seleniumCheck = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/input"));
		boolean checkStatus = seleniumCheck.isSelected();
		System.out.println(checkStatus);
		
		//Case 3: DeSelect only checked
		WebElement firstElement = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[3]/div[1]/input"));
		Thread.sleep(2000);
		if (firstElement.isSelected())	{
			firstElement.click();
		}
		
		WebElement secondElement = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[3]/div[2]/input"));
		Thread.sleep(2000);
		if (secondElement.isSelected())	{
			secondElement.click();
			
		//Case 4: 
		WebElement option1Check = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div[1]/input"));
		WebElement option2Check = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div[2]/input"));
		WebElement option3Check = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div[3]/input"));
		WebElement option4Check = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div[4]/input"));
		WebElement option5Check = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div[5]/input"));
		option1Check.click();
		option2Check.click();
		option3Check.click();
		option4Check.click();
		option5Check.click();		
		
		}
		
		}

}
