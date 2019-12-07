package q2;

public class Person {
	private String firstName;
	private String lastName;
	private int age;
	private Address address = new Address();

//-------------------------------------------
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Address getAddress() {
		return address;
	}
	public int getlengthOfLastName() {
		return this.lastName.length();
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
