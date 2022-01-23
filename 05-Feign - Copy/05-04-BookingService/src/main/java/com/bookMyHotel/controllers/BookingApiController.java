package com.bookMyHotel.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookMyHotel.model.Booking;
import com.bookMyHotel.services.BookingService;


@RestController
public class BookingApiController {
	
	@Autowired
	BookingService bookingService;
	
	@GetMapping(path="/api/registrations/{registrationId}/bookings",produces="application/xml")
	public List<String> getBookingIds(@PathVariable("registrationId") String registrationId)
	{
		System.out.println("registrationId"+registrationId);
		return bookingService.getBookingIds(registrationId);
	}
	
	
	@GetMapping(path="/api/registrations/{registrationId}/bookings/{bookingId}",produces="application/xml")
	public List<String> getBookingDetails(@PathVariable("registrationId") String registrationId,@PathVariable("bookingId") String bookingId)
	{
		System.out.println("registrationId"+registrationId);
		System.out.println("bookingId"+bookingId);
		return bookingService.getBookingDetails(registrationId,bookingId);
	}
	
	@PostMapping(path="/api/registrations/{registrationId}/bookings",produces="application/xml",consumes="application/xml")
	public String addBooking(@PathVariable("registrationId") String registrationId,@RequestBody Booking booking)
	{
		
		 return bookingService.addBookingInHotel(registrationId,booking);
	}
	

}
