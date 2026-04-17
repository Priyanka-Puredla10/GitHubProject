package com.flm;

public class Employee {
	//Instance variable / global variable
	int EmployeeId;
	int salary;
	String name;
	
	//static variable
	static String companyName;

	public static void main(String[] args) {
		//local variable
		int num=10;
		System.out.println(num);
		
		//creating objects
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		
		//Assigning value to static variable
		Employee.companyName = "Infosys";
		
		//Assigning a values to instance variable
		e1.EmployeeId = 123;
		e1.salary = 100000;
		e1.name = "priya";
		
		e2.EmployeeId = 1234;
		e2.salary = 200000;
		e2.name = "riya";
		
		System.out.println(e1.name);
		System.out.println(e2.name);
		System.out.println(Employee.companyName);
		
		//change the static variable
		Employee.companyName = "TCS";
		
		System.out.println(Employee.companyName);//testing github
	}
}

