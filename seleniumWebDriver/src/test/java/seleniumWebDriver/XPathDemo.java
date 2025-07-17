package seleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathDemo {

	public static void main(String[] args) {

		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		// XPath with single attribute
		driver.findElement(By.xpath("//*[@id=\"autocomplete\"]")).sendKeys("Test");
	
		// XPath with multiple attributes
		driver.findElement(By.xpath("//input[@name='search' or placeholder= 'search']")).sendKeys("Tshirt");
		
		 
	}

}
