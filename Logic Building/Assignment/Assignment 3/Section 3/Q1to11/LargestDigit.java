// 9. Write a program to find and print the largest digit in the number 4825.

import java.util.Scanner;

class LargestDigit{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //4825
		int lastDigit, count=0, backupN=n, temp=0;
		System.out.println(" ");
		
		while(backupN>0){           
			backupN = backupN/10;
			count++;                 // To calculate the count of digits
		}
		
		int arr[] = new int[count];  // Create an dynamic array to store the digits 
		
		for(int i=0; i<count; i++){
			lastDigit = n % 10;
			arr[i] = lastDigit;
			n = n/10;
			//System.out.print(arr[i]); 
			
		}
		
		for(int i = 0; i<count-1; i++){  // This loop will shift the largest digit towards the end of the array
			if(arr[i] > arr[i+1]){	// Swap current element with next if it is greater
				temp = arr[i+1];
				arr[i+1] = arr[i];
				arr[i] = temp;
		    }	
		}
		System.out.println(arr[count-1]);   // Print the last number in the array
	}
}

/*Output:
C:\Users\Saurabh\Desktop\CDAC\Assignment 3\Section 3\Q1to11>java LargestDigit
4825

8
*/
		
			