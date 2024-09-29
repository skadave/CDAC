import java.util.*;

public class ArrayManipulation{

public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter no. of elements: ");
	int n = sc.nextInt(); // 4

	int[] arr = new int[n]; // 0 0 0 0  
	
	System.out.print("Enter no. of queries: ");
	int q = sc.nextInt(); // 2
	
	int[][] queries = new int[q][3]; // [[1, 3, 50], [2, 4, 70]]
	
	// Getting the queries                         O(q*3)-> O(q)
	System.out.print("Enter queries elements: ");
	for(int row=0; row<queries.length; row++){
		for(int col=0; col<3; col++){
			queries[row][col] = sc.nextInt();
	}
	}
	// Inputing the values from queries into array   O(q*n)
	for(int i=0; i<q; i++){ // 0 to 1
		for(int j = queries[i][0] - 1; j < queries[i][1]; j++){ // 0 1 2 ; 
			arr[j] = arr[j] + queries[i][2];
		}
		
	}
	
	/*
	for(int i=0; i<n; i++){
			System.out.print(arr[i] + " ");
	}
	
	*/
	
	Arrays.sort(arr); //Sort array  O(n log n)
	System.out.println(arr[arr.length-1]); // Print last value (i.e. the max)
	
	
	
	
/*Time Complexity: O(q*n) -> q for the loop that runs to take queries and n for loop to calculate max value


Space Complexity: O(n)	
	
*/
	
	
	}

}

