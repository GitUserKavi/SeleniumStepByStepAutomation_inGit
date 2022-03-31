package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tutorial9_HandlingWindows {

	public static void main(String[] args) throws InterruptedException {



		//System.setProperty("webdriver.chrome.driver", 
			//	"C:\\Users\\sathy\\OneDrive\\Desktop\\Kavitha\\Selenium\\WebDrivers\\Chrome_Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Window.html");

		// Work with Windows
		// Case 1: Click button to open home page in New Window
		String parentWindow = driver.getWindowHandle();
System.out.println(parentWindow);
		Thread.sleep(2000);
		WebElement homePageWindow = driver.findElement(By.id("home"));
		homePageWindow.click();

		Set<String> windowHandles = driver.getWindowHandles();
System.out.println(driver.getWindowHandles());
		for (String newWindow : windowHandles) {
			System.out.println(newWindow);
			driver.switchTo().window(newWindow);
			
		}
	
		Thread.sleep(2000);
		WebElement editButonClick = driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[1]/a/img"));
		editButonClick.click(); 

		driver.close();


		//Case 2: Find the number of opened windows

		driver.switchTo().window(parentWindow);

		WebElement openMultipleWindow = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
		openMultipleWindow.click();

		int windowsCount = driver.getWindowHandles().size();
		System.out.println("Number of windows opened: "+windowsCount);


		//Case 3: Close all except this window

		WebElement donCloseMeWindow = driver.findElement(By.id("color"));
		donCloseMeWindow.click();
		Thread.sleep(2000);

		Set<String> newWindowHandles =  driver.getWindowHandles();

		for (String allWindows : newWindowHandles) {
			if(!allWindows.equals(parentWindow)) {
				driver.switchTo().window(allWindows);
				driver.close();
			}

		}

		//		// Case 4: Wait for 2 new Windows to open
		//		WebElement waitAndOpenWindow = driver.findElement(By.id("color"));
		//		waitAndOpenWindow.wait();
		//		waitAndOpenWindow.click();
		//		


		driver.quit();

	}
}



