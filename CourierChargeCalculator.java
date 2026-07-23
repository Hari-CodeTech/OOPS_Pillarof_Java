package com.Polymorphism.MethodOverLoading;

public class CourierChargeCalculator {
	static int basic_cost=40;
	void delivery(double packageWeight) {
		System.out.println("Calculate the delivery charge using only the package weight : "+packageWeight*basic_cost);
	}
	void delivery(double packageWeight,int distance) {
		System.out.println("Calculate the delivery charge using only the package weight & Delivery Distance"+(packageWeight*basic_cost+(distance*packageWeight)));
	}
	void delivery(double packageWeight,int distance, boolean deliverOption ) {
		double res=basic_cost*packageWeight+(distance*packageWeight);
		if(deliverOption) {
			res+=150;
		}
		System.out.println("Calculate the delivery charge using only the package weight & Delivery Distance"+res);
	}
	
	public static void main(String[] args) {
		CourierChargeCalculator c=new CourierChargeCalculator();
		c.delivery(10);
		c.delivery(10,5);
		c.delivery(10,5,true);

	}

}
