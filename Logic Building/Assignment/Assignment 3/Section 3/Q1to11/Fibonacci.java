// 5. Write a program to print the Fibonacci sequence up to the number 21. 

import java.util.Scanner;

class Fibonacci{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: "); //7
		int n = sc.nextInt(); //21
		System.out.println(" ");
		int prev = 0, next = 1, fib=0;
		if(n==0)
			System.out.println("0");
		else if(n==1)
			System.out.println("0 1");
		else{
			System.out.print("0 1 ");
			for(int i=1;i<=n;i++){
				fib = prev + next;
				prev = next;
				next = fib;
				System.out.print(fib + " ");
				if(fib==n)
					break;
		}
		}
	}
}

/*Output:
C:\Users\Saurabh\Desktop\CDAC\Assignment 3\Section 3\Q1to11>java Fibonacci
Enter a number: 21

0 1 1 2 3 5 8 13 21
C:\Users\Saurabh\Desktop\CDAC\Assignment 3\Section 3\Q1to11>
*/
