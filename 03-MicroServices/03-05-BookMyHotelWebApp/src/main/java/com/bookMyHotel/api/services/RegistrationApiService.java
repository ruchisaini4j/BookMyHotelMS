package com.bookMyHotel.api.services;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.bookMyHotel.model.Login;
import com.bookMyHotel.model.Registration;



@Service
public class RegistrationApiService extends ApiService{
	
	@Autowired
	RestTemplate restTemplate;

	
	public String addCustomerRegistration(Registration registration)
	{
		
		
		URI baseUri = getInstance("registration-service");
		String url = baseUri + "/api/registrations";
		System.out.println(url);
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_XML);   

		HttpEntity<Registration> request = 
				new HttpEntity<>(registration, headers);
		
		String result = restTemplate.postForObject(url,request,String.class);
	  
		
		return result;
	}
	
	public List<String> getRegistrationDetails(String registrationId) {
		
		URI baseUri = getInstance("registration-service");
		String url = baseUri + "/api/registrations"+"/"+registrationId;
	
		System.out.println(url);
		
		
		
		ResponseEntity<List<String>> result = 
				restTemplate.exchange(url,HttpMethod.GET,null,new ParameterizedTypeReference<List<String>>(){});
		
		return result.getBody();
	}
	
	
	public String checkLoginDetails(Login login)
	{
		
		
		
		URI baseUri = getInstance("registration-service");
		String url = baseUri+"/api/registrations";
		System.out.println(url);
		
		UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(url)
		        .queryParam("loginId", login.getRegistrationId())
		        .queryParam("password", login.getPassword());

		
		
		ResponseEntity<String> result = 
				restTemplate.exchange(builder.toUriString(),HttpMethod.GET,null,String.class);
		
		return result.getBody(); 
		
	}
	



}
