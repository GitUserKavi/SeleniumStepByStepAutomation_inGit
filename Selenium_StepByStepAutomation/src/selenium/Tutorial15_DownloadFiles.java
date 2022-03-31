package selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tutorial15_DownloadFiles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/download.html");
		
		// Case 1 : verifying our file is downloaded in the directory
		WebElement downLoadExcel = driver.findElement(By.linkText("Download Excel"));
		downLoadExcel.click();

		Thread.sleep(3000);
		File fileLocation = new File("C:\\Users\\sathy\\Downloads");
		File[] totallFile = fileLocation.listFiles();
		System.out.println(fileLocation.listFiles());

		for (File file : totallFile) {

			if (file.getName().equals("testleaf.xlsx")) {
				System.out.println("File is downloaded");
				break;
			} 
		}
	}




}


