package in.cdac.ques5;

import java.util.Scanner;



public class Tester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		TollBoothRevenueManager  obj1 = new TollBoothRevenueManager ();
		obj1.acceptRecord(sc);
		obj1.setTollRates(sc);
		obj1.calculateRevenue();
		obj1.printRecord();
		
		sc.close();

	}

}
