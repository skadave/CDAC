package in.cdac.ques8;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayPrac a1 = new ArrayPrac(3);
		ArrayPrac a2 = new ArrayPrac(5);

		System.out.println("Enter elements for 1st array: ");
			for(int i=0;i<a1.getArr().length;i++) {
				System.out.print("arr["+i+"]: ");
				a1.getArr()[i] = sc.nextInt();
			}
			
		System.out.println("Enter elements for 2nd array: ");
			for(int i=0;i<a2.getArr().length;i++) {
				System.out.print("arr["+i+"]: ");
				a2.getArr()[i] = sc.nextInt();
			}
			
			

		
			
		System.out.println("Elements of 1st array: ");
			for(int i=0;i<a1.getArr().length;i++) {    //get the reference of array from ArrayPrac class from getter method
				System.out.print(a1.getArr()[i]+" ");
			}
		System.out.println();
		
		System.out.println("Elements of 2nd array: ");
			for(int i=0;i<a2.getArr().length;i++) {
				System.out.print(a2.getArr()[i]+" ");
			}
		
			
			sc.close();
			
		}
		
		
		
	}


