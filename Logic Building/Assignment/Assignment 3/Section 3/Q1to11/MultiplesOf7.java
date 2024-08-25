// 3. Write a program to print all multiples of 7 between 1 and 100. 

import java.util.Scanner;

class MultiplesOf7{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: "); //7
		int n = sc.nextInt();
		System.out.println(" ");
		
		for(int i=1;i<=100;i++){
			if(i%7==0)
				System.out.print(i + " ");
		}
	}
}

/*Output:
C:\Users\Saurabh\Desktop\CDAC\Assignment 3\Section 3\Q1to11>java MultiplesOf7
Enter a number: 7

7 14 21 28 35 42 49 56 63 70 77 84 91 98

*/