package testNG;

import org.testng.annotations.Test;

public class DependenciesManagement {

	//Problem 1 : You have to admit a student to engineering
	//Problem 2 : You have to admit a student to higher Secondary
	@Test(enabled = true)
	public void  highSchool() {
		System.out.println("High School Passed");
	}

	@Test(dependsOnMethods = "highSchool")
	public void  higherSecondary() {
		System.out.println("Higher Secondary School Passed");
	}

	@Test(dependsOnMethods = "higherSecondary")
	public void  bscCollege() {
		System.out.println("Bacheler's Passed");
	}
}
