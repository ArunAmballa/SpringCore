package com.arun.beans;

public class SpringBoot implements Course
{
//	static
//	{
//		System.out.println("SpringBoot Sttaic Block is executed");
//	}
//	
	public SpringBoot()
	{
		System.out.println("Spring Created Object of SpringBoot Class");
	}

	@Override
	public boolean selectCourse(Double amount) 
	{
		System.out.println("SpringBoot Course is Purchased"+amount);
		return true;
	}

}
