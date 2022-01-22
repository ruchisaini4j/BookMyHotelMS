package com.bookMyHotel.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookMyHotel.dao.BookingDAO;
import com.bookMyHotel.model.Booking;

@Service
public class BookingService {
	
	@Autowired 
	BookingDAO bookingDAO;
	
	public List<String> getBookingIds(String registrationId)
	{
		return bookingDAO.getBookingIds(registrationId);
	}
	
	
	
	public List<String> getBookingDetails(String registrationId,String bookingId)
	{
		return bookingDAO.getBookingDetails(registrationId,bookingId);
	}
	
	public String addBookingInHotel(String registrationId,Booking booking)
	{
		 
		 return bookingDAO.addBookingInHotel(registrationId,booking);
	}

}
