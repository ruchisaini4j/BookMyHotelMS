package com.bookMyHotel.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class RegistrationDAO {
	
	static private List<String> customerRegistration1 = new ArrayList<String>();
	static private List<String> customerRegistration2 = new ArrayList<String>();
	static private List<String> customerRegistration3 = new ArrayList<String>();
	
	static private HashMap<String,List<String>> allRegs = new HashMap<>();
	
	static
	{
		customerRegistration1.add("CustomerRegistrationId - cr1");
		customerRegistration1.add("CustomerName - Ruchi");
		customerRegistration1.add("Title - Ms");
		customerRegistration1.add("Address - Noida");
		customerRegistration1.add("CreditCardNumber - 1234");
		customerRegistration1.add("Password - ruchipass");

		customerRegistration2.add("CustomerRegistrationId - cr2");
		customerRegistration2.add("CustomerName - Dev");
		customerRegistration2.add("CustomerName - Mr");
		customerRegistration2.add("Address - Delhi");
		customerRegistration2.add("CreditCardNumber - 5555");
		customerRegistration2.add("Password - devpass");


		
		allRegs.put("cr1", customerRegistration1);
		allRegs.put("cr2", customerRegistration2);
	
		
	}

	public List<String> getRegistrationDetails(String registrationId)
	{
		return allRegs.get(registrationId);
	}

	public String addCustomerRegistration(String registrationId,List<String> customerDetails)
	{
		allRegs.put(registrationId, customerDetails);
		String status = "Customer Registered , your registration id is " + registrationId;
		System.out.println(status);
		System.out.println(allRegs);
		return status;
	}

}
