package com.TestNG_Framework;

import org.testng.annotations.Test;

public class TestNG_Test {

	//-3,-2,-1,0,1,2,3

	@Test
	private void activities() throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.out.println("Done");
	}

	@Test (expectedExceptions = ArithmeticException.class)
	private void lunch() {
		int a = 1;
		int b = 0;
		System.out.println(a/b);
	}

	@Test(groups = "food")
	private void snakes() {
		// TODO Auto-generated method stub 
		System.out.println("chips---3");
	}

}