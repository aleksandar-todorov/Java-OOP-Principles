package com.alex.oop.phonebook.launcher;

import com.alex.oop.phonebook.menu.Menu;

public class Launcher {
	public static void main(String args[]) 
	{
		System.out.println("Welcome to PhoneBook App");
		System.out.println("============================");
		Menu menu = new Menu();
		menu.run();
	}
}
