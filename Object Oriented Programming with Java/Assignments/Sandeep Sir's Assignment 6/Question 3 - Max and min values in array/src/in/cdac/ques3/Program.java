package in.cdac.ques3;

import java.util.Arrays;
import java.util.Scanner;

public class Program {
	private static Scanner sc = new Scanner(System.in);
	
	public static void acceptRecord(int[] arr) {
		for(int i=0;i<arr.length;i++){
			System.out.print("Enter arr["+i+"]: ");
			arr[i]=sc.nextInt();
		}
	}
		
	public static void printRecord(int[] arr) {
		for(int i=0;i<arr.length;i++){
			System.out.println("arr["+i+"]: "+arr[i]);
			}
		
	}
	
	public static void maxValue(int[] arr) {
		int[] arrCopy = Arrays.copyOf(arr, 5);
		Arrays.sort(arrCopy);
		System.out.println("Max value in the array: "+ arrCopy[arrCopy.length-1]);
		
	}
	
	public static void minValue(int[] arr) {
		int[] arrCopy = Arrays.copyOf(arr, 5);
		Arrays.sort(arrCopy);
		System.out.println("Min value in the array: "+ arrCopy[0]);
		
	}
	
	
	
	public static void main(String[] args) {
		int[] arr = new int[5];
		Program.acceptRecord(arr);
		Program.printRecord(arr);
		
		Program.maxValue(arr);
		Program.minValue(arr);
		

	}

}
