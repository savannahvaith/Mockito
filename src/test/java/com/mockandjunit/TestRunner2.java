package com.mockandjunit;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

// Java Class to execute test case(s)
public class TestRunner2 {

	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(CalculatorTester2.class); 
		
		for(Failure failure: result.getFailures()) {
			System.out.println(failure.toString());
		}
		System.out.println(result.wasSuccessful());
		
	}
	
	
}
