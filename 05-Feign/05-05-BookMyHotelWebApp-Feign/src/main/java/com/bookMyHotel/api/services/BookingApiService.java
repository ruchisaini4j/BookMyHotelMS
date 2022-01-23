package com.bookMyHotel.api.services;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.bookMyHotel.model.Booking;

@FeignClient(name="booking-service")
public interface BookingApiService {
	
	
	
	@GetMapping(path="/api/registrations/{registrationId}/bookings",produces="application/xml")
	public List<String> getBookingIds(@PathVariable("registrationId") String registrationId);
	
	
	@GetMapping(path="/api/registrations/{registrationId}/bookings/{bookingId}",produces="application/xml")
	public List<String> getBookingDetails(@PathVariable("registrationId") String registrationId,@PathVariable("bookingId") String bookingId);
	
	
	@PostMapping(path="/api/registrations/{registrationId}/bookings",produces="application/xml",consumes="application/xml")
	public String addBookingInHotel(@PathVariable("registrationId") String registrationId,@RequestBody Booking booking);

}
