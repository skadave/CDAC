package in.cdac.ques4;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		DiscountCalculator  obj1 = new DiscountCalculator ();
		obj1.acceptRecord(sc);
		obj1.calculateDiscount();
		obj1.printRecord();
		
		sc.close();

	}

}
