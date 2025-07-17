package testNG;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test1 {

	@Test(dependsOnMethods = "secondTest")
	public void firstTest() {
		System.out.println("Hi");
	}
	@Parameters({"URL", "username"})
	@Test
	public void secondTest(String urlname, String username) {
		System.out.println("Good");
		System.out.println(urlname);
		System.out.println(username);
	}
	
	@Test(enabled = false)
	public void thirdTest() {
		System.out.println("Good");
	}
	
	@Test(timeOut = 4000)
	public void fourthTest() {
		System.out.println("Good");
	}
	
	@AfterSuite
	public void aftersuit() {
	System.out.println("Last test(AfterSuit)");
	}
}
