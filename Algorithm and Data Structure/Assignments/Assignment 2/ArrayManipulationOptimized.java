import java.util.*;

public class ArrayManipulationOptimized{

public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter no. of elements: ");
	int n = sc.nextInt(); // 4

	int[] arr = new int[n]; // 0 0 0 0  
	
	System.out.print("Enter no. of queries: ");
	int q = sc.nextInt(); // 2
	
	for(int i=0; i<2; i++){
		int startIndex = sc.nextInt() - 1 ; //1-1 = 0 <- since we start from 0th index
		int endIndex = sc.nextInt() - 1; //3-1 = 2
		int value = sc.nextInt();  // 3
		
		// We are using method of adding the value just at the start index and assuming that next 0s are that value as well
		// We will set -value to indicate that the value is note present from here on out and it needs to be removed from sum that we will be calculating
		arr[startIndex] = arr[startIndex] + value; //add value at startindex  e.g. 3 0 0
		
		if(endIndex < n-1){ // because if we are going to add -value at endindex+1, endindex should be less than the last index else it will go out of bond
			arr[endIndex+1] = arr[endIndex+1] - value; //add -value at endindex+1  e.g. 3 0 0 -3  to indicate that value was not added from here on
		// Since we are going to add the values and store in a variable currentSum, there needs to be a -value so that value gets removed from the currentSum
		}
	}
	
	int max = Integer.MIN_VALUE;
	int currentSum = 0;
	for(int i=0; i<n; i++){
		currentSum = currentSum + arr[i];
		if(currentSum > max){
			max = currentSum;
		}
		
	}
	
	System.out.println(max);
	
		
	}

}

/*Time Complexity: O(q+n) -> q for the loop that runs to take queries and n for loop to calculate max value


Space Complexity: O(n)
*/
