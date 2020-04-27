package com.mockandjunit;

import static org.mockito.Mockito.*;
import static org.junit.Assert.assertEquals;
// Verify ensures whether a mock method is being called with the required arguments or not 
//import static org.mockito.Mockito.verify;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

// Use JUnit and Mockito together
// @RunWith = attaches a runner with the test class to initialise the test data

@RunWith(MockitoJUnitRunner.class)
public class CalculatorTester {

	// @InjectMocks = create and inject the mock object
	@InjectMocks
	Calculator calc = new Calculator();

	// @Mock = create and mock objects to be injected
	@Mock
	CalculatorService calcService;

	@Test
	public void testAdd() {
		/*
		 * Mockito adds a functionality to a mock object using the methods when().
		 */

//		// add the behaviour of calcService to add two numbers
//		when(calcService.add(10.0, 20.0)).thenReturn(30.00);
//
//		// Test the add functionality
//		assertEquals(calcService.add(10.00,20.00), 30.00,0);
//
//		// verify call to calcService is made with same arguments.
//		verify(calcService).add(10.0, 20.0);

		// __________________________________________________________

		/*
		 * Mockito can ensure whether a mock method is being called with required
		 * arguments or not. It is done using the verify() method
		 */

//		when(calcService.add(10.0, 20.0)).thenReturn(30.00);
//		assertEquals(calcService.add(10.00,20.00), 30.00,0);
//
//		verify(calcService.add(20.0, 30.0));

		/*
		 * This will cause an error: testAdd(com.mockandjunit.CalculatorTester):
		 * Argument passed to verify() is of type Double and is not a mock! Make sure
		 * you place the parenthesis correctly! See the examples of correct
		 * verifications: verify(mock).someMethod(); verify(mock,
		 * times(10)).someMethod(); verify(mock, atLeastOnce()).someMethod(); false
		 */

		// __________________________________________________________

		/*
		 * Mockito provides a special check on the number of calls that can be made on a
		 * particular method. Suppose Calculator should call the
		 * CalculatorService.serviceUsed() method only once, then it should not be able
		 * to call CalculatorService.serviceUsed() more than once.
		 */

//		when(calcService.add(10.0, 20.0)).thenReturn(30.00);
//		when(calcService.sub(20.0, 10.0)).thenReturn(10.0);
//
//		assertEquals(calc.add(10.0, 20.0), 30.0, 0);
//		assertEquals(calc.add(10.0, 20.0), 30.0, 0);
//		assertEquals(calc.add(10.0, 20.0), 30.0, 0);
//		assertEquals(calc.add(10.0, 20.0), 30.0, 0);
//
//		// test the subtract functionality
//		assertEquals(calc.sub(20.0, 10.0), 10.0, 0);
//
//		// default call count = 1
//		verify(calcService).sub(20.0, 10.0);
//
//		// check if add function is called 4 times
//		verify(calcService, times(4)).add(10.0, 20.0);
//
//		// verify that method multiply was never called on a mock
//		verify(calcService, never()).mult(10.0, 20.0);

		// __________________________________________________________

		/*
		 * Mockito provides additional methods to vary the expected call counts
		 * atLeast(int min) - expects a minimum call atLeastOnce() - expects atleast one
		 * call atMost(int max) - expects maximum call
		 */

//		// add the behavior of calc service to add two numbers
//		when(calcService.add(10.0, 20.0)).thenReturn(30.00);
//
//		// add the behavior of calc service to subtract two numbers
//		when(calcService.sub(20.0, 10.0)).thenReturn(10.00);
//
//		// test the add functionality
//		assertEquals(calc.add(10.0, 20.0), 30.0, 0);
//		assertEquals(calc.add(10.0, 20.0), 30.0, 0);
//		assertEquals(calc.add(10.0, 20.0), 30.0, 0);
//
//		// test the subtract functionality
//		assertEquals(calc.sub(20.0, 10.0), 10.0, 0.0);
//
//		// check a minimum 1 call count
//		verify(calcService, atLeastOnce()).sub(20.0, 10.0);
//
//		// check if add function is called minimum 2 times
//		verify(calcService, atLeast(2)).add(10.0, 20.0);
//
//		// check if add function is called maximum 3 times
//		verify(calcService, atMost(3)).add(10.0, 20.0);
	}
}