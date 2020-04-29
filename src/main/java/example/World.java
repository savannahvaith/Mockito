package example;

public class World {

	private IceCreamVan icv; 
	public World() {}
	public World(IceCreamVan icv) {
		this.icv = icv;
	}
	
	public IceCream goToIceCreamVan() {		
		IceCream iscream = icv.makeVanillaIceCream();
		iscream.setColdness(iscream.getColdness()-1);
		return iscream; 
		
	}

	
	
}
