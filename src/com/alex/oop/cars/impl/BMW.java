package com.alex.oop.cars.impl;

public class BMW extends Car
{
	private static final double BMW_CONSUMPTION_LITRES_PER_100KM = 14.4;

	public BMW(String model, int year) 
	{
		super(model, year);
		super.setElectrical(false);
		super.setFuelConsumptionPer100km(BMW_CONSUMPTION_LITRES_PER_100KM);
	}

	@Override
	public void printInfo() 
	{
		System.out.println("BMW is a German multinational company which currently produces automobiles and motorcycles, and also produced aircraft engines until 1945.");
	}
}
