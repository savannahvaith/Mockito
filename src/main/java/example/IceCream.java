package example;

public class IceCream {
	
	private String flavour; 
	private int coldness; 
	
	public IceCream(String flavour, int coldness) {
		this.flavour = flavour; 
		this.coldness = coldness; 
	}
	// Getters and Setters

	public String getFlavour() {
		return flavour;
	}

	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}

	public int getColdness() {
		return coldness;
	}

	public void setColdness(int coldness) {
		this.coldness = coldness;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + coldness;
		result = prime * result + ((flavour == null) ? 0 : flavour.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		IceCream other = (IceCream) obj;
		if (coldness != other.coldness)
			return false;
		if (flavour == null) {
			if (other.flavour != null)
				return false;
		} else if (!flavour.equals(other.flavour))
			return false;
		return true;
	}
	
	

}
