package in.cdac.ques4;

import java.util.Scanner;


public class Project {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DiscountCalculatorUtil util = new DiscountCalculatorUtil();
		
		int choice;
		
		while ( (choice = util.menuList(sc)) != 0) {
			
			switch(choice) {
			case 1: 
					util.acceptRecord(sc);
					util.calculateDiscount();
					break;
			case 2: util.printRecord();
					break;
			}
			
		
		}


	}

}
