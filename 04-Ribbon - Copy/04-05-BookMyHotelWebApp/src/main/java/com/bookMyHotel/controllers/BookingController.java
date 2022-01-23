package com.bookMyHotel.controllers;

import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.bookMyHotel.api.services.BookingApiService;
import com.bookMyHotel.api.services.HotelApiService;
import com.bookMyHotel.model.Booking;

@Controller
public class BookingController {
	
	@Autowired
	BookingApiService bookingService;
	@Autowired
	HotelApiService hotelService;
	
	
	
	
	
	////BOOK HOTEL *******************************
	
	@GetMapping("/booking/bookHotel.htm/{hotelId}")
	public String showBookHotelForm(@PathVariable("hotelId")String hotelId,Model model,HttpSession session)
	{
		
		
		List<String> hotelList = hotelService.getHotelDetails(hotelId);
		String hotelNameComplete = hotelList.get(1);
		String[] arrOfStr = hotelNameComplete.split("-", 2); 
		String hotelName = arrOfStr[1];
		
		Booking booking = new Booking();
		booking.setHotelId(hotelId);
		booking.setHotelName(hotelName);
		model.addAttribute("booking",booking);
		
		return "/booking/bookHotel";
		
		
		
	}
	
	@PostMapping("/booking/bookHotel.htm")
	public String bookHotel(@ModelAttribute("booking") Booking booking,Model model,HttpSession session)
	{	
		String registrationId = (String)session.getAttribute("registrationId");
		Random rand = new Random();
		String bookingId = "b" + rand.nextInt();
		
		booking.setBookingId(bookingId);
		
		
		String status = bookingService.addBookingInHotel(registrationId,booking);
		model.addAttribute("status", status);
		
		
		return "/booking/bookingHotelOutput";
		
	}
	
	////SEARCH BOOKING and select specific booking*******************************

	
	@GetMapping("/booking/allBooking.htm")
	public String showSearchBookingForm(Model model,HttpSession session)
	{
		String registrationId = (String)session.getAttribute("registrationId");
		List<String> bookingIdsList = bookingService.getBookingIds(registrationId);
	
			
		model.addAttribute("bookings",bookingIdsList);
		return "/booking/allBooking";
		
		
		
	}
	
	@GetMapping("/booking/bookingDetails.htm/{bookingId}")
	public String retrieveBookingDetails(@PathVariable("bookingId") String bookingId, Model model,HttpSession session)
	{	
	
		String registrationId = (String)session.getAttribute("registrationId");
		System.out.println("registrationId" + registrationId);
		List<String> bookingDetails = bookingService.getBookingDetails(registrationId,bookingId);
		
		model.addAttribute("bookingDetails", bookingDetails);
		
		return "/booking/bookingDetails";
		
	}
	
	

}
