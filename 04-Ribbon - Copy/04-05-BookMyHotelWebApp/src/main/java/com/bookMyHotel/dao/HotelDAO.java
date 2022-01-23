package com.bookMyHotel.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class HotelDAO {
	
	static private List<String> hotel1Details = new ArrayList<String>();
	static private List<String> hotel2Details = new ArrayList<String>();
	static private List<String> hotel3Details = new ArrayList<String>();
	static private List<String> hotel4Details = new ArrayList<String>();
	static private HashMap<String,List<String>> allHotels = new HashMap<>();
	
	static
	{
		hotel1Details.add("ID -  H1");
		hotel1Details.add("Name -  Mosaic Hotel Noida");
		hotel1Details.add("Rooms -  Single Room,Double Room");
		hotel1Details.add("Rating -  5 star");
		hotel1Details.add("food - veg,non-veg");
		
		hotel2Details.add("ID -  H2");
		hotel2Details.add("Name -  Radisson Hotel Noida");
		hotel2Details.add("Rooms -  Single Room,Double Room");
		hotel2Details.add("Rating -  5 star");
		hotel2Details.add("food - veg,non-veg");
		
		hotel3Details.add("ID -  H3");
		hotel3Details.add("Name -  Hotel Park Residency Delhi");
		hotel3Details.add("Rooms -  Single Room,Double Room,Single Deluxe,Double Deluxe");
		hotel3Details.add("Rating -  5 star");
		hotel3Details.add("food - veg,non-veg");
		
		hotel4Details.add("ID -  H4");
		hotel4Details.add("Name -  Pride Plaza Hotel Delhi");
		hotel4Details.add("Rooms -  Single Deluxe,Double Deluxe");
		hotel4Details.add("Rating -  5 star");
		hotel4Details.add("food - veg,non-veg");
		
		
		allHotels.put("h1",hotel1Details);
		allHotels.put("h2",hotel2Details);
		allHotels.put("h3",hotel3Details);
		allHotels.put("h4",hotel4Details);
		
	}


	public List<String> getHotelDetails(String hotelId) {
		
		return allHotels.get(hotelId);
	}
	
	public String addHotel(String hotelId,List<String> hotelDetails) {
		
		 allHotels.put(hotelId,hotelDetails);
		 return "Hotel Added";
	}


}
