package com.Constructor;

public class ConOverRidingShopping {
	String name;
	double price;
	String Category;
	public ConOverRidingShopping(String name) {
		this.name=name;
	}
	public ConOverRidingShopping(String name,double price) {
			this(name);
			this.price=price;
	}
	public ConOverRidingShopping(String name,double price,String Category) {
		this(name,price);
		this.Category=Category;
			
	}
	public void display() {
		
	
		System.out.println("Name of the Product: "+name);
		if(price!=0) {
			System.out.println("Price of this : "+price);
		}
		if(Category!=null)
		System.out.println("Categoty of this: "+ Category);
		System.out.println();
	}
	public static void main(String[]args) {
		ConOverRidingShopping c=new ConOverRidingShopping("TATA Product");
		ConOverRidingShopping c1=new ConOverRidingShopping("TATA Product",50000);
		ConOverRidingShopping c2=new ConOverRidingShopping("TATA Product",50000,"Online Product");
		c.display();
		c1.display();
		c2.display();
		
}
}
