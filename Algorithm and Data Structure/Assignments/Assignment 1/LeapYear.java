import java.util.Scanner;


public class LeapYear{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter year: ");       
		int year = sc.nextInt();
		
		if( (year % 4 == 0 && year % 100 != 0 )  || year % 400 ==0)  // Condition to check leap year (divisible by 4 and not divisible by 100 OR divisible by 400)
			System.out.print("true");
		else
			System.out.print("false");
	}
		
}
//Time Complexity -> O(1)
//Space Complexity -> O(1)
