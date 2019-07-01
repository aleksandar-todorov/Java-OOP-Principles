package com.alex.oop.cars.menu;

import java.util.Scanner;

import com.alex.oop.cars.impl.BMW;
import com.alex.oop.cars.impl.Car;
import com.alex.oop.cars.impl.Lamborghini;
import com.alex.oop.cars.impl.Porsche;
import com.alex.oop.cars.impl.Tesla;

public class Menu 
{
	public void run() 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("----------");
		System.out.println("Pick a Car : (Press from 1 to 4 and then `ENTER`)");
		System.out.println("1 - Tesla model X 2018");
		System.out.println("2 - BMW model M5 2018");
		System.out.println("3 - Lamborghini model Centenario 2016");
		System.out.println("4 - Porsche model Cayman 2006");
		String data = scanner.nextLine();
		while(true)
		{
			switch(data) 
			{
			case "1" : 
				Car carTesla = new Tesla("X", 2018);
				printAllCarInfo(scanner, carTesla);
				return;
			case "2" : 
				Car carBMW = new BMW("M5", 2018);
				printAllCarInfo(scanner, carBMW);
				return;
			case "3" : 
				Car carLamborghini = new Lamborghini("Centenario", 2016);
				printAllCarInfo(scanner, carLamborghini);
				return;
			case "4" : 
				Car carPorsche = new Porsche("Cayman", 2006);
				printAllCarInfo(scanner, carPorsche);
				return;
			default :
				System.out.println("Try again and this time from 1 to 4 :)");
				data = scanner.nextLine();
			}
		}		
	}

	private void printAllCarInfo(Scanner scanner, Car car) 
	{
		car.printInfo();
		System.out.println(car);
		car.printCalculatedMoney();
		scanner.close();
	}
}
