package testNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test2 {
	
	@Parameters({"URL", "username"})
	@Test
	public void lastexecution(String urlname, String username)
	{
		System.out.println("Last test (AFterTest)");
		System.out.println(urlname);
		System.out.println(username);
	}
	@Test(groups = "smoke")
	public void demo() {
		System.out.println("Hello");
	}

	@BeforeTest
	public void prerequisite() {
		System.out.println("Before test");
	}
}
