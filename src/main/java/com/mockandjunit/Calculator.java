package com.mockandjunit;

// Base class
public class Calculator {

	private CalculatorService calcService; 
	public void setCalculatorService(CalculatorService calcService) {
		this.calcService = calcService; 
	}
	public double add(double arg1, double arg2) {
//		return calcService.add(arg1, arg2);
		return arg1 + arg2;
	}
	public double sub(double arg1, double arg2) {
		return calcService.sub(arg1, arg2);
	}
	
	public double div(double arg1, double arg2) {
		return calcService.div(arg1, arg2);
	}
	public double mult(double arg1, double arg2) {
		return calcService.mult(arg1, arg2);
	}
	
}
