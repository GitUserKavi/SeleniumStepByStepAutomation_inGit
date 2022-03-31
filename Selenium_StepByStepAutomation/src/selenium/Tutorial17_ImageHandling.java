package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tutorial17_ImageHandling {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Image.html");



		//Case 1: Click on this image to go home page
		WebElement firstImage = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/img"));
		
		if(firstImage.getAttribute("naturalWidth").equals("0")){
			System.out.println("The image is broken");

		}else {
			System.out.println("The image is NOT broken");
		}

		firstImage.click();
		WebElement imageHome = driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[4]/a/img"));
		imageHome.click();



		//Case 2 : Am I Broken Image
		WebElement brokenImage = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/img"));

		//"naturalWidth" = 0

		if(brokenImage.getAttribute("naturalWidth").equals("0")){
			System.out.println("The image is broken");

		}else {
			System.out.println("The image is NOT broken");
		}

		
		//Case 3 : Click me using Keyboard or Mouse
		
		WebElement thirdImage =  driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/img"));
		thirdImage.click();
		System.out.println("\"Click me using Keyboard or Mouse\" is Reached");
	}


}
