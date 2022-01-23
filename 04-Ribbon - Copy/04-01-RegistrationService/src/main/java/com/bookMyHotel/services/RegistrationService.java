package com.bookMyHotel.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookMyHotel.dao.RegistrationDAO;
import com.bookMyHotel.model.Registration;

@Service
public class RegistrationService {
	
	@Autowired 
	RegistrationDAO dao;

	


	
	
	public String addCustomerRegistration(Registration registration) {
		
		return dao.addLoginDetails(registration);
		
	
	}

	
	public List<String> getRegistrationDetails(String registrationId) {
		
		return dao.getRegistrationDetails(registrationId);
		
	}
	
	public String checkLoginDetails(String loginId,String password)
	{
		return dao.checkLoginDetails(loginId,password);
	}
	
	
	
}
