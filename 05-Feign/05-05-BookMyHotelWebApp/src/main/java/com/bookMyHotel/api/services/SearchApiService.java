package com.bookMyHotel.api.services;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.bookMyHotel.model.Search;

@FeignClient(name="search-service")
public interface SearchApiService {
	
	@PostMapping(path="/api/search",produces="application/xml",consumes="application/xml")
	public List<String> getListOfSpecificHotels(@RequestBody Search search);

}
