package com.bookMyHotel.model;

import java.util.ArrayList;
import java.util.List;

public class Booking {
	String bookingId;
	String hotelId;
	String hotelName;
	String startDate;
	String endDate;
	String roomType;
	
	public List<String> getBookingAsList()
	{
		List<String> bookingDetails = new ArrayList<>();
		bookingDetails.add(bookingId);
		bookingDetails.add(hotelName);
		bookingDetails.add(startDate);
		bookingDetails.add(endDate);
		bookingDetails.add(roomType);
		
		return bookingDetails;
	}
	
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public String getHotelId() {
		return hotelId;
	}
	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	
	
	public String getBookingId() {
		return bookingId;
	}
	public void setBookingId(String bookingId) {
		this.bookingId = bookingId;
	}


	
	

}
