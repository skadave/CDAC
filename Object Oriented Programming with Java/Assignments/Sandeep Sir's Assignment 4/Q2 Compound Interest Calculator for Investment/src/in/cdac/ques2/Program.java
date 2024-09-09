package in.cdac.ques2;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CompoundInterestCalculatorUtil util = new CompoundInterestCalculatorUtil();
		
		int choice;
		
		while ( (choice = util.menuList(sc)) != 0) {
			
			switch(choice) {
			case 1: 
					util.acceptRecord(sc);
					util.calculateFutureValue();
					break;
			case 2: util.printRecord();
					break;
			}
			
		
		}

	}

}
