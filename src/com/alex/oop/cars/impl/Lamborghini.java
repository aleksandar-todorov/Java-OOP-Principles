package com.alex.oop.cars.impl;

public class Lamborghini extends Car
{
	private static final double LAMBORGHINI_CONSUMPTION_LITRES_PER_100KM = 16;

	public Lamborghini(String model, int year) 
	{
		super(model, year);
		super.setElectrical(false);
		super.setFuelConsumptionPer100km(LAMBORGHINI_CONSUMPTION_LITRES_PER_100KM);
	}

	@Override
	public void printInfo() 
	{
		System.out.println("Lamborghini is an Italian brand and manufacturer of luxury sports cars and SUVs based in Sant'Agata Bolognese.");
	}
}
