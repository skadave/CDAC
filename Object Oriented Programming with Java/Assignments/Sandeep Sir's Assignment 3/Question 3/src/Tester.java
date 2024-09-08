import java.util.Scanner;



public class Tester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		BMITracker obj1 = new BMITracker();
		obj1.acceptRecord(sc);
		obj1.calculateBMI();
		obj1.printRecord();
		obj1.classifyBMI();
		
		sc.close();

	}

}
