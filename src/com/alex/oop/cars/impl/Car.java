package com.alex.oop.cars.impl;

public class Car 
{
	private String model;
	private int year;
	private boolean isElectrical;
	private double fuelConsumptionPer100km;
	
	public Car(String model, int year) 
	{
		this.model = model;
		this.year = year;
	}

	public String getModel() 
	{
		return model;
	}

	public void setModel(String model)
	{
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) 
	{
		this.year = year;
	}

	public boolean isElectrical() 
	{
		return isElectrical;
	}

	public void setElectrical(boolean isElectrical)
	{
		this.isElectrical = isElectrical;
	}

	public double getFuelConsumptionPer100km() 
	{
		return fuelConsumptionPer100km;
	}

	public void setFuelConsumptionPer100km(double fuelConsumptionPer100km)
	{
		this.fuelConsumptionPer100km = fuelConsumptionPer100km;
	}

	public void printInfo() 
	{
		System.out.println("The year 1886 is regarded as the birth year of the modern car.");
	}
	
	/*
	 * calculates and returns double money per 100km depends on if the car is electrical or not
	 */
	public double calculateMoneyPer100km() 
	{
		if(this.isElectrical) 
		{
			return this.fuelConsumptionPer100km * 0.13;
		}
		
		return this.fuelConsumptionPer100km * 1.16;
	}
	
	public void printCalculatedMoney()
	{
		System.out.println("Money needed per 100km : " + this.calculateMoneyPer100km() + "$");
	}

	@Override
	public String toString() 
	{
		return "Your " + this.getClass().getSimpleName() + " is a Car with :" + "\n" +  "[model= " + model + ", year= " + year + ", isElectrical= " + isElectrical
				+ ", fuelConsumptionPer100km= " + fuelConsumptionPer100km + "]";
	}
	
	
}
