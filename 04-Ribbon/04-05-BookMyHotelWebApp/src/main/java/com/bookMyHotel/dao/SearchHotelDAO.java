package com.bookMyHotel.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class SearchHotelDAO {
	
	
	static private HashMap<String,ArrayList<String>> allHotels =
			new HashMap<>();

	
	static
	{
		
		//key is city,state,county and value is name of Hotel
		allHotels.put("noida,up,india",
				new ArrayList<String>(Arrays.asList("h1 - Mosaic Hotel Noida", "h2 - Radisson Hotel Noida")));
		allHotels.put("delhi,delhi,india",
				new ArrayList<String>(Arrays.asList("h3 - Hotel Park Residency Delhi", "h4 - Pride Plaza Hotel Delhi")));

		
	}


	public  List<String> getListOfSpecificHotels(String city,String state,String country) {
		String key = city + "," + state + "," + country;
		return allHotels.get(key);
		
	}

}
