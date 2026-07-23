package com.Polymorphism.MethodOverLoading;

public class Electricity_Bill_Calculator {
	int units;
	int rateperunit;
	int taxPercent;
	final int D_rate=8;
	void calculatebill(int units) {
		System.out.println("WHile Only by Units : Eletricity bill: "+units*D_rate);
	}
	void calculatebill(int units,int rateperunit) {
		System.out.println("WHile Units and rate per unit has given so  : Eletricity bill is : "+units*rateperunit);
	}
	void calculatebill(int units,int rateperunit,int taxPercent) {
		taxPercent=((units*rateperunit)*taxPercent)/100;
		int FinalBill=units*rateperunit+taxPercent;
		System.out.println("WHile Units and rate per unit along include with tax   : Eletricity bill is : "+FinalBill);
	}
	public static void main(String[]args) {
		Electricity_Bill_Calculator e=new Electricity_Bill_Calculator();
		e.calculatebill(10);
		e.calculatebill(10, 12);
		e.calculatebill(10, 12, 18);
	}
}
