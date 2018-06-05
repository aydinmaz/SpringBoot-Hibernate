package it.finsoft.mylibrary.model;

public class Person 
{
	
	public String name;
	public String lastname;
	public int age;
	
	
	public Person(String n)
	{
		this.name = n;
	}
	
	public Person(String n, String l, int a)
	{
		this.name = n;
		this.lastname = l;
		this.age = a;
	}
	
	
	public String Talking()
	{
		return "Ciao";
		
	}
	
	public void Walking()
	{
		// doing something
	}

}
