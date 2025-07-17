package seleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		
		driver.findElement(By.xpath("//div[@id='content'//a[@href='dropdown']]")).click();
		
		driver.findElement(By.xpath("//div[@class='example']/select[@id='dropdown']")).click();
		
		

	}

}
