package com.alex.oop.time.impl;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/*
 * Class contains 3 methods with same name
 * 1st search by year and print them if found
 * 2nd search by year and month and print them if found
 * 3rd search by year, month and day and print them if found
 */
public class EventPrinter 
{
	
	public EventPrinter()
	{
	}
	
	public void printByDate(int year, List<Event> events)
	{
		AtomicBoolean flag = new AtomicBoolean(true);
		events.forEach(e -> 
			{
			if(e.getTime().getDateTime().getYear() == year)
				{
					System.out.println(e);
					flag.set(false);
				}
			});
		
		if(flag.get())
			{
				System.out.printf("No Events for %d year found." , year).println();
			}
	}
	
	public void printByDate(int year , int month, List<Event> events)
	{
		AtomicBoolean flag = new AtomicBoolean(true);
		events.forEach(e -> 
			{
			if(e.getTime().getDateTime().getYear() == year && 
					e.getTime().getDateTime().getMonthValue() == month)
				{
					System.out.println(e);
					flag.set(false);
				}
			});
		
		if(flag.get())
			{
				System.out.printf("No Events for %d year and %dth month found.", year, month).println();
			}
	}
	
	public void printByDate(int year , int month, int day, List<Event> events)
	{
		AtomicBoolean flag = new AtomicBoolean(true);
		events.forEach(e -> 
			{
			if(e.getTime().getDateTime().getYear() == year && 
					e.getTime().getDateTime().getMonthValue() == month &&
						e.getTime().getDateTime().getDayOfMonth() == day)
				{
					System.out.println(e);
					flag.set(false);
				}
			});
		
		if(flag.get())
			{
				System.out.printf("No Events for %d year %dth month and %d day found.", year, month, day).println();
			}
	}
}
