package seleniumWebDriver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class LocatorsDemo {

	public static void main(String[] args) {

		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		// id locator
//		driver.findElement(By.id("autocomplete")).sendKeys("Test");
		//className
//		boolean displayStatus= driver.findElement(By.className("logoClass")).isDisplayed();
//		System.out.println(displayStatus);
		
		//linktext & partialLinkText
		// By.linkText  ---  By.partialLinkText
		
		// find multiple elements using 'tagname' and 'classname'
//		List<WebElement> headerLinks= driver.findElements(By.id("product"));
//		System.out.println("Total no of header links: "+ headerLinks.size());
	
		// tagname
//		List<WebElement> links= driver.findElements(By.tagName(""));
//		System.out.println(links.size());
		 
//		List<WebElement> images= driver.findElements(By.tagName("img"));
//		System.out.println(images.size());
		
		driver.findElement(By.id("checkBoxOption1")).click();
		

		
		
		
	}

}
