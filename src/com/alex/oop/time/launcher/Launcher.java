/*
 * @author Aleksandar Todorov
 * @version 1.0
 */
package com.alex.oop.time.launcher;

import com.alex.oop.time.menu.Menu;

public class Launcher 
{
	public static void main(String args[]) 
	{
		System.out.println("Welcome to Event Manager App");
		System.out.println("============================");
		Menu menu = new Menu();
		menu.run();
	}
}
