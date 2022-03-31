package selenium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tutorial19_TableHandling {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/table.html");


		// Case 1: Get the count of number of columns
		List<WebElement> columns = driver.findElements(By.tagName("th"));
		int  columnCount = columns.size();
		System.out.println("Number of Columns "+ columnCount);

		// Case 2: Get the count of number of rows		
		List<WebElement> rows = driver.findElements(By.tagName("tr"));
		int  rowCount = rows.size();
		System.out.println("Number of Rows " + rowCount);

		// Case 3 :Get the progress value of 'Learn to interact with Elements'        
		WebElement getPercentage = driver.findElement(
				By.xpath("//td[normalize-space()='Learn to interact with Elements']//following::td[1]"));

		String percent = getPercentage.getText();
		System.out.println("Percentage is " + percent);


		// Case 4: Check the vital task for the least completed progress.
		List<WebElement> allProgress = driver.findElements(By.xpath("//td[2]"));

		List<Integer> percentList = new ArrayList<Integer>();

		for (WebElement webElement : allProgress) {
			String individualValue = webElement.getText().replace("%", "");
			percentList.add(Integer.parseInt(individualValue));
		}
		System.out.println("Final list of percentage : " + percentList);


		int leastPercentageValue = Collections.min(percentList);
		System.out.println("Lowest Percentage " + leastPercentageValue);

		//We found the least percentage, now we have to check the vital task near to it.
		//Prepare and compare Xpath  //td[normalize-space()='20%']//following::td[1]
									 //td[normalize-space()="30%"]//following::td[1]
		String leastpercentageString = Integer.toString(leastPercentageValue)+"%";

		String finalXpath = "//td[normalize-space()="+"\""+leastpercentageString+"\""+"]"+"//following::td[1]//input";
		System.out.println(finalXpath);
		
		
		WebElement check  = driver.findElement(By.xpath(finalXpath));
		check.click();	

	}


}
