package seleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[10]/a")).click();
		
		WebElement drag= driver.findElement(By.xpath("//*[@id=\"column-a\"]"));
		WebElement drop= driver.findElement(By.xpath("//*[@id=\"column-b\"]"));
		
		Actions action= new Actions(driver);
		action.dragAndDrop(drag, drop).perform();
	}

}
