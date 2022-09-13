package com.TestNG_Framework;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.util.RetryAnalyzerCount;

public class Test_Validation {

	@Test(retryAnalyzer = Iretry_analyser.class)
	private void cred() {
		// TODO Auto-generated method stub
		String db_user="mani";
		String act_user="manii";
		
		Assert.assertEquals(act_user, db_user);
		
		System.out.println("This Method executed at "+Thread.currentThread().getId());
		
	}
}
