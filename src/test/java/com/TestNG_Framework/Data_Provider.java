package com.TestNG_Framework;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider {

	@Test(dataProvider = "data_pass")
	private void user_Credentials(String username, int password) {
		// TODO Auto-generated method stub
		System.out.println("username is = " + username);
		System.out.println("password is = " + password);
	}

	// object[][]
	@DataProvider
	private Object[][] data_pass() {
		// TODO Auto-generated method stub
		return new Object[][] { 
			{ "mani", 123 }, 
			{ "neymar", 345 }, 
			{ "messi", 567 } };
	}
}
