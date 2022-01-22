package com.bookMyHotel.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.bookMyHotel.api.services.HotelApiService;

@Controller
public class HotelController {
	
	
	@Autowired
	HotelApiService hotelService;
	
	
	
	
	
	//get hotel details
	@GetMapping("/hotel/hotelDetails.htm/{hotelId}")
	public String welcomePage(@PathVariable("hotelId") String hotelId,Model model,HttpSession session)
	{	
		
		List<String> hotelList = hotelService.getHotelDetails(hotelId);
		model.addAttribute("hotels",hotelList);
		
		return "/hotel/hotelDetails";
		
	}
	


}
