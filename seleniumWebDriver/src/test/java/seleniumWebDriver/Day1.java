package seleniumWebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
/*
  Test Case:
  1. launch browser
  2. open url 
  3. validate title 
  4. close browser
 */
public class Day1 {
	
	public static void main(String[] args) {
		
		// 1. launch browser
		//ChromeDriver driver= new ChromeDriver();
		WebDriver driver= new ChromeDriver();
		
		// 2. open url 
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		// 3. validate title
		String act_title= driver.getTitle();
		if(act_title.equals("OrangeHRM")) {
			System.out.println("Test passed");
		}
		else
			System.out.println("Test Failed");
		
		// 4. close browser
		// driver.close();
		// driver.quit();
	} 
	
}
