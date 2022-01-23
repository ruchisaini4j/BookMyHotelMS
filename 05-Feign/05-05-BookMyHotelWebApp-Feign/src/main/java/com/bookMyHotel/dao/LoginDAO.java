package com.bookMyHotel.dao;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;





@Repository
public class LoginDAO {
	
	static HashMap<String,String> logins = new HashMap<>();
	static
	{
		logins.put("cr1","ruchipass");
		logins.put("cr2","devpass");
	}
	
	public String addLoginDetails(String loginId,String password)
	{
		 logins.put(loginId,password);
		 return "Customer Registered with registrationId " + loginId;
	}
	
	public String checkLoginDetails(String loginId,String password)
	{
		String storedPassword = logins.get(loginId);
		if(storedPassword == null)
			return "Incorrect Login";
		else if(!password.equals(storedPassword))
			return "Incorrect Password";
		else 
			return "Login Success";
		
	}

}
