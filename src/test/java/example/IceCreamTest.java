package example;

import org.junit.Test;
import org.mockito.Mockito;

public class IceCreamTest {

	@Test
	public void GoToIceCreamVan() {
		 IceCreamVan iceCreamVan = new Mockito().mock(IceCreamVan.class);
	     Mockito.when(iceCreamVan.makeVanillaIceCream()).thenReturn("You get a vanilla Ice cream");
	}
	
}
