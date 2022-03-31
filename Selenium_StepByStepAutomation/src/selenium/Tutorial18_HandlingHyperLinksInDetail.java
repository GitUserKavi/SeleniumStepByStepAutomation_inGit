package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tutorial18_HandlingHyperLinksInDetail {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/Link.html");
		
		//Case 1 :Go to Home Page
		WebElement homePage = driver.findElement(By.linkText("Go to Home Page"));
		homePage.click();
		driver.navigate().back();
		
		
		//Case 2 : Find where am supposed to go without clicking me?
		WebElement whereIamGoingLink = driver.findElement(By.linkText("Find where am supposed to go without clicking me?"));
		String where = whereIamGoingLink.getAttribute("href");
		System.out.println("The link is going to : " +where);
		
		//Case 3: Verify am I broken?
		WebElement brokenLink = driver.findElement(By.linkText("Verify am I broken?"));
		brokenLink.click();
		
		String title = driver.getTitle();
		if (title.contains("404")) {
			System.out.println("Link is broken, since it displays Client not found error 404");
		}
		
		
		//Case 4: How many links are available in this page?
		
		driver.navigate().back();
		//stale element reference: element is not attached to the page document
		WebElement homePage1 = driver.findElement(By.linkText("Go to Home Page"));
		homePage1.click();
		driver.navigate().back();
		
		List<WebElement> totalLinks = driver.findElements(By.tagName("a"));
		int number = totalLinks.size();
		System.out.println("The number of links in the hyperlink page : " +number);
	}
	

}
