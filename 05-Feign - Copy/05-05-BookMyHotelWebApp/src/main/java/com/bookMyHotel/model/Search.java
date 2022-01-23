package com.bookMyHotel.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="search")
public class Search {
	
	private String city;
	private String state;
	private String country;
	private String registrationId;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getRegistrationId() {
		return registrationId;
	}
	public void setRegistrationId(String registrationId) {
		this.registrationId = registrationId;
	}
	
	

}
