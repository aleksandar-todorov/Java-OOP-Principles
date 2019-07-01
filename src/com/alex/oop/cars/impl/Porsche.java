package com.alex.oop.cars.impl;

public class Porsche extends Car
{
	private static final double PORSCHE_CONSUMPTION_LITRES_PER_100KM = 9.1;

	public Porsche(String model, int year) 
	{
		super(model, year);
		super.setElectrical(false);
		super.setFuelConsumptionPer100km(PORSCHE_CONSUMPTION_LITRES_PER_100KM);
	}
	
	@Override
	public void printInfo() 
	{
		System.out.println("Porsche is a German automobile manufacturer specializing in high-performance sports cars, SUVs and sedans.");
	}

}
