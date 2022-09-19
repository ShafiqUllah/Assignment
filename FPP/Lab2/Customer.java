package SepSix;

import java.util.Date;

import SepSix.*;



public class Customer {
	static final String IMPORTANT_FIRST = "Boss";
	static final String IMPORTANT_LAST =  "Jones";
	static final String IMPORTANT_SSN = "000000";
	
	// instance fields
	private String firstName, lastName, socSecurityNum;
	private Address billingAddress;
	public Address getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(Address billingAddress) {
		this.billingAddress = billingAddress;
	}

	public Address getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(Address shippingAddress) {
		this.shippingAddress = shippingAddress;
	}




	private Address shippingAddress;
	

	
	
	public Customer() {
		// TODO Auto-generated constructor stub
		this(IMPORTANT_FIRST, IMPORTANT_LAST, IMPORTANT_SSN);
	}

	public Customer(String firstName, String lastName, String socSecurityNum) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.socSecurityNum = socSecurityNum;
	}
	
	public String toString() {
		//return "[Joe, Smith, ssn: 332-221-4444]
		return "[" + firstName + ", " + lastName +", "+ "ssn: " + socSecurityNum + "]";
	}




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




	public String getSocSecurityNum() {
		return socSecurityNum;
	}




	public void setSocSecurityNum(String socSecurityNum) {
		this.socSecurityNum = socSecurityNum;
	}


}
