// Write a program to calculate the sum of the first 50 natural numbers

import java.util.Scanner;

class SumOfnNaturalNumbers{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		
		int sum = 0;
		for(int i=1;i<=n;i++){
			sum = sum + i;
		}
		System.out.println("Sum of first "+ n + " natural numbers is: " + sum);
	}
}

/*Output:
C:\Users\Saurabh\Desktop\CDAC\Assignment 3\Section 3\Q1to11>java SumOfnNaturalNumbers
Enter a number:
50
Sum of first 50 natural numbers is: 1275

*/
		