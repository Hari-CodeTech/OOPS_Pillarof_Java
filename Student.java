package com.Constructor;

public class Student {
	String name;
	String course;
	double feeDetails;
	
	public Student(String name) {
		this.name=name;
	}
	public Student(String name,String course) {
		this(name);
		this.course=course;
	}
	public Student(String name,String course,double feeDetails) {
		this(name,course);
		this.feeDetails=feeDetails;
	}
	public void display() {
		System.out.println("Name of the Student:"+name);
		if(course!=null) {
			System.out.println("Course,"+name+" is Enrolled to it: "+course);
		}
		if(feeDetails!=0.0) {
			System.out.println("Fee Stucture Of the Student: "+feeDetails);
		}
		System.out.println();
	}
	public static void main(String[]args) {
		Student s=new Student("Hari");
		s.display();
		Student s1=new Student("Hari","CSE-JFS");
		s1.display();
		Student s2=new Student("Hari","CSE_JFS",45000.00);
		s2.display();
	}
}
