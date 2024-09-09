package in.cdac.ques1;

import java.util.Scanner;

public class LoanAmortizationCalculatorUtil {
	
	LoanAmortizationCalculator obj1 = new LoanAmortizationCalculator();

	
	
	
	
	public void acceptRecord(Scanner sc){
		System.out.println("Enter Principal amount: ");
		obj1.setPrincipal( sc.nextDouble() );
		System.out.println("Enter Annual Interest Rate: ");
		obj1.setAnnualInterestRate( sc.nextDouble() );
		System.out.println("Enter Loan Term in years: ");
		obj1.setLoanTerm(sc.nextInt());
	}
	
	public void calculateMonthlyPayment(){
		obj1.setNumberOfMonths(obj1.getLoanTerm() * 12);
		obj1.setMonthlyInterestRate(obj1.getAnnualInterestRate() / 12 / 100);
		obj1.setMonthlyPayment(obj1.getPrincipal() * (obj1.getMonthlyInterestRate() * Math.pow((1 + obj1.getMonthlyInterestRate()),(obj1.getNumberOfMonths())))
				               / (Math.pow((1 + obj1.getMonthlyInterestRate()),(obj1.getNumberOfMonths())) - 1));
		obj1.setTotalAmountPaid(obj1.getMonthlyPayment() * obj1.getNumberOfMonths());
		
	}
	
	public String toString(){
		return "\nMonthly Payment: "+ String.format("%.2f",obj1.getMonthlyPayment())+ 
				" Rs\n\nTotal Amount to be Paid: "+ String.format("%.2f",obj1.getTotalAmountPaid()) + " Rs\n\n";
	}
	
	public void printRecord(){
		System.out.println(this.toString());
//		System.out.printf("Monthly Payment: %.2f Rs\n\n", obj1.getMonthlyPayment());
//		System.out.printf("Total Amount to be Paid: %.2f Rs\n\n", obj1.getTotalAmountPaid());
	}
	
	public int menuList(Scanner sc) {
		System.out.println("\n1. Accept Record\n2. Print Record\n0. Exit\n");
		
		return sc.nextInt();
		
	}
	
	
	
	
	
	
	
	
	
	
}
