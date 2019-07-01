package com.alex.oop.calculator.menu;

/**
 * 4 static fields - 2 for each number. Depends if the number is Long or Double the other field is null
 */
public abstract class NumberValidator 
{
	public static Long numLong1;
	public static Double numDouble1;
	public static Long numLong2;
	public static Double numDouble2;
	
	public static boolean isNumeric(String str) 
	{
	  return str.matches("^-?\\d+(\\.\\d+)?$");  //match a number with optional '-' and . for delimiter
	}
	
	public static void parseNumber1(String number)
	{
		if (number.contains("."))
		{
			numDouble1 = Double.parseDouble(number);
			numLong1 = null;
		} 
		else 
		{
			numLong1 = Long.parseLong(number);
			numDouble1 = null;
		}
	}
	
	public static void parseNumber2(String number)
	{
		if (number.contains("."))
		{
			numDouble2 = Double.parseDouble(number);
			Long numLong2 = null;
		} 
		else 
		{
			numLong2 = Long.parseLong(number);
			numDouble2 = null;
		}
	}
	
	public static void nullFields()
	{
		numLong1 = null;
		numDouble1 = null;
		numLong2 = null;
		numDouble2 = null;
	}
}
