package com.bookMyHotel.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.bookMyHotel.model.Login;
import com.bookMyHotel.model.Registration;

@Repository
public class RegistrationDAO {
	
	static private List<String> customerRegistration1 = new ArrayList<String>();
	static private List<String> customerRegistration2 = new ArrayList<String>();

	
	static private HashMap<String,List<String>> allRegs = new HashMap<>();
	
	static HashMap<String,String> logins = new HashMap<>();
	static
	{
		logins.put("cr1","pass");
		logins.put("cr2","pass");
	
		customerRegistration1.add("CustomerRegistrationId - cr1");
		customerRegistration1.add("CustomerName - Ruchi");
		customerRegistration1.add("Title - Ms");
		customerRegistration1.add("Address - Noida");
		customerRegistration1.add("CreditCardNumber - 1234");


		customerRegistration2.add("CustomerRegistrationId - cr2");
		customerRegistration2.add("CustomerName - Dev");
		customerRegistration2.add("CustomerName - Mr");
		customerRegistration2.add("Address - Delhi");
		customerRegistration2.add("CreditCardNumber - 5555");


		
		allRegs.put("cr1", customerRegistration1);
		allRegs.put("cr2", customerRegistration2);
	
		
	}

	public List<String> getRegistrationDetails(String registrationId)
	{
		return allRegs.get(registrationId);
	}

	public String addCustomerRegistration(Registration registration)
	{
		String registrationId = registration.getCustomerRegId();
		
	    List<String> customerRegistrationNew = new ArrayList<String>();
	    customerRegistrationNew.add("CustomerRegistrationId - "+registrationId);
	    customerRegistrationNew.add("CustomerName - " + registration.getCustomerName());
	    customerRegistrationNew.add("Title - " + registration.getTitle());
	    customerRegistrationNew.add("Address - " + registration.getAddress());
	    customerRegistrationNew.add("CreditCardNumber - " + registration.getCreditCardNumber());
	    
		allRegs.put(registrationId, customerRegistrationNew);
		
		String status = "Customer Registered , your registration id is " + registrationId;
		return status;
	}
	
	public String addLoginDetails(Registration registration)
	{
		 String loginId = registration.getCustomerRegId();
		 logins.put(loginId,registration.getPassword());
		 addCustomerRegistration(registration);
		 return "Customer Registered with registrationId " + loginId;
	}
	
	public String checkLoginDetails(String loginId,String password)
	{
	
		if(logins.containsKey(loginId))
		{
			String storedPassword = logins.get(loginId);
			if(!password.equals(storedPassword))
				return "Incorrect Password";
			else 
				return "Login Success";
		}
		else
		{
			return "Incorrect Login Id";
		}
			
	}


}
