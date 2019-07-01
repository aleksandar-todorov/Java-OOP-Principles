package com.alex.oop.time.menu;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.alex.oop.time.impl.Event;
import com.alex.oop.time.impl.EventPrinter;
import com.alex.oop.time.impl.Time;

public class Menu 
{
	public static List<Event> events = new ArrayList<>();
	
	public void run()
	{
		initializeFirstMessage();
			
		/**
		 * The Menu options runs till the user close the Application.
		 */
		while(true)
		{
			EventPrinter printer = new EventPrinter();
			Scanner scanner = new Scanner(System.in);
			String userData = scanner.nextLine();
			switch(userData)
			{ 	
				case  "1" :  //Add an Event
					addEvent(scanner);
					break;
					
				case  "2" : //Check Events By Year
					System.out.println("Check Events By Year : ");
					printer.printByDate(chooseYear(scanner), events);
					break;
					
				case  "3" : //Check Events By Year and Month
					System.out.println("Check Events By Year and Month : ");
					printer.printByDate(chooseYear(scanner), chooseMonth(scanner), events);
					break;
					
				case  "4" : //Check Events By Year, Month and Day
					System.out.println("Check Events By Year, Month and Day : ");
					printer.printByDate(chooseYear(scanner), chooseMonth(scanner), chooseDay(scanner), events);
					break;
					
				case  "5" : //Number of Events in your List of Events
					System.out.println("You have " + events.size() + " Events in your List.");
					break;
					
				case  "9" : //See the options of this Menu again
					this.run();
					break;
			}
		}
	}

	/**
	 * Prints First Message of the Menu
	 */
	private void initializeFirstMessage() {
		System.out.println("Choose option from the Menu:");
		System.out.println("1 - Add an Event");
		System.out.println("2 - Check Events By Year");
		System.out.println("3 - Check Events By Year and Month");
		System.out.println("4 - Check Events By Year, Month and Day");
		System.out.println("5 - Number of Events in your List of Events");
		System.out.println("9 - See the options of this Menu again");
	}
	
	/*
	 * Create Event with user data and save it to the static List<Event> events.
	 * works till correct data is inserted.
	 */
	private void addEvent(Scanner scanner) 
	{
		System.out.println("Add an Event");
		System.out.print("Pick a name of an Event : ");
		String eventName = scanner.nextLine();
		
		/**
		 * 5 Methods asking the user to insert data for year, month, day, hour, minute
		 */
		int year = chooseYear(scanner);
		int month = chooseMonth(scanner);
		int day = chooseDay(scanner);
		int hour = chooseHour(scanner);
		int minute = chooseMinute(scanner);
		
		/**
		 * additional try{}catch{} to check for impossible dates like 31 FEBRUARY.
		 */
		try
		{
			Time eventDateTime = new Time(LocalDateTime.of(year,month,day,hour,minute));
			Event event = new Event(eventName, eventDateTime);
			events.add(event);
			System.out.println("You added : " + event + " to your list of Events.");
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

	private int chooseMinute(Scanner scanner) 
	{
		int minute = tryParse(scanner, 0, 59,"Choose a Minute(from 0 to 59) : ");
		return minute;
	}

	private int chooseHour(Scanner scanner) 
	{
		int hour = tryParse(scanner, 0, 23,"Choose an Hour(from 0 to 23) : ");
		return hour;
	}

	private int chooseDay(Scanner scanner) 
	{
		int day = tryParse(scanner, 1, 31,"Choose a Day(from 1 to 31) : ");
		return day;
	}

	private int chooseMonth(Scanner scanner) 
	{
		int month = tryParse(scanner, 1, 12,"Choose a Month(from 1 to 12) : ");
		return month;
	}

	private int chooseYear(Scanner scanner) 
	{
		int year = tryParse(scanner, 2019, 2100, "Choose a Year(from 2019 to 2100) : ");
		return year;
	}

	/**
	 * a recursive Method works till a valid Integer is found.
	 * @param scanner
	 * @param lowRange,highRange - Range[] for finding a number
	 * @param message - initial message
	 * @return the parsed number
	 */
	private int tryParse(Scanner scanner, int lowRange, int highRange, String message) 
	{
		System.out.print(message);
		int parseToInt;
		try
		{
			parseToInt = Integer.parseInt(scanner.nextLine());
			if(parseToInt<lowRange || parseToInt>highRange)
			{
				parseToInt = tryParse(scanner, lowRange, highRange, message);
			}
		}
		catch(Exception ignored)
		{
			System.out.println("Try with number next time.");
			parseToInt = tryParse(scanner, lowRange, highRange, message);
		}
		return parseToInt;
	}
}
