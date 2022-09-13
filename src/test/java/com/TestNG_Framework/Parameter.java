package com.TestNG_Framework;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter {

	@Test
	@Parameters({ "username", "password" })
	public void data_Input(@Optional("mani")String username, int password) {
		// TODO Auto-generated method stub
		System.out.println("username is = " + username);
		System.out.println("password is = " + password);
	}
}
