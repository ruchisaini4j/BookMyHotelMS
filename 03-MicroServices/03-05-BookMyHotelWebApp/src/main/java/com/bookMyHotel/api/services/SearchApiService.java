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

import com.bookMyHotel.model.Search;



@Service
public class SearchApiService extends ApiService{
	
	@Autowired
	RestTemplate restTemplate;
	
	public List<String> getListOfSpecificHotels(Search search) {
		
	
		URI baseUri = getInstance("search-service");
		String url = baseUri+"/api/search";
		System.out.println(url);
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_XML);   

		HttpEntity<Search> request = 
				new HttpEntity<>(search, headers);
		
		
		
		ResponseEntity<List<String>> result = restTemplate.exchange(url,HttpMethod.POST,request,new ParameterizedTypeReference<List<String>>(){});
		
	

		return result.getBody();
		
		
	}



}
