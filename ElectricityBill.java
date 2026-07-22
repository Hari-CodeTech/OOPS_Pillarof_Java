package com.Polymorphism;

public class ElectricityBill {
		public int calculateBill(int units) {
			int charge=8;
			int display=units*charge;
			return display;
		}
		public double calculateBill(int units, double serviceCharge) {
			int display=calculateBill( units);
			double bill=display+serviceCharge;
			return bill;
		}
		public double calculateBill(int units, double serviceCharge, double tax) {
			double bill=calculateBill(units,serviceCharge);
			double Amount=bill+tax;
			return Amount;
		}

	

}
