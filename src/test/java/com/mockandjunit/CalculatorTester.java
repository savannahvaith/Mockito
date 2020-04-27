package com.mockandjunit;

import static org.mockito.Mockito.when;
import static org.junit.Assert.assertEquals;
// Verify ensures whether a mock method is being called with the required arguments or not 
import static org.mockito.Mockito.verify;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;


// Use JUnit and Mockito together
// @RunWith = attaches a runner with the test class to initialise the test data

@RunWith(MockitoJUnitRunner.class)
public class CalculatorTester {

	//@InjectMocks = create and inject the mock object
	@InjectMocks
	Calculator calc = new Calculator(); 
	
	//@Mock = create and mock objects to be injected
	@Mock
	CalculatorService calcService; 
	
	@Test
	public void testAdd() {
		//add the behaviour of calcService to add two numbers
		when(calcService.add(10.0, 20.0)).thenReturn(30.00);
		
		// Test the add functionality
		assertEquals(calcService.add(10.00,20.00), 30.00,0);
		
		//verify call to calcService is made with same arguments or not.
		verify(calcService).add(10.0, 20.0);
	}
	
}
