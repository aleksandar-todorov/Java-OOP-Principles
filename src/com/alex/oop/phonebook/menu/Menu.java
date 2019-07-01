package com.alex.oop.phonebook.menu;

import java.util.Scanner;
import com.alex.oop.phonebook.impl.PhoneBook;

public class Menu {

	public void run()
	{
		initializeFirstMessage();
		PhoneBook phonebook = new PhoneBook();
		
		/**
		 * The Menu options runs till the user close the Application.
		 */
		while(true)
		{
			String name = "";
			String number = "";
			Scanner scanner = new Scanner(System.in);
			String userData = scanner.nextLine();
			switch(userData)
			{
				case  "1" :  //Insert a Name and PhoneNumber to the PhoneBook
					System.out.print("Type a name : ");
					name = scanner.nextLine();
					System.out.print("Type a number : ");
					number = scanner.nextLine();
					number = validatePhone(scanner, number);
					System.out.println(phonebook.insert(name, number));
					break;
					
				case "2" :  //Search by Name
					System.out.print("Search by Name : ");
					name = scanner.nextLine();
					System.out.println(phonebook.searchByName(name));
					break;
				
				case "3" : //Search by PhoneNumber
					System.out.print("Search by PhoneNumber : ");
					number = scanner.nextLine();
					number = validatePhone(scanner, number);
					System.out.println(phonebook.searchByNumber(number));
					break;
						
				case "4" : // Delete By Name
					System.out.print("Delete By Name : ");
					name = scanner.nextLine();
					System.out.println(phonebook.deleteByName(name));
					break;
					
				case "5" : // Delete By PhoneNumber
					System.out.print("Delete By PhoneNumber : ");
					number = scanner.nextLine();
					System.out.println(phonebook.deleteByNumber(number));
					break;
					
				case "6" : // PhoneBook size
					phonebook.printSize();
					break;
					
				case "7" : // Print all Names and PhoneNumbers
					phonebook.printPhoneBook();
					break;
					
				case "9" : // See this Menu again
					initializeFirstMessage();
					break;
			}
		}
	}

	/**
	 * Checks if userData consists only digits and call for action again if not.
	 * @param scanner
	 * @param number
	 * @return
	 */
	private String validatePhone(Scanner scanner, String number) {
		while(!number.matches("^\\d+$")) 
				{
					System.out.print("Type only digits for the number : ");
					number = scanner.nextLine();
				}
		return number;
	}
	
	/**
	 * Prints First Message of the Menu
	 */
	private void initializeFirstMessage() {
		System.out.println("Choose option from the Menu:");
		System.out.println("1 - Insert a Name and Phone to the PhoneBook");
		System.out.println("2 - Search by Name");
		System.out.println("3 - Search by PhoneNumber");
		System.out.println("4 - Delete By Name");
		System.out.println("5 - Delete By PhoneNumber");
		System.out.println("6 - Check how many PhoneNumbers are in the PhoneBook.");
		System.out.println("7 - Print All Names and PhoneNumbers from the PhoneBook.");
		System.out.println("9 - See the options of this Menu again");
	}
}
