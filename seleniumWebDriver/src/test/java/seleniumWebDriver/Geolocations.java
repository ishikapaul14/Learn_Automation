package seleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Geolocations {

	public static void main(String[] args) {

		WebDriver driver= new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[23]/a")).click();
		driver.findElement(By.tagName("button")).click();
		System.out.println("test passed");
//		driver.close();
	}

}
