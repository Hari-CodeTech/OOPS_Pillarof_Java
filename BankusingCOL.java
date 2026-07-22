package com.Constructor;

public class BankusingCOL {
	String name;
	String Atype;
	double deposit;
	
	
	public BankusingCOL(String name) {
		this.name=name;
	}
	public BankusingCOL(String name,String Atype) {
		this(name);
		this.Atype=Atype;
	}
	public BankusingCOL(String name,String Atype,double deposit) {
		this(name,Atype);
		this.deposit=deposit;
	}
	
	void display() {
		System.out.println("Name of The Bank Holder: " +name);
		if(Atype!=null) {
			System.out.println("Type of the Account: "+Atype);
			}
		if(deposit!=0) {
			System.out.println("Inital Deposit Amount: "+deposit);
		}
		System.out.println();
	}
	public static void main(String[] args) {
		BankusingCOL c=new BankusingCOL("Hari p");
		BankusingCOL c1=new BankusingCOL("Hari p","Savings");
		BankusingCOL c2=new BankusingCOL("Hari p","Savings",8500.50);
		c.display();
		c1.display();
		c2.display();
	}

}
