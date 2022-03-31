package testNG;

import org.testng.annotations.Test;

public class PrioritingDriverTestCase {



	@Test(priority = 0)
	public void startTheCar() {
		System.out.println("Start the car");
	}

	@Test(priority = 1)
	public void firstGearOn() {
		System.out.println("Apply 1st gear");
	}

	@Test(priority = 2)
	public void secondGearOn() {
		System.out.println("Apply 2nd gear");
	}

	@Test(priority = 3)
	public void thirdGearOn() {
		System.out.println("Apply 3rd gear");
	}

	@Test(priority = 4)
	public void fourthGearOn() {
		System.out.println("Apply 4th gear");
	}


}
