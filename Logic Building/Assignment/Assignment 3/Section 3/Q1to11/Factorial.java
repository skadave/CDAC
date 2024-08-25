// 2. Write a program to compute the factorial of the number 10.
 

import java.util.Scanner;

class Factorial{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		
		int fact = 1;
		for(int i=1;i<=n;i++){
			fact = fact * i;
		}
		System.out.println("Factorial of "+ n + " is: " + fact);
	}
}

/*Output:
C:\Users\Saurabh\Desktop\CDAC\Assignment 3\Section 3\Q1to11>java Factorial
Enter a number:
10
Factorial of 10 is: 3628800
*/