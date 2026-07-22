package com.Polymorphism;

public class ElectricityBillMain {

	public static void main(String[] args) {
		ElectricityBill e=new ElectricityBill ();
		int res=e.calculateBill(5);
		System.out.println("Bill Based on only UNITS : " +res);
		double res1=e.calculateBill(5, 80.5);
		System.out.println("Bill After Adding ServiceCharge: "+ res1);
		double res2=e.calculateBill(5, 80.5, 15.25);
		System.out.println("The Final Bill After adding Tax: "+res2);
	}

}
