package com.arun.beans;

public class Java implements Course
{
//	static
//	{
//		System.out.println("Java Sttaic Block is executed");
//	}
//	
	public Java() 
	{
		System.out.println("Spring Created Object of JAVA Class");
		
	}

	@Override
	public boolean selectCourse(Double amount) 
	{
		System.out.println("Java Course is Purchased"+amount);
		return true;
	}

}