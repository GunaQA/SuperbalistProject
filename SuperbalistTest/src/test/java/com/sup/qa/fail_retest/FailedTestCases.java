package com.sup.qa.fail_retest;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class FailedTestCases implements IRetryAnalyzer{
	int min=0,max=2;

	public boolean retry(ITestResult result) {
		if(min<max) {
			min++;
			return true;
		}
		
		return false;
	}


}
