package extentReportExample;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportExample{

	WebDriver driver;
	ExtentReports extentReport;
	ExtentSparkReporter sparkReporter;
	ExtentTest testCase;



	@Test
	public void openGoogle() throws IOException {
		testCase=extentReport.createTest("Verify Google Title");
		testCase.log(Status.INFO, "Navigating to Google");
		driver.get("http://www.google.ca");
		String title = driver.getTitle();
		testCase.log(Status.INFO, "Actual title :" + title);
		testCase.log(Status.INFO, "Expected title :" + "Google");
		testCase.log(Status.INFO, "Verification of Actual and Expected title");
		if(title.equals("Google")) {
			testCase.log(Status.PASS, "Actual title and expected title are Equal");
			
		}else {
		
			testCase.log(Status.FAIL, "Actual title and expected title are NOT Equal");
			TakesScreenshot screenshot = (TakesScreenshot) driver; 
			File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
			File detinationfile = new File("Google.png");
			FileHandler.copy(sourceFile, detinationfile);
			testCase.addScreenCaptureFromPath("Google.png");
		}
	}


	@Test
	public void openBing() throws IOException {
		testCase=extentReport.createTest("Verify Bing Title");
		testCase.log(Status.INFO, "Navigating to Bing");
		driver.get("http://www.bing.com");
		String title = driver.getTitle();
		testCase.log(Status.INFO, "Actual title :" + title);
		testCase.log(Status.INFO, "Expected title :" + "Bing");
		testCase.log(Status.INFO, "Verification of Actual and Expected title");
		if(title.equalsIgnoreCase("Bing")) {
			testCase.log(Status.PASS, "Actual title and expected title are Equal");
			
		}else {
			
			testCase.log(Status.FAIL, "Actual title and expected title are NOT Equal");
			TakesScreenshot screenshot = (TakesScreenshot) driver; 
			File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
			File detinationfile = new File("Bing.png");
			FileHandler.copy(sourceFile, detinationfile);
			testCase.addScreenCaptureFromPath("Bing.png");
		}
	}

	@Test
	public void openWikiPedia() throws IOException {
		testCase=extentReport.createTest("Verify Wikipedia Title");
		testCase.log(Status.INFO, "Navigating to Wikipedia");
		driver.get("http://www.wikipedia.org");
		String title = driver.getTitle();
		testCase.log(Status.INFO, "Actual title :" + title);
		testCase.log(Status.INFO, "Expected title :" + "wikipedia");
		testCase.log(Status.INFO, "Verification of Actual and Expected title");
		if(title.equals("wikipedia")) {
			
			testCase.log(Status.PASS, "Actual title and expected title are Equal");
		}else {
			
			testCase.log(Status.FAIL, "Actual title and expected title are NOT Equal");
			TakesScreenshot screenshot = (TakesScreenshot) driver; 
			File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
			File detinationfile = new File("wiki.png");
			FileHandler.copy(sourceFile, detinationfile);
			testCase.addScreenCaptureFromPath("wiki.png");
		}
	}


	@BeforeSuite
	public void launchBrowser() {
		//There are 3 reporters available
		//1. ExtentAventReporter , 2. ExtentKlovReporter and 3. ExtentHTMLReporter
		extentReport = new ExtentReports();
		sparkReporter = new ExtentSparkReporter("extentReports.html");
		extentReport.attachReporter(sparkReporter);
		driver = new ChromeDriver();

	}

	@AfterSuite
	public void closeBrowser() {
		driver.quit();
		extentReport.flush();

	}

}
