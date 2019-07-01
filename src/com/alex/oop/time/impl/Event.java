package com.alex.oop.time.impl;

public class Event 
{
	private String name;
	private Time time;
	
	public Event(String name, Time time) 
	{
		this.name = name;
		this.time = time;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public Time getTime() 
	{
		return time;
	}

	public void setTime(Time time) 
	{
		this.time = time;
	}
	
	@Override
	public String toString() 
	{
		return this.getName() + " on " + this.getTime().toString();
	}
}
