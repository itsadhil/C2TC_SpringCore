package com.tnsif.springcore_example;


public class student {
	private String name;

	public student()
	{
		System.out.println(" Students object created ");
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void display()
	{
		System.out.println(" Student: "+name);
	}
	
	
}