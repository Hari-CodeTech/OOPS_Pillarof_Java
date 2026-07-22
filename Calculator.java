package com.Polymorphism;

public class Calculator {
	public int add(int a,int b) {
		System.out.println("THis is 2 parameters list with int Datatype: ");
		return a+b;
	}
	public int add(int a,int b,int c) {
		System.out.println("THis is 3 parameters list with int Datatype: ");
		return a+b+c;
	}
	public double add(double a,int b) {
		System.out.println("THis is 2 parameters list with Double and Int  Datatype: ");
		return a+b;
		
	}
	public static int add(int a,int b,int c,int d) {
		System.out.println("THis is 4 parameters list with int Datatype: ");
		return a+b-c+d;
	}
	
}
