package com.bookMyHotel.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookMyHotel.dao.HotelDAO;

@Service
public class HotelService {
	
	@Autowired 
	HotelDAO dao;
	
	
	
	
	
	public List<String> getHotelDetails(String hotelId) {
		
		return dao.getHotelDetails(hotelId);
	}
	
	public String addHotel(String hotelId,List<String> hotelDetails)
	{
		return dao.addHotel(hotelId, hotelDetails);
	}


	

}
