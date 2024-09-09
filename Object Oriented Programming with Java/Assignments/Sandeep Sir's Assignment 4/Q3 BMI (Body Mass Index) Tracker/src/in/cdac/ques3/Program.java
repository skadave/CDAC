package in.cdac.ques3;

import java.util.Scanner;


public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		BMITrackerUtil util = new BMITrackerUtil();
		
		int choice;
		
		while ( (choice = util.menuList(sc)) != 0) {
			
			switch(choice) {
			case 1: 
					util.acceptRecord(sc);
					util.calculateBMI();
					util.classifyBMI();
					break;
			case 2: util.printRecord();
					break;
			}
			
		
		}

	}

}
