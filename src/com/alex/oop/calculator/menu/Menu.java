package com.alex.oop.calculator.menu;

import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

import com.alex.oop.calculator.impl.Printer;

public class Menu extends NumberValidator
{

	public void run() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException
	{
		initializeFirstMessage();
		
		/**
		 * The Menu options runs till the user close the Application.
		 */
		while(true)
		{
			Scanner scanner = new Scanner(System.in);
			String userData = scanner.nextLine();
			String num1 = "";
			String num2 = "";
			/**
			 * Ask the user for 2 numbers until the user type them correctly.
			 */
			while(true)
			{
				System.out.print("Type Number1 : ");
				num1 = scanner.nextLine();
				System.out.print("Type Number2 : ");
				num2 = scanner.nextLine();
				if(!isNumeric(num1) || !isNumeric(num2))
				{
					System.out.println("You should Type two Numbers!");
					continue;
				} else 
				{
					break;
				}
			}
			
			parseNumber1(num1);	
			parseNumber2(num2);
			
			switch(userData)
			{
			case "1" : //Sum 2 Numbers
				Printer.print("sum");
				nullFields();
				break;
			case "2" : //Subtract 2 Numbers
				Printer.print("subtraction");
				nullFields();
				break;
			case "3" : //Multiply 2 Numbers
				Printer.print("multiplication");
				nullFields();
				break;
			case "4" : //Divide 2 Numbers
				if((numLong2==null && numDouble2==0) || (numDouble2==null && numLong2==0))
				{
					System.out.println("You can't divide by 0");
					break;
				}
				Printer.print("division");
				nullFields();
				break;
			}
		}
	}

	/**
	 * Prints First Message of the Menu
	 */
	private void initializeFirstMessage() 
	{
		System.out.println("Choose option from the Menu:");
		System.out.println("1 - Sum 2 Numbers");
		System.out.println("2 - Subtract 2 Numbers");
		System.out.println("3 - Multiply 2 Numbers");
		System.out.println("4 - Divide 2 Numbers");
	}
}
