package seleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tables {

	public static void main(String[] args) {

		WebDriver driver= new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/tables");
		
		driver.findElement(By.xpath("//table[@id='table1']//tr/td[contains(text(), 'Frank')]/following-sibling::td//a[1]")).click();
		
		driver.findElement(By.xpath("//table[@id='table2']//tr/td[contains(text(), 'Smith')]/following-sibling::td/a[2]")).click();
		
		

	}

}
