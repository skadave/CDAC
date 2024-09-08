package in.cdac.ques2;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		CompoundInterestCalculator obj1 = new CompoundInterestCalculator();
		obj1.acceptRecord(sc);
		obj1.calculateFutureValue();
		obj1.printRecord();

	}

}
