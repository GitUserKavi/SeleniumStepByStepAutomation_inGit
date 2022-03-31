package testNG;

import org.testng.annotations.Test;

public class GroupingExample {
	
	/*
	 * 1. What is grouping? 2. Why Grouping is important? 3. How to group our test
	 * cases using TestNG 4. How to execute a specific group in TestNG? 5. How to
	 * include a group to the execute? 6. How to exclude a group from the execution?
	 */
	
	/*
	 * Scenario: A big basket is having a different kind of mobiles.
	 * Lets say there are Apple phones, Moto G, VIVO and Lenovo.
	 * I want to run tests only for VIVO and Moto phones.
	 * Write a program for this
	 */

	@Test(groups = "Apple")
	public void apple_1() {
		System.out.println("Apple phone");
	}
	
	@Test(groups = "Apple")
	public void apple_2() {
		System.out.println("Apple phone");
	}
	
	@Test(groups = "Moto")
	public void moto_1() {
		System.out.println("Moto phone");
	}
	
	@Test(groups = "Moto")
	public void moto_2() {
		System.out.println("Moto phone");
	}
	
	@Test(groups = "VIVO")
	public void vivo_1() {
		System.out.println("VIVO phone");
	}
	
	@Test(groups = "VIVO")
	public void vivo_2() {
		System.out.println("VIVO phone");
	}
	
	@Test(groups = "Lenovo")
	public void lenevo_1() {
		System.out.println("Lenevo phone");
	}
	@Test(groups = "Lenovo")
	public void lenevo_2() {
		System.out.println("Lenevo phone");
	}
}	
