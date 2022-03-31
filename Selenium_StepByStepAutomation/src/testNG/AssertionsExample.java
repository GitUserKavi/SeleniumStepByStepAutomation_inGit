package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsExample {
	
	
	/*
	 * 1. What are assertions? 2. How is it being used for Validations? 3. Types of
	 * assertions
	 */
	
	String name = "agni";
	
	@Test
	public void checkEqual() {
		
		/*
		 * if(name.equals("Agni")) { System.out.println("Name is Equal"); }else {
		 * System.out.println("Name is not Equal"); }
		 */
		//Assert helps for doing Unit testing for developers
		//Assert.assertEquals(name, "Agni");
		
		Assert.assertNotEquals(name, "Agni");
		Assert.assertTrue(true, "This should not be true");
		
	}
	
	}
