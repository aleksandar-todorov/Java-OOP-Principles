package com.alex.oop.calculator.impl;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import com.alex.oop.calculator.menu.NumberValidator;

public class Printer extends NumberValidator 
{

	/**
	 * Execute the function "funcName" from Calculator.class and Print the result
	 * @param funcName 
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	public static void print(String funcName) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException 
	{
		Method method;
		Calculator calculator = new Calculator();
		/**
		 * Check which of the 4 static fields are null
		 */
		if(numLong1 == null)
		{
			if(numLong2 == null) {
				method = calculator.getClass().getMethod(funcName,Double.class,Double.class);
				System.out.println(funcName + " is " + method.invoke(calculator,numDouble1, numDouble2));
			}
			else {
				method = calculator.getClass().getMethod(funcName,Double.class,Long.class);
				System.out.println(funcName + " is " + method.invoke(calculator,numDouble1, numLong2));
			}
		}
		else 
		{
			if(numLong2 == null) {
				method = calculator.getClass().getMethod(funcName,Long.class,Double.class);
				System.out.println(funcName + " is " + method.invoke(calculator,numLong1, numDouble2));
			}
			else {
				method = calculator.getClass().getMethod(funcName,Long.class,Long.class);
				System.out.println(funcName + " is " + method.invoke(calculator,numLong1, numLong2));
			}
		}
	}
}
