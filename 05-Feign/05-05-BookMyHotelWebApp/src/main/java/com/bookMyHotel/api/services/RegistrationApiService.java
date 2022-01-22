package com.bookMyHotel.api.services;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.bookMyHotel.model.Registration;

@FeignClient(name="registration-service")
public interface RegistrationApiService {
	
	
	@PostMapping(path="/api/registrations",produces="application/xml",consumes="application/xml")
	public  String addCustomerRegistration(@RequestBody Registration registration);
	
	@GetMapping(path="/api/registrations",produces="application/xml")
	public String checkLoginDetails(@RequestParam String loginId, @RequestParam String password);
	
	@GetMapping(path="/api/registrations/{registrationId}",produces="application/xml")
	public  List<String> getRegistrationDetails(@PathVariable("registrationId") String registrationId);

}
