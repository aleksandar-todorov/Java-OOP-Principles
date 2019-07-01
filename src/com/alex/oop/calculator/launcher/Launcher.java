package com.alex.oop.calculator.launcher;

import java.lang.reflect.InvocationTargetException;

import com.alex.oop.calculator.menu.Menu;

public class Launcher 
{
	public static void main(String args[]) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException 
	{
		System.out.println("===================");
		System.out.println("Welcome to Calcultator App");
		Menu menu = new Menu();
		menu.run();
	}
}
