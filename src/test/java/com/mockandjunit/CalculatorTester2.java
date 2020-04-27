package com.mockandjunit;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.*;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CalculatorTester2 {

	private Calculator calc; 
	private CalculatorService cs; 
	
	@Before
	public void setUp() {
		calc = new Calculator(); 
		cs = mock(CalculatorService.class);
		calc.setCalculatorService(cs);
	}
	
	@Test
	public void testAddandSub() {
		when(cs.add(20.0,10.0)).thenReturn(30.0);
		when(cs.sub(20.0,10.0)).thenReturn(10.0);
		
		assertEquals(calc.add(20.0,10.0),30.0,0);
		assertEquals(calc.sub(20.0,10.0),10.0,0);
		
		verify(cs).add(20.0,10.0);
		verify(cs).sub(20.0,10.0);
		
	}
	
	
}
