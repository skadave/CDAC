// 8. Write a program to count down from 10 to 0, printing each number.
import java.util.Scanner;

class PrintNumbersFrom10to0{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //10
		
		for(int i=n; i>=0; i--){
			System.out.print(i + " ");
		}
	}
}
	
/* Output:
C:\Users\Saurabh\Desktop\CDAC\Assignment 3\Section 3\Q1to11>java PrintNumbersFrom10to0
10
10 9 8 7 6 5 4 3 2 1 0
C:\Users\Saurabh\Desktop\CDAC\Assignment 3\Section 3\Q1to11>

*/	