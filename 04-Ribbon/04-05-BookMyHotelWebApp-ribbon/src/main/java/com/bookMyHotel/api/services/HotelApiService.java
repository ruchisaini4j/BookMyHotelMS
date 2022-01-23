package com.bookMyHotel.api.services;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.bookMyHotel.model.Registration;



@Service
public class HotelApiService{
	
	@Autowired
	RestTemplate restTemplate;
	
	
	String baseUri = "http://hotel-service";

	
	
	public List<String> getHotelDetails(String hotelId) {
		
		
		
		String url = baseUri+"/api/hotels/"+hotelId;
		System.out.println(url);
		
		ResponseEntity<List<String>> result = 
				restTemplate.exchange(url,HttpMethod.GET,null,new ParameterizedTypeReference<List<String>>(){});
		
		return result.getBody();
	}



}
