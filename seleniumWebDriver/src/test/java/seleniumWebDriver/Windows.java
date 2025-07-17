package seleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows {

	public static void main(String[] args) {

		WebDriver driver= new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/windows");
		
		driver.findElement(By.xpath("//div[@class='example']//a")).click();
//		String currentHandle= driver.getWindowHandle();
//		System.out.println(currentHandle);
		
		// window handles
		Object[] windowHandles= driver.getWindowHandles().toArray();
		driver.switchTo().window((String)windowHandles[0]);
		System.out.println(driver.getTitle());
		
		
	}

}
