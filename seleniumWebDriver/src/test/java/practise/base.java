package practise;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class base {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		String[] itemsNeeded = { "Cucumber", "Brocolli", "Tomato", "Beetroot" };

		// implicit wait
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
//		base b= new base();  // creating object of the class
//		b.addItems(driver, itemsNeeded); //calling method

		addItems(driver, itemsNeeded); // method can be called without creating an object if the method is static

		driver.findElement(By.xpath("//a[@class='cart-icon']/img")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		w.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='promoCode']")))
				.sendKeys("rahulshettyacademy");
		// driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//button[@class='promoBtn']")).click();

		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//span[@class='promoInfo']")));
		System.out.println(driver.findElement(By.xpath("//span[@class='promoInfo']")).getText());

	}

	public static void addItems(WebDriver driver, String[] itemsNeeded) {

		List<WebElement> products = driver.findElements(By.tagName("h4"));
		for (int i = 0; i < products.size(); i++) {

			// format name of product to get actual name in array
			String[] name = products.get(i).getText().split("-");
			String formattedName = name[0].trim();

			// convert array into array list for easy search
			List itemsNeededList = Arrays.asList(itemsNeeded);

			int j = 0;
			if (itemsNeededList.contains(formattedName)) {
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

				if (j == itemsNeededList.size())
					break;
			}
		}
	}
}
