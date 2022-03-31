package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationExample {
	
	/*
	 * 1. What is Parameterization 2. How TestNG supports Parameterization 3. How to
	 * send test data from XML to test cases.
	 */
	
	@Test
	@Parameters("Name")
	public void printName(String name) {
		// System.out.println("Name is " + "Agni");
		 System.out.println("Name is " + name);
	}
	
}
