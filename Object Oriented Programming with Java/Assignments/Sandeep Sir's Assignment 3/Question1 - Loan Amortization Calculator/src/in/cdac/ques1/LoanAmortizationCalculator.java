package in.cdac.ques1;

import java.util.Scanner;

public class LoanAmortizationCalculator {
	double principal;
	double annualInterestRate;
	int loanTerm;
	int numberOfMonths;
	double monthlyInterestRate;
	double monthlyPayment;
	double totalAmountPaid;
	
	
	void acceptRecord(Scanner sc){
		System.out.println("Enter Principal amount: ");
		this.principal = sc.nextDouble();
		System.out.println("Enter Annual Interest Rate: ");
		this.annualInterestRate = sc.nextDouble();
		System.out.println("Enter Loan Term in years: ");
		this.loanTerm = sc.nextInt();
	}
	
	void printRecord(){
		System.out.printf("Monthly Payment: %.2f Rs\n", this.monthlyPayment);
		System.out.printf("Total Amount to be Paid: %.2f Rs", this.totalAmountPaid);
	}

	
	void calculateMonthlyPayment(){
		numberOfMonths = loanTerm * 12;
		monthlyInterestRate = annualInterestRate / 12 / 100;
		monthlyPayment = principal * (monthlyInterestRate * Math.pow((1 + monthlyInterestRate),(numberOfMonths)))
				               / (Math.pow((1 + monthlyInterestRate),(numberOfMonths)) - 1);
		totalAmountPaid = monthlyPayment * numberOfMonths;
		
	}
	

}
