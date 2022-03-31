package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tutorial7_RadioExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\sathy\\OneDrive\\Desktop\\Kavitha\\Selenium\\WebDrivers\\Chrome_Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/radio.html");


		//	Case  1 : Are you enjoying the classes? 	// This option is in working condition on the demo link, so  I include the case
		WebElement checkButton1 = driver.findElement(By.id("yes"));
		checkButton1.click();
		
		
		//	Case  2 : Find default selected radio button
		WebElement ButtonStatus1 = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/div/label[2]/input"));
		boolean button1 = ButtonStatus1.isSelected();
		WebElement ButtonStatus2 = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/div/label[3]/input"));
		boolean button2 = ButtonStatus2.isSelected();
		System.out.println("The status of button 1 is " + button1);
		System.out.println("The status of button 2 is " + button2);

		// Case 3: Select your age group (Only if choice wasn't selected) 
		// choosing 1-20 age group
		WebElement below20 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/input[1]"));
		Thread.sleep(3000);
		below20.click();

//			// choosing Above 40 years; age group, case 3 additional task
//			WebElement above40  = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/input[3]"));
//			Thread.sleep(3000);
//			above40.click();

					



	}

}
