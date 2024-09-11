package in.cdac.ques2;

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

	
	public static void main(String[] args) {
		int[] arr = new int[5];
		Program.acceptRecord(arr);
		Program.printRecord(arr);

	}

}
