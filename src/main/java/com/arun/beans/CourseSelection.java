package com.arun.beans;

public class CourseSelection 
{
//	static
//	{
//		System.out.println("CourseSelection Sttaic Block is executed");
//	}
//	
	private Course course;
	
	
	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public CourseSelection()
	{
		System.out.println("Spring Created Object of Course Selection Class"   );
	}
	
	public CourseSelection(Course course)
	{
		this.course=course;
	}
	
	public boolean chooseCourse(Double amount)
	{
		course.selectCourse(amount);
		return true;
	}

}
