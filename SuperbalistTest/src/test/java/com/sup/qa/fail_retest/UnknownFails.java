package com.sup.qa.fail_retest;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;

public class UnknownFails implements IAnnotationTransformer{

	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		IRetryAnalyzer retryAnalyzer = annotation.getRetryAnalyzer();
		
		if (retryAnalyzer==null) {
			annotation.setRetryAnalyzer(FailedTestCases.class);
			
		}
	}
	
	

}
