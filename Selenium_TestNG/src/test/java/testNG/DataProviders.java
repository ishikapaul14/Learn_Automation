package testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders {
	
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
