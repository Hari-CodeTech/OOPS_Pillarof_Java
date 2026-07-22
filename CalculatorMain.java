package com.Polymorphism;

public class CalculatorMain {

	public static void main(String[] args) {
		Calculator cal=new Calculator();
		double sum=cal.add(20.3, 34);
		System.out.println(sum);
		int sum1=cal.add(20, 30,150,50);
		System.out.println(sum1);
		

	}

}
