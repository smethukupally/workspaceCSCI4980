package model;

public class MyPerson {
	private String firstName;
	private String lastName;
	private String address;
	private String phone;
	

	public MyPerson(String firstName, String lastName, String address, String phone) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.phone = phone;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String getPhone() {
		return phone;
	}
	

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}



	@Override
	public String toString() {
		return firstName + " " + lastName;
	}

	
}