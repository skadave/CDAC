package in.cdac.ques6;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int missing=0;
//		int[] arr = new int[] {1,2,3,4,6,7}; //missing number is 3 
		                     //0 1 2 3
		
		System.out.print("Enter the size of array: ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		for(int i=0;i<arr.length;i++) {
			System.out.print("arr["+i+"]: ");
			arr[i]=sc.nextInt();
		}
		System.out.println();
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] != i+1) {    //1 != 1     2!=2   4!=3
				missing = i+1;
				break;
			}
		}
		
		System.out.println("Missing number from the array is "+missing);
		
		
		
		

	}

}
