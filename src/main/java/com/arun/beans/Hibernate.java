package com.arun.beans;

public class Hibernate implements Course
{
	
//	static
//	{
//		System.out.println("Hibernate Sttaic Block is executed");
//	}
	
	public Hibernate()
	{
		System.out.println("Spring Created Object of Hibernate Class");
	}

	@Override
	public boolean selectCourse(Double amount) 
	{
		System.out.println("Hibernate Course is Purchased"+amount);
		return true;
	}

}
