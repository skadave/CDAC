import java.util.*;

public class ArrayLeftRotation{
	
	static void reverseArray(int[] arr, int i, int n){
		int temp;
		for(int start=i, end=n-1; start<end; start++, end--){
				temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
		}
		
	}
	

public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter no. of elements ");
	int n = sc.nextInt();

	int[] arr = new int[n];
	
	System.out.print("Enter elements ");
	for(int i=0; i<n;i++){
		arr[i] = sc.nextInt();
	}
	
	System.out.print("By how many positions do you want to shift the array to the left? ");
	int d = sc.nextInt();
	d = d % arr.length; // Because if we shift the elements by d (e.g. 6) then shifting by 6%5=>1 would give the same array 
				// 1 2 3 4 5
				// Shifting left by 6->2 3 4 5 1    and  Shifting left by 1 -> 2 3 4 5 1
	// Also, this helps the code work if array size is less than the positions to be shifted
				
				
	reverseArray(arr, 0, n);  // Reverse the entire array first -> 5 4 3 2 1
	// if d = 2 -> 2 % 5 -> 2                                                         0   2
	reverseArray(arr, 0, n-d); // Reverse the array from 0th index to n-d-1 index  -> 3 4 5  2  1 
	//                                     												     3  4
	reverseArray(arr, n-d, n); // Reverse the array from n-d index to n-1 index  ->   3 4 5  1  2
	
	// Hence, we got the array shifted left by 2 places
	
		for(int i=0; i<n;i++){
		System.out.print(arr[i]+" ");
	}
	
	
	
	
	
	
	}

}

/*
Time Complexity: O(n) 

Space Complexity: O(n)	
	
*/