package com.bookMyHotel.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookMyHotel.dao.SearchHotelDAO;
import com.bookMyHotel.model.Search;

@Service
public class SearchService{
	
	@Autowired 
	SearchHotelDAO dao;
	

	
	
	public List<String> getListOfSpecificHotels(Search search) {
		
		return dao.getListOfSpecificHotels(search);
	}

	
	
}
