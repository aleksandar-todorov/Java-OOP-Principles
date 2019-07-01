package com.alex.oop.time.impl;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Time 
{
	private LocalDateTime dateTime;
	
	public Time() 
	{
		this.dateTime = LocalDateTime.now();
	}
	
	public Time(LocalDateTime dateTime) 
	{
		this.dateTime = dateTime;
	}
	
	public LocalDateTime getDateTime() 
	{
		return dateTime;
	}
	
	public void setDateTime(LocalDateTime dateTime) 
	{
		this.dateTime = dateTime;
	}
	
	@Override
	public String toString() 
	{
		String DateTimePattern = "dd.MM.yyyy HH:mm";
		DateTimeFormatter DateTimeFormatter = java.time.format.DateTimeFormatter.ofPattern(DateTimePattern);
		return DateTimeFormatter.format(this.getDateTime());
	}
}
