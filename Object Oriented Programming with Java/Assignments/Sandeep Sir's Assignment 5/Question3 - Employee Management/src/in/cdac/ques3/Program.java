package in.cdac.ques3;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		int choice;
		int choiceNext;
		double raise;
		double salaryNext;
		Scanner sc =new Scanner(System.in);
		
		Employee emp1 = new Employee("Rahul",2080,60000);
		Employee emp2 = new Employee("John",2081,55000);
		
		
//		System.out.println(emp1.getSalary());
//		System.out.println(emp2.getSalary());
//		System.out.println("Total salary expense of all Employees: "+Employee.calculateTotalSalaryExpense());
//		
//		emp1.applyRaise(15);
//		emp2.applyRaise(10);
//		System.out.println("After Raise");
//		System.out.println(emp1.getSalary());
//		System.out.println(emp2.getSalary());
//		
//		System.out.println("Total salary expense of all Employees: "+Employee.calculateTotalSalaryExpense());
//		System.out.println("Total no. of Employees: "+Employee.getTotalEmployees());
		
		
		
		while ((choice=Employee.menuList(sc))!=0) {
			switch(choice) {
			case 1: System.out.println("Total no. of employees:"+Employee.getNoOfEmployees());
				break;
			case 2: raise = sc.nextDouble();
					emp1.applyRaise(raise);
					emp2.applyRaise(raise);
				break;
			case 3: System.out.println("Total salary expense for all employees:"+Employee.calculateTotalSalaryExpense());
				break;
			case 4: System.out.println("1. Name: "+emp1.getName()+" ID: "+emp1.getId());
					System.out.println("2. Name: "+emp2.getName()+" ID: "+emp2.getId());
					choiceNext = sc.nextInt();
					switch(choiceNext) {
						case 1: System.out.println("Enter the new salary for this employee: ");
							salaryNext = sc.nextDouble();
							emp1.updateSalary(salaryNext);
							break;
						case 2: System.out.println("Enter the new salary for this employee: ");
							salaryNext = sc.nextDouble();
							emp2.updateSalary(salaryNext);
							break;
					 	}
				break;
					
			case 5: System.out.println("1. Name: "+emp1.getName()+" ID: "+emp1.getId());
					System.out.println("2. Name: "+emp2.getName()+" ID: "+emp2.getId());
			choiceNext = sc.nextInt();
			switch(choiceNext) {
				case 1: System.out.println("Salary of "+emp1.getName()+":");
				System.out.println(emp1.getSalary());
				break;
				case 2: System.out.println("Salary of "+emp2.getName()+":");
				System.out.println(emp2.getSalary());
				break;
			}
		}
			
	}
		
		
		sc.close();	
	}

}
