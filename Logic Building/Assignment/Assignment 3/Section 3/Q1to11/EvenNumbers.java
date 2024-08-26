// 10. Write a program to print all even numbers between 1 and 50.

import java.util.Scanner;

class EvenNumbers{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //50
		
		for(int i=1;i<=n;i++){
			if(i%2==0){
				System.out.print(i + " ");
			}
		}
	}
}

/*Output:
C:\Users\Saurabh\Desktop\CDAC\Assignment 3\Section 3\Q1to11>java EvenNumbers
50
2 4 6 8 10 12 14 16 18 20 22 24 26 28 30 32 34 36 38 40 42 44 46 48 50
C:\Users\Saurabh\Desktop\CDAC\Assignment 3\Section 3\Q1to11>

*/