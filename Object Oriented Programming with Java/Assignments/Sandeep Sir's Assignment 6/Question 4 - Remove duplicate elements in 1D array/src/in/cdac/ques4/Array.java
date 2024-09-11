package in.cdac.ques4;

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
		
	public static void removeDuplicates(int[] arr){
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
//			Arrays.sort(arrCopy);
//			System.out.println(Arrays.toString(arrCopy));
			System.out.print("Unique elements in the array are: ");
			for(int element:finalCopy) {
					System.out.print(element+" ");
			}
				
		}
		
	}

