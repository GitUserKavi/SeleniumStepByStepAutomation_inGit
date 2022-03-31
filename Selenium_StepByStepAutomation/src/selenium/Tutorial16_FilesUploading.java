package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Tutorial16_FilesUploading {

	public static void main(String[] args) throws AWTException, InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); // maximizing window
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));  //for page load
		driver.get("https://www.grammarly.com/plagiarism-checker");//open testing website
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));// for Implicit wait

		JavascriptExecutor js = (JavascriptExecutor)driver; // Scroll operation using Js Executor
		js.executeScript("window.scrollBy(0,200)"); // Scroll Down(+ve) upto browse option
		Thread.sleep(2000); // suspending execution for specified time period

		WebElement browse = driver.findElement(By.cssSelector("._3255a-uploadButton"));
		// using linkText, to click on browse element 
		browse.click(); // Click on browse option on the webpage
		Thread.sleep(2000); // suspending execution for specified time period

		// creating object of Robot class
		Robot rb = new Robot();

		// copying File path to Clipboard
		StringSelection str = new StringSelection("C:\\Users\\sathy\\Downloads\\testleaf.xls");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);

		// press Contol+V for pasting
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);

		// release Contol+V for pasting
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
Thread.sleep(3000);
		// for pressing and releasing Enter
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

	}

}
