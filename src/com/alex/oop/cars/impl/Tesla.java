package com.alex.oop.cars.impl;

public class Tesla extends Car
{
	
	private static final double TESLA_CONSUMPTION_KWH_PER_100KM = 34;
	
	public Tesla(String model, int year) 
	{
		super(model, year);
		super.setElectrical(true);
		super.setFuelConsumptionPer100km(TESLA_CONSUMPTION_KWH_PER_100KM);
	}

	@Override
	public void printInfo() 
	{
		System.out.println("Tesla is an American automotive and energy company based in Palo Alto, California, specializes in electric car manufacturing.");
	}
}
