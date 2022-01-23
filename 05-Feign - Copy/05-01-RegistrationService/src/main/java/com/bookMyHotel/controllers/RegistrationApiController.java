package com.bookMyHotel.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bookMyHotel.model.Registration;
import com.bookMyHotel.services.RegistrationService;

@RestController
public class RegistrationApiController {
	
	@Autowired
	RegistrationService registrationService;
	
	
	@PostMapping(path="/api/registrations",produces="application/xml",consumes="application/xml")
	public  String addCustomerRegistration(@RequestBody Registration registration) {
		return registrationService.addCustomerRegistration(registration);
	}
	
	@GetMapping(path="/api/registrations",produces="application/xml")
	public String checkLoginDetails(@RequestParam String loginId, @RequestParam String password)
	{
		System.out.println("Registration Details : Login Details Checked");
		return registrationService.checkLoginDetails(loginId,password);
	}


	
	@GetMapping(path="/api/registrations/{registrationId}",produces="application/xml")
	public  List<String> getRegistrationDetails(@PathVariable("registrationId") String registrationId) {
		System.out.println("Registration Details : Get Registration Details");
		
		return registrationService.getRegistrationDetails(registrationId);
		
	}
	
	
	

}
