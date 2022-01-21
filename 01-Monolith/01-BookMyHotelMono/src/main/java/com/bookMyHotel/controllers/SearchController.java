package com.bookMyHotel.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.bookMyHotel.model.Search;
import com.bookMyHotel.services.SearchService;

@Controller
public class SearchController {
	
	//Search Hotels
	
	@Autowired
	SearchService searchService;

	
	
	
	@GetMapping("/search/search.htm")
	public String showSearchHotelsForm(Model model,HttpSession session)
	{
		
		Search search = new Search();
		model.addAttribute("search",search);
		
		return "/search/search";
		
	}
	
	@PostMapping("/search/searchHotelOutput.htm")
	public String searchHotels(@ModelAttribute("search") Search search,Model model,HttpSession session)
	{	
	
		List<String> allHotels=searchService.getListOfSpecificHotels(search);
		
		List<String> hotelNamesList = new ArrayList<>();
		List<String> hotelIdsList = new ArrayList<>();
		for (int i = 0; i < allHotels.size(); i++) 
		{
			String str = allHotels.get(i);
            String[] arrOfStr = str.split("-", 2); 
			hotelIdsList.add(arrOfStr[0]);
			hotelNamesList.add((arrOfStr[1]));
        }
		
		model.addAttribute("hotelIdsList", hotelIdsList);
		model.addAttribute("hotelNamesList", hotelNamesList);
		
		return "/search/searchHotelOutput";
		
	}
	
	

}
