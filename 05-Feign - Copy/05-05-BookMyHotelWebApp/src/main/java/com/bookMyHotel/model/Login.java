package com.bookMyHotel.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="login")
public class Login {
	
	String registrationId;
	String password;
	public String getRegistrationId() {
		return registrationId;
	}
	public void setRegistrationId(String registrationId) {
		this.registrationId = registrationId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
