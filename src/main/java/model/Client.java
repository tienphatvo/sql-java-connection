package model;

import annotation.SQLEncryptedColumn;
import constant.SQLDataType;

public class Client {
	int clientID;
	@SQLEncryptedColumn(datatype = SQLDataType.CHAR)
	public String lastName;
	String firstName;
	String phone;
	String dob;
	String address;
	String city;

	public int getClientID() {
		return clientID;
	}

	public void setClientID(int clientID) {
		this.clientID = clientID;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Client [clientID=" + clientID + ", lastName=" + lastName + ", firstName=" + firstName + ", phone="
				+ phone + ", dob=" + dob + ", address=" + address + ", city=" + city + "]";
	}

}
