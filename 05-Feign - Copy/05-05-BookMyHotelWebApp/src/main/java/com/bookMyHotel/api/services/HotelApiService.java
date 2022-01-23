package com.bookMyHotel.api.services;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="hotel-service")
public interface HotelApiService {
	
	@GetMapping(path="/api/hotels/{hotelId}",produces="application/xml")
	public List<String> getHotelDetails(@PathVariable("hotelId") String hotelId);

}
