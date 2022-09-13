package com.TestNG_Framework;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Iretry_analyser implements IRetryAnalyzer {
	int count = 1, limit = 5;

	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		if (count <= limit) {
			count++;
			return true;
		}
		return false;
	}

}
