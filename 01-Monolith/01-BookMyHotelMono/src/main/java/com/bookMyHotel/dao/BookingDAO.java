package com.bookMyHotel.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.bookMyHotel.model.Booking;

@Repository
public class BookingDAO {
	
	
	static private HashMap<String,List<String>> bookingsDetails1 = new HashMap<>();
	static private HashMap<String,List<String>> bookingsDetails2 = new HashMap<>();
	static private HashMap<String,HashMap<String,List<String>>> regSpecificBookings = new HashMap<>();
	
	static
	{
		
		
		//all bookings
		bookingsDetails1.put("h1b1", 
				new ArrayList<String>(Arrays.asList("Hotel Name : Mosaic Hotel Noida", "Start Date : 12th feb 2020 " , "End Date : 20th feb 2020" , "RoomType : Single")));
		
		
		bookingsDetails1.put("h3b1", 
				new ArrayList<String>(Arrays.asList("Hotel Name : Hotel Park Residency Delhi", "Start Date : 20th Mar 2020 " , "End Date : 25th Mar 2020" , "RoomType : Double")));
		
		
		bookingsDetails2.put("h3b2", 
				new ArrayList<String>(Arrays.asList("Hotel Name : Hotel Park Residency Delhi", "Start Date : 15th dec 2020 " , "End Date : 20th dec 2020" , "RoomType : Double")));
		//registration specific bookings
		
		regSpecificBookings.put("cr1",bookingsDetails1);
		regSpecificBookings.put("cr2",bookingsDetails2);
		
	}
	
	
	public List<String> getBookingIds(String registrationId)
	{
			
		HashMap<String,List<String>> bookingIdsMap = new HashMap<>();
		bookingIdsMap	= regSpecificBookings.get(registrationId);
		List<String> bookingIds = new ArrayList<String>();
		if(!(null == bookingIdsMap))
		{
			bookingIds = bookingIdsMap.keySet().stream().collect(Collectors.toList());
		}
		else
		{
			bookingIds.add("No Booking done so far");
		}
	
				
														
		return bookingIds;
	}
	
	
	
	public List<String> getBookingDetails(String registrationId,String bookingId)
	{
		return regSpecificBookings.get(registrationId).get(bookingId);
		
	}
	
	
	public String addBookingInHotel(String registrationId,Booking booking)
	{
		List<String> newBookingList = new ArrayList<>();
		
		String bookingId = booking.getBookingId();
		List<String> newBooking = booking.getBookingAsList();
		
	
		
		
		String hotelName = "Hotel Name : " + newBooking.get(1);
		String startDate = "Start Date : " + newBooking.get(2);
		String endDate = "End Date : " + newBooking.get(3);
		String roomType = "RoomType : " + newBooking.get(4);
		
		newBookingList.add(hotelName);
		newBookingList.add(startDate);
		newBookingList.add(endDate);
		newBookingList.add(roomType);
		System.out.println(newBookingList);
		
		HashMap<String,List<String>> bookings = regSpecificBookings.get(registrationId);
		if(null == bookings)
			bookings = new HashMap<>();
		
		
		bookings.put(bookingId,newBookingList);
		regSpecificBookings.put(registrationId,bookings);
		
		return "Booking Done and money is deducted from your account!!, your booking id is " + bookingId;
	}
}
