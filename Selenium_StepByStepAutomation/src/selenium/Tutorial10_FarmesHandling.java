package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tutorial10_FarmesHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", 
			//	"C:\\Users\\sathy\\OneDrive\\Desktop\\Kavitha\\Selenium\\WebDrivers\\Chrome_Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/frame.html");
		
		
		// Case 1: Handling with frames
		driver.switchTo().frame(0);
		WebElement frame1ButtonClick = driver.findElement(By.id("Click"));
		frame1ButtonClick.click();
		String text = frame1ButtonClick.getText();
		System.out.println("Button text captured :" + text);
		
		
		//Case 2: Go to switch nested frame ... Inspect iframe
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		WebElement button2 = driver.findElement(By.id("Click1"));
		button2.click();
		
		
		
		//Case 3: Find the total  number of frames
		driver.switchTo().defaultContent();
		List<WebElement> listFrames =  driver.findElements(By.tagName("iframe"));
		int totalFrames = listFrames.size();
		
		System.out.println("Total number of frames in the screen : " + totalFrames );
	}

}
