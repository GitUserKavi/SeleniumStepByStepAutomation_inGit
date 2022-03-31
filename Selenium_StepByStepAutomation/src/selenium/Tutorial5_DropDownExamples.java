package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Tutorial5_DropDownExamples {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub C:\\Users\\sathy\\OneDrive\\Desktop\\Kavitha\\Selenium\\WebDrivers\\Chrome_Driver\\chromedriver.exe
		//		http://leafground.com/pages/Dropdown.html


		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\sathy\\OneDrive\\Desktop\\Kavitha\\Selenium\\WebDrivers\\Chrome_Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");

		// Case 1,2,3 : Select training program using Index, Vale and Text
		
		WebElement dropdownone = driver.findElement(By.id("dropdown1"));
				// Dropdowns and alerts use the SELECT class, because development codes was in select class division MOSTLY. 
		Select select = new Select(dropdownone);
		select.selectByIndex(3);					//	3rd dropdown value 'UFT/QTP' so the index is 2
		Thread.sleep(3000);
		select.selectByValue("4");					// 	4th dropdown value 'LoadRunner' so the value is in quotes "4", since it is a string
		Thread.sleep(3000);
		select.selectByVisibleText("Appium");
		
		
		// Case 4: Get the number of dropdown options
		
		List<WebElement> listofOptions = select.getOptions();				// List<WebElement> is Generics in Java
		int size  = listofOptions.size();
		System.out.println("The size of the dropdown List is or(number of elements) :" + size);
		
		// Case 5: You can also use sendKeys to select  // we can use SENDKEYS for dropdown as well, to select the dopdown list
		
		Thread.sleep(2000);
		dropdownone.sendKeys("Selenium");
		
		
		// Case 6: Select your programs, either more than one options can also be selected.
		WebElement multiSelect = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[6]/select")); 
		Select multiSelectBox = new Select(multiSelect);
		
		multiSelectBox.selectByIndex(2);
		multiSelectBox.selectByIndex(3);
		
		
	}

}
