// 7. Write a program to calculate the sum of the digits of the number 9876. The output should be 30 (9 + 8 + 7 + 6). 

import java.util.Scanner;

class SumOfDigits{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //9876
		
		int sum = 0, lastDigit, backupN = n;
		
		while(n>0){
			lastDigit = n % 10;
			sum = sum + lastDigit;
			n = n/10;
		}
		
		System.out.println("Sum of the digits of " + backupN + " is " + sum);
	}
}

/*Output:
C:\Users\Saurabh\Desktop\CDAC\Assignment 3\Section 3\Q1to11>java SumOfDigits
9876
Sum of the digits of 9876 is 30

*/
		
		