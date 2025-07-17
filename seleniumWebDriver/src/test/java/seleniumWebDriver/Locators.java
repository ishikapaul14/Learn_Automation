package seleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Locators {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[25]/a")).click();
		
		// hovering
		Actions action= new Actions(driver);
		WebElement element1= driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/img"));
		action.moveToElement(element1).perform();                                           
		
		//right click 
		action.contextClick().perform();
		
		
	}

}
