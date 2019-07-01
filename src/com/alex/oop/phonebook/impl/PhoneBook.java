package com.alex.oop.phonebook.impl;

import java.util.Map;
import java.util.TreeMap;

public class PhoneBook implements Searchable, Insertable, Deletable, Printable
{
	TreeMap<String, String> phoneBook; // key = name --> value = number
	
	public PhoneBook()
	{
		this.phoneBook = new TreeMap<>();
	}

	@Override
	public String insert(String name, String number) 
	{
		if(phoneBook.containsKey(name)) return "Name : " + name + " already exists in the PhoneBook.";
		if(phoneBook.containsValue(number)) return "PhoneNumber : " + number + " already exists in the PhoneBook.";
		
		this.phoneBook.put(name, number);
		return name + " with number : " + number + " is added to the PhoneBook.";
	}

	@Override
	public String searchByName(String name) 
	{
		if(!this.phoneBook.containsKey(name)) return "There is no such Name in the PhoneBook.";
		return name + " has PhoneNumber : " + this.phoneBook.get(name);
	}

	@Override
	public String searchByNumber(String number) 
	{
		if(!this.phoneBook.containsValue(number)) return "There is no such PhoneNumber in the PhoneBook.";
		return findKeyByValue(number) + " has PhoneNumber : " + number;
	}
	
	@Override
	public String deleteByName(String name) 
	{
		if(!this.phoneBook.containsKey(name)) return "There is no such Name in the PhoneBook.";
		return name + " with number : " + this.phoneBook.remove(name) + " was deleted from the PhoneBook.";
	}

	@Override
	public String deleteByNumber(String number) 
	{
		if(!this.phoneBook.containsValue(number)) return "There is no such PhoneNumber in the PhoneBook.";
		String name = findKeyByValue(number);
		return name + " with number : " + this.phoneBook.remove(name) + " was deleted from the PhoneBook.";
	}
	
	private String findKeyByValue(String number) 
	{
		for(Map.Entry<String, String> entry : this.phoneBook.entrySet())
		{
			if(entry.getValue().equals(number)) return entry.getKey();
		}
		return null;
	}

	@Override
	public void printSize() 
	{
		System.out.printf("There is %d PhoneNumber(s) in the PhoneBook.", this.phoneBook.size()).println();
	}

	@Override
	public void printPhoneBook() 
	{
		if(this.phoneBook.isEmpty()) System.out.println("The PhoneBook is still empty.");
		else 
		{
			for(Map.Entry<String, String> entry : this.phoneBook.entrySet())
			{
				System.out.printf("%s ---> %s" , entry.getKey(), entry.getValue()).println();
			}
		}	
	}
}
