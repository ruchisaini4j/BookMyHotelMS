package com.bookMyHotel.api.services;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.bookMyHotel.model.Booking;
import com.bookMyHotel.model.Registration;



@Service
public class BookingApiService {
	
	@Autowired
	RestTemplate restTemplate;
	
	String baseUri = "http://booking-service";
	
	public String addBookingInHotel(String registrationId,Booking booking)
	{
		
		String url = baseUri+"/api/registrations/"+ registrationId + "/bookings";
		System.out.println(url);
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_XML);   

		HttpEntity<Booking> request = 
				new HttpEntity<>(booking, headers);
		
		String result = restTemplate.postForObject(url,request,String.class);
	  
		
		return result;
	}
	
	public List<String> getBookingDetails(String registrationId,String bookingId)
	{
		
		String url = baseUri  + "/api/registrations/"+registrationId+"/bookings/"+bookingId;
		
		System.out.println(url);
		
		ResponseEntity<List<String>> result = 
				restTemplate.exchange(url,HttpMethod.GET,null,new ParameterizedTypeReference<List<String>>(){});
		
		return result.getBody();
	}
	
	public List<String> getBookingIds(String registrationId)
	{

		String url = baseUri+"/api/registrations/"+ registrationId + "/bookings";
		System.out.println(url);
		
		ResponseEntity<List<String>> result = 
				restTemplate.exchange(url,HttpMethod.GET,null,new ParameterizedTypeReference<List<String>>(){});
		
		return result.getBody();
	}
	
	


}
