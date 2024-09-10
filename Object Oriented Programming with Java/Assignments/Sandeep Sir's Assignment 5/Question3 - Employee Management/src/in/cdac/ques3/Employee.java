package in.cdac.ques3;

import java.util.Scanner;

public class Employee {
	private String name;
	private int id;
	private double salary;
	private static int noOfEmployees;
	private static double totalSalary;
	
	
	
	static {
		
	}
	
	{
		Employee.noOfEmployees++;
	}
	
	public Employee() {
		this.name="";
	}

	
	
	public Employee(String name, int id, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
		totalSalary = totalSalary + salary;
	}
	
	
//	private static Scanner sc = new Scanner(System.in);



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}


	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public static int getNoOfEmployees() {
		return noOfEmployees;
	}



	public static void setNoOfEmployees(int noOfEmployees) {
		Employee.noOfEmployees = noOfEmployees;
	}


	public static double getTotalSalary() {
		return totalSalary;
	}


	public static void setTotalSalary(double totalSalary) {
		Employee.totalSalary = totalSalary;
	}


	
	
	
	
	
	
	
	

	public static int getTotalEmployees() {
		return Employee.getNoOfEmployees();
	}
	
	public void applyRaise(double percentage) {
		double raiseAmount = (percentage/100)*this.getSalary();
		this.setSalary(this.getSalary()+raiseAmount);
		
		setTotalSalary(getTotalSalary()+raiseAmount);
	}
	
	public static double calculateTotalSalaryExpense() {
		return getTotalSalary();
	}
	
	public void updateSalary(double newSalary) {
		setTotalSalary(getTotalSalary()-this.getSalary());
		this.setSalary(newSalary);
		setTotalSalary(getTotalSalary()+this.getSalary());
	}
	
	public static int menuList(Scanner sc) {
		System.out.println("1. Get total number of employees");
		System.out.println("2. Apply percentage raise to the salary of all employees");
		System.out.println("3. Get total salary expense of all employees");
		System.out.println("4. Update salary of an employee");
		System.out.println("5. Print salary of an employee");
		System.out.println("0. Exit");
		return sc.nextInt();
	}
	

}
