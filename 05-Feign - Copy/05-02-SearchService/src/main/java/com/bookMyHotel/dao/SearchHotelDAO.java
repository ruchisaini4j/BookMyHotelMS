package com.bookMyHotel.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.bookMyHotel.model.Search;

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


	public  List<String> getListOfSpecificHotels(Search search) {
		String key = search.getCity() + "," + search.getState() + "," + search.getCountry();
		
		
		List<String> noresult = new ArrayList<String>();
		
		if(allHotels.containsKey(key))
		{
			return allHotels.get(key);
		}
		
		return noresult;
		
	} 
	
	
	

}
