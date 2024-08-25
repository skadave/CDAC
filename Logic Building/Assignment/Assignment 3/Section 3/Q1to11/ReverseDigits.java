// 4. Write a program to reverse the digits of the number 1234. The output should be 4321. 

import java.util.Scanner;

class ReverseDigits{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: "); //7
		int n = sc.nextInt(); //1234
		System.out.println(" ");
		int i = 0, lastDigit;
		
		while(n>0){
			lastDigit = n % 10;
			//arr[i] = lastDigit;
			n = n/10;
			i++;
			System.out.print(lastDigit);
		}
	}
}

/*Output:
C:\Users\Saurabh\Desktop\CDAC\Assignment 3\Section 3\Q1to11>java ReverseDigits
Enter a number: 1234

4321
*/