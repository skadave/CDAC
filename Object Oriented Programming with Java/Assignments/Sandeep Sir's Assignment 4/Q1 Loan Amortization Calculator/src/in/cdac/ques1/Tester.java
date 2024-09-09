package in.cdac.ques1;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LoanAmortizationCalculatorUtil l1 = new LoanAmortizationCalculatorUtil();
		
		int choice;
		
		while ( (choice = l1.menuList(sc)) != 0) {
			
			switch(choice) {
			case 1: 
					l1.acceptRecord(sc);
					l1.calculateMonthlyPayment();
					break;
			case 2: l1.printRecord();
					break;
			}
			
		
		}
		


	}

}
