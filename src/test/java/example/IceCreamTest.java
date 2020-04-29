package example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.Mockito;

public class IceCreamTest {

	@Test
	public void GoToIceCreamVan() {
		 IceCreamVan icv = new Mockito().mock(IceCreamVan.class);
//	     Mockito.when(iceCreamVan.makeVanillaIceCream()).thenReturn("You get a vanilla Ice cream"); 
	     // We need a way to test the method without testing the method it calls within
		 Mockito.when(icv.makeVanillaIceCream()).thenReturn(new IceCream("Strawberry", 8));
		 World world = new World(icv); // the thing we are mocking
		 
		 IceCream expected = new IceCream("Strawberry", 7);
		 IceCream actual = world.goToIceCreamVan();
		 
		 
		 System.out.println(expected.getFlavour()); // Strawberry
		 System.out.println(actual.getFlavour());   // Strawberry
		 System.out.println("---");	
		 System.out.println(expected.getColdness());// 7
		 System.out.println(actual.getColdness());  // 7
		 
		 assertEquals(expected, actual); // This might return the same attributed - check with ^^ 
		 // You need to override the .equals() method in the icecream class. 
		 
	}
	
}
