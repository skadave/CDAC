// 6. Write a program to find and print the first 5 prime numbers. 

import java.util.Scanner;

class FirstNPrimeNumbers{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: "); //7
		int n = sc.nextInt(); //5
		int count , primeCount = 0;
		System.out.println(" ");
		
		for(int i=2; primeCount<n; i++){
			count=0;
			for(int div=2;div<i;div++){
				if(i%div==0){
					count++;
					break;
				}
				
			}
			if(count==0)
			{
				System.out.print(i + " ");
				primeCount++;
			}
		}
	}
}

/*Output:
C:\Users\Saurabh\Desktop\CDAC\Assignment 3\Section 3\Q1to11>java FirstNPrimeNumbers
Enter a number: 5

2 3 5 7 11
*/