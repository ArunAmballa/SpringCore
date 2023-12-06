package com.arun.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.arun.beans.CourseSelection;

import org.springframework.context.ApplicationContext;

public class LaunchMain 
{
	
	public static void main(String args[]) 
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CourseSelection select=context.getBean("select",CourseSelection.class);
		
		boolean status=select.chooseCourse(1000.3);
		
		if (status)
		{
			System.out.println("Course Purcased Successfully");
		}
		else
		{
			System.out.println("Course Purcased Failed");
		}
		
		
	}

}
