package com.Polymorphism;

public class MovieTicket {
	public int bookTicket(int tickets) {
		System.out.println("Tickets Prices are:");
		int sum=tickets*200;
		return sum;
	}
	public double bookTicket(int tickets,boolean isPremium) {
		
		int price;
		if(isPremium) {
			System.out.println("Prices for Premium");
		 price=tickets*350;
		}
		else {
			System.out.println("Prices for Normal");
			price=tickets*200;
		}
		return price;
		
	}
	public double bookTicket(int tickets,boolean isPremium,double discount) {
		double price=bookTicket(tickets,isPremium);
		System.out.println("Prices after Applying Discount:");
		double Final=price*discount;
		return Final;
	}
}
