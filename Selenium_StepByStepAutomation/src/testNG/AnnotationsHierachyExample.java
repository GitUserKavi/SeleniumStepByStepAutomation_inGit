package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

/*1. TestNG annotations
2. Order of execution of TestNG annotations*/

public class AnnotationsHierachyExample {

	@Test
	public void test2() {
		System.out.println("I am test2");
	}
	
	@Test
	public void test3() {
		System.out.println("I am test3");
	}

	@Test
	public void test() {
		System.out.println("I am test");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("I am Before Method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("I am After Method");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("I am Before Class");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("I am After Class");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("I am Before Test");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("I am After Test");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("I am Before Suite");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("I am After Suite");
	}

}
