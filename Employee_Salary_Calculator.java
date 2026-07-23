package com.Polymorphism.MethodOverLoading;

public class Employee_Salary_Calculator {
	double basicSalary;
	double bonus;
	double overtime;
	 
	void calculateSalary(double basicSalary) {
		System.out.println("This is only basic Salary :"+basicSalary);
	}
	void calculateSalary(double basicSalary,double bonus) {
		System.out.printf(" This is Salary with includes Bonus: %.2f%n",+basicSalary+bonus);
		//System.out.println();
	}
	void calculateSalary(double basicSalary,double bonus,double overtime) {
		System.out.printf("THis for Salry along with Bonus, overtime: %.2f%n ", +basicSalary+bonus+overtime);
	}
	public static void main(String[]args) {
		Employee_Salary_Calculator e=new Employee_Salary_Calculator();
		e.calculateSalary(45000.0);
		e.calculateSalary(45000.0, 456.20);
		e.calculateSalary(450000.0, 4500, 1500);
	}

}

