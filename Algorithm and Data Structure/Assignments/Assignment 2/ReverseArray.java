import java.util.*;

public class ReverseArray{

public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter no. of elements: ");
	int n = sc.nextInt();
	
	int[] arr = new int[n];
	
	System.out.println("Enter elements of the array: ");
	for(int i=0; i<n; i++){
		arr[i] = sc.nextInt();
	}
	

	for(int start = 0, end = n-1; start<end; start++, end--){  // Set start = 0 i.e. at starting index of array & end = n-1 i.e. ending index of the array
		
		int temp = arr[start];   // Swapping logic to swap the first and last lement in the array
		arr[start] = arr[end];
		arr[end] = temp;
	}
// Keep running the loop until start becomes greater than end
//E.g. 6 elements -> 0  < 5   1 < 4   2 < 3   3 < 2 X  -> (even no. of elements) will stop when start becomes > end
//E.g. 5 elements -> 0  < 4  1  < 3  2 < 2 X -> (odd no. of elements) will stop when start is not less than end 
	
	for(int i=0; i<n; i++){
		System.out.print(arr[i] + " ");
	}

	


	}

}

/*Time Complexity: O(n)

Space Complexity: O(n)	
	
*/


