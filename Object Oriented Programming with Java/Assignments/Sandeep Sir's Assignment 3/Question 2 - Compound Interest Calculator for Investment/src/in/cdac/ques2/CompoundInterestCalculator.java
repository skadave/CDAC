package in.cdac.ques2;

import java.util.Scanner;

public class CompoundInterestCalculator {
	private double principal;
	private double annualInterestRate;
	private double numberOfCompounds;
	private double years;
	private double futureValue;
	private double totalInterest;
	
	public void acceptRecord(Scanner sc) {
		System.out.print("Enter the initial investment amount: ");
		this.principal = sc.nextInt();
		System.out.print("Enter the annual interest rate: ");
		this.annualInterestRate = sc.nextDouble();
		System.out.print("Enter number of times the interest is compounded per year: ");
		this.numberOfCompounds = sc.nextInt();
		System.out.print("Enter investment duration in years: ");
		this.years = sc.nextInt();
	}
	
	public void calculateFutureValue() {
		futureValue = principal * Math.pow((1 + annualInterestRate / numberOfCompounds),(numberOfCompounds * years));
		totalInterest = futureValue - principal;
	}
	public void printRecord() {
		System.out.printf("Future Value: %.2f Rs\n",this.futureValue);
		System.out.printf("Total Interest Earned: %.2f Rs",this.totalInterest);
	}
}
