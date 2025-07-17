package prac;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AddToCart {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		WebElement element= driver.findElement(By.className("search-button"));
		System.out.println(element.getAttribute("type"));
		System.out.println(element.getTagName());
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[1]/div[3]")).click();
		//driver.findElement(By.xpath("//div[@class='stepper-input']//a[@xpath='1']")).click();
		driver.findElement(By.xpath("//a[@class='cart-icon']/img")).click();
		driver.findElement(By.xpath("//button[normalize-space()='PROCEED TO CHECKOUT']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Place Order']")).click();
		
		
		WebElement ddown= driver.findElement(By.tagName("select"));
		Select select= new Select(ddown);
		select.selectByValue("Algeria");
		
		WebElement element1= driver.findElement(By.className("chkAgree"));
		element1.click();
		System.out.println(element1.isSelected());
		System.out.println(element1.isEnabled());
		System.out.println(element1.isDisplayed());
		
		driver.findElement(By.tagName("button")).click();
		/*
		System.out.println(driver.getPageSource());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getWindowHandle());
		*/
		driver.quit();
	}

}
