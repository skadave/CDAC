package in.cdac.ques1;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		LoanAmortizationCalculator obj1 = new LoanAmortizationCalculator();
		obj1.acceptRecord(sc);
		obj1.calculateMonthlyPayment();
		obj1.printRecord();
		

	}

}
