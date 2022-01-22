package com.bookMyHotel.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.bookMyHotel.model.Search;
import com.bookMyHotel.services.SearchHotelService;

@RestController
public class SearchApiController {
	
	//Search Hotels
	
	@Autowired
	SearchHotelService searchHotelService;

	
	
	
	@PostMapping(path="/api/search",produces="application/xml",consumes="application/xml")
	@ResponseStatus(value=HttpStatus.OK)
	public List<String> getListOfSpecificHotels(@RequestBody Search search) {
		
		return searchHotelService.getListOfSpecificHotels(search);
	}

	

}
