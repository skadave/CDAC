package in.cdac.ques5;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
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
	
	public static int[] removeDuplicates(int[] arr){
		int[] arrCopy = Arrays.copyOf(arr, arr.length);
		Arrays.sort(arrCopy);   //5 2 7 5 2  -> 2 2 5 5 7
		int[] anotherCopy = new int[arr.length];
		int j=0;
		int i=0;
		for(i=0;i<arrCopy.length-1;i++) {
				if (arrCopy[i]!=arrCopy[i+1]) {
					anotherCopy[j]=arrCopy[i];      //2 2 5 5 7 -> 2 5  (store the last element from 1 1 1 i.e 1 in anotherCopy)
					j++;
				}		
			
		}
		anotherCopy[j]=arrCopy[i];   // to get the last element
		int[] finalCopy = new int[j+1];
		for(int k=0;k<finalCopy.length;k++) {
			finalCopy[k]=anotherCopy[k];             // created another array to store the elements not the 0s at the last
		}
//		Arrays.sort(arrCopy);
//		System.out.println(Arrays.toString(arrCopy));
//		System.out.print("Unique elements in the array are: ");
//		for(int element:finalCopy) {
//				System.out.print(element+" ");
//		}
		
		return finalCopy;
		
	}
	
		
	public static void findIntersection(int[] arr1, int[] arr2) {
		int[] temp = new int[Integer.max(arr1.length,arr2.length)];  // 0 0 0
		int k=0;
		for(int i=0;i<arr1.length;i++) { // 1 2 3
			for(int j=0;j<arr2.length;j++) { // 3 4
				if(arr1[i]==arr2[j]) {
					temp[k]=arr1[i];
					k++;
				}
			}
		}
		
		int[] tempNew = new int[k];
		for(int i=0;i<tempNew.length;i++) {
			tempNew[i]=temp[i];                      // to get the starting elements that are not 0 (default is 0 for rest)
		}
		System.out.print("The common elements from both the arrays are: ");
		for(int element:tempNew) {
			System.out.print(element+" ");
		}
		
	}
	
}
