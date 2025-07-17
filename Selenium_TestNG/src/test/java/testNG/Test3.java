package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test3 {

	@Test
	public void webLogin() {
		// selenium
		System.out.println("Web login car");
	}

	@Test
	public void mobileLogin1() {
		// appium
		System.out.println("Mobile login car");
	}

	@Test
	public void mobileLogin2() {
		// appium
		System.out.println("Mobile login car");
	}

	@BeforeClass
	public void beforeclass() {
		System.out.println("before executing any method in the class");
	}

	@AfterClass
	public void afterclass() {
		System.out.println("after executing all methods in the class");
	}

	@BeforeSuite
	public void beforesuit() {
		// appium
		System.out.println("Test 1(Before suit)");
	}

	@BeforeMethod
	public void beforemethod() {
		System.out.println("execute in test 3 before every method (BeforeMethod)");
	}

	@AfterMethod
	public void aftermethod() {
		System.out.println("execute after each method in this class (AfterMethod)");
	}

	@Test(dataProvider= "getData")
	public void APILohin(String username, String password) {
		// rest api automation
		System.out.println("API login car");
		System.out.println(username + password );
	}

	@DataProvider
	public Object[][] getData() {
		// combination 1- username password
		// 2- username password --no credit history
		// 3- username password --fraud history
		
		Object[][] data = new Object[3][2];
		
		// 1st row
		data[0][0] = "name1";
		data[0][1] = "password1";
		
		// 2nd row
		data[1][0] = "name2";
		data[1][1] = "password2";
		
		// 3rd row
		data[2][0] = "name3";
		data[2][1] = "password3";
		
		return data;
	}
}
