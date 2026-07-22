package com.Polymorphism;

public class MovieTicketMain {

	public static void main(String[] args) {
		MovieTicket m=new MovieTicket();
		int ans=m.bookTicket(2);
		System.out.println(ans);
		double ans1=m.bookTicket(2, true);
		System.out.println(ans1);
		double ans2=m.bookTicket(2,true, 0.90);
		System.out.println(ans2);
	}

}
