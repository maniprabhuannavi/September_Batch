package com.TestNG_Framework;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Depends_On {

	@Test
	private void Tenth() {
		// TODO Auto-generated method stub
		System.out.println("10th");
	}

	@Test(dependsOnMethods = "Tenth")
	private void twelth() {
		// TODO Auto-generated method stub
		System.out.println("12th");
	}

	@Test(dependsOnMethods = "twelth")
	private void clg() {
		// TODO Auto-generated method stub
		System.out.println("college");
	}
}
