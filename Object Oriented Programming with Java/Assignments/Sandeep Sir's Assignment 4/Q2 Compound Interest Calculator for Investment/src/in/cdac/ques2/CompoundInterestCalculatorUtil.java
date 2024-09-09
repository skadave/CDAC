package in.cdac.ques2;

import java.util.Scanner;

public class CompoundInterestCalculatorUtil {
	
	CompoundInterestCalculator cal = new CompoundInterestCalculator();
	
	public void acceptRecord(Scanner sc) {
		System.out.print("Enter the initial investment amount: ");
		cal.setPrincipal(sc.nextInt());
		System.out.print("Enter the annual interest rate: ");
		cal.setAnnualInterestRate(sc.nextDouble());
		System.out.print("Enter number of times the interest is compounded per year: ");
		cal.setNumberOfCompounds(sc.nextInt());
		System.out.print("Enter investment duration in years: ");
		cal.setYears(sc.nextInt());
	}
	
	public void calculateFutureValue() {
		cal.setFutureValue(cal.getPrincipal() * Math.pow((1 + cal.getAnnualInterestRate() / cal.getNumberOfCompounds()),(cal.getNumberOfCompounds() * cal.getYears())));
		cal.setTotalInterest(cal.getFutureValue() - cal.getPrincipal());
	}
	public void printRecord() {
		System.out.println(this.toString());
	}

	
	public String toString(){
		return "\nFuture Value: "+ String.format("%.2f",cal.getFutureValue())+ 
				" Rs\n\nTotal Interest Earned: "+ String.format("%.2f",cal.getTotalInterest()) + " Rs\n\n";
	}
	
	public int menuList(Scanner sc) {
		System.out.println("\n1. Accept Record\n2. Print Record\n0. Exit\n");
		
		return sc.nextInt();
		
	}
}
