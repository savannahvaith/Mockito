package com.mockandjunit;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import static org.mockito.BDDMockito.*;

import org.junit.*;
import org.junit.runner.RunWith;
import org.mockito.InOrder;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.runners.MockitoJUnitRunner;
import org.mockito.stubbing.Answer;

@RunWith(MockitoJUnitRunner.class)
public class CalculatorTester2 {

	private Calculator calc;
	private CalculatorService cs;

	@Before
	public void setUp() {
		calc = new Calculator();
		cs = mock(CalculatorService.class);
//		MathApplication mapp = new MathApplication(); 
//		cs = spy(mapp);
		calc.setCalculatorService(cs);
	}

//	@Test
//	public void testAddandSub() {
//		when(cs.add(20.0,10.0)).thenReturn(30.0);
//		when(cs.sub(20.0,10.0)).thenReturn(10.0);
//		
//		assertEquals(calc.add(20.0,10.0),30.0,0);
//		assertEquals(calc.sub(20.0,10.0),10.0,0);
//		
//		verify(cs).add(20.0,10.0);
//		verify(cs).sub(20.0,10.0);
//		
//	}

	/*
	 * -----------------------------------------------------------------------------
	 * ------------------- Mockito provides inorder class which takes care of the
	 * order of method calls that the mock is going to make in due course of its
	 * action:
	 */

//	@Test
//	public void testAddAndSub() {
//		when(cs.add(20.0,10.0)).thenReturn(30.0);
//		when(cs.sub(20.0,10.0)).thenReturn(10.0);
//		
//		assertEquals(calc.add(20.0,10.0),30.0,0);
//		assertEquals(calc.sub(20.0,10.0),10.0,0);
//		
//		verify(cs).add(20.0,10.0);
//		verify(cs).sub(20.0,10.0);
//		
////		create an inOrder verifier for a single mock 
//		InOrder inOrder = inOrder(cs);
//		inOrder.verify(cs).sub(20.0, 10.0);
//		inOrder.verify(cs).add(20.0,10.0);
//		
//		/* 
//		 * This will throw an error because we are expecting the add feature FIRST 
//		 * Verification in order failure
//		 * Wanted but not invoked: calculatorService.add(20.0, 10.0);
//		 * 
//		 */
//	}

	/*
	 * -----------------------------------------------------------------------------
	 * ------------------- Mockito provides a Answer interface which allows stubbing
	 * with generic interface.
	 */

//	@Test
//	public void testAdd() {
//		when(cs.add(20.0, 10.0)).thenAnswer(new Answer<Double>() {
//
//			public Double answer(InvocationOnMock invocation) throws Throwable {
//				// TODO Auto-generated method stub
//				Object[] args = invocation.getArguments();
//
//				// get the mock
//				Object mock = invocation.getMock();
//
//				// return the result
//				return 30.0;
//			}
//		});
//		
//		assertEquals(calc.add(20.0,10.0),30.0,0);
//	}
	
	
	/* -----------------------------------------------------------------------------
	 * -------------------
	 * Mockito provides option to create spy on real objects. 
	 * When spy is called, then actual method of real object is called.
	 */
	
//	@Test
//	public void testAdd() {
//		// Perform operation on real obj
//		// Test the add functionality 
//		assertEquals(calc.add(20.0, 10.0),30.0,0);
//	}
//	
//	class MathApplication implements CalculatorService{
//
//		public double add(double arg1, double arg2) {
//			return arg1 + arg2; 
//			
//		}
//
//		public double sub(double arg1, double arg2) {
//			throw new UnsupportedOperationException("Method not implemented yet!");
//		}
//
//		public double div(double arg1, double arg2) {
//			throw new UnsupportedOperationException("Method not implemented yet!");
//		}
//
//		public double mult(double arg1, double arg2) {
//			throw new UnsupportedOperationException("Method not implemented yet!");
//		}
//		
//	}
	
	/* -----------------------------------------------------------------------------
	 * -------------------
	 * Mockito provides the capability to reset a mock so that it can be reused later.
	 * 
	 */
//	@Test
//	public void testAddAndSub() { 
//		when(cs.add(20.0, 10.0)).thenReturn(30.0);
//		assertEquals(calc.add(20.0, 10.0),30.0,0);
//		//reset the mock 
//		reset(cs);
//		//test the add functionality after resetting the mock
//		assertEquals(calc.add(20.0, 10.0),30.0,0);
//		
//	/*
//	 * Here we've reset mock object. Calc makes use of calcService and after reset the mock,
//	 * using mocked method will fail the test.
//	 */
//	}
	
	/* -----------------------------------------------------------------------------
	 * -------------------
	 * BDD is a style of writing test using given, when, then format as test methods.
	 * 
	 */
	@Test
	public void testAdd() {
		//Given
		given(cs.add(20.0, 10.0)).willReturn(30.0);
		
		//When
		double result = cs.add(20.0, 10.0);
		
		// then 
		assertEquals(result,30.0,0);
	}
	
}
