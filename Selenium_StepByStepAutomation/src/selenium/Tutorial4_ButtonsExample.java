package selenium;

import org.openqa.selenium.By;
/*import org.openqa.selenium.Point;*/
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Tutorial4_ButtonsExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\sathy\\OneDrive\\Desktop\\Kavitha\\Selenium\\WebDrivers\\Chrome_Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
				
				//	LEARNING BUTTONS
						// Case 1:	Find position of button (x,y) //getLocation() from point cladd 
				
				WebElement getButtonPosition  = driver.findElement(By.id("position"));
				
				int x = getButtonPosition.getLocation().getX();
				int y = getButtonPosition.getLocation().getY();		
				
				
				System.out.println("Button's X co-ordinate is :" + x + "\t Button's Y co-ordinate is : " + y);
				
				
				
				  // Case 2: Find button color
				  
				  WebElement buttonColour = driver.findElement(By.id("color"));
				  
				  String colour = buttonColour.getCssValue("background-color");
				  
				  System.out.println("Button's color is " + colour);
				  
				  
				  // Case 3: Find the height and width // getSize() from Dimension class
				  WebElement getButtonSize = driver.findElement(By.id("size")); 
				  int height =  getButtonSize.getSize().getHeight(); 
				  int width =  getButtonSize.getSize().getWidth();
				  
				  System.out.println("Button's height is :" + height +
				  "\t Button's width is : " + width);
				  
				  
				  // Case 4: Click button to travel home page
				  
				  WebElement goHomeButton = driver.findElement(By.id("home"));
				  Thread.sleep(3000); 
				  // Please do not add wait time in the real time codes,
				  //then it was isn't automation :) 
				  
				  goHomeButton.click();
				 
				
					}

}
