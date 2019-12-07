package q2;

public class Address {
	private String city;
	private int zone;
	private String street;
	private int postalCode;

	// ------------------------------------------------
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getZone() {
		return zone;
	}

	public void setZone(int zone) {
		this.zone = zone;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}
	
	
	
	public Address() {
		super();
	}

	public Address(String city, String street, int zone, int postalCode) {
		super();
		this.city = city;
		this.zone = zone;
		this.street = street;
		this.postalCode = postalCode;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
