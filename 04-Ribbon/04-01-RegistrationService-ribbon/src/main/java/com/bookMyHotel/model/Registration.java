package com.bookMyHotel.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="registration")
public class Registration {
	String customerRegId;
	String customerName;
	String title;
	String address;
	String creditCardNumber;
	String password;
	
	public List<String> getCustomerAsList()
	{
		List<String> customerDetails = new ArrayList<>();
		customerDetails.add(customerRegId);
		customerDetails.add(customerName);
		customerDetails.add(title);
		customerDetails.add(address);
		customerDetails.add(creditCardNumber);
		customerDetails.add(password);
		return customerDetails;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCustomerRegId() {
		return customerRegId;
	}
	public void setCustomerRegId(String customerRegId) {
		this.customerRegId = customerRegId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCreditCardNumber() {
		return creditCardNumber;
	}
	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}
	
	
	

}
