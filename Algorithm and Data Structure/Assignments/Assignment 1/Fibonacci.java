import java.util.Scanner;
import java.util.Arrays;

public class Fibonacci{

	public static int calcFib(int n){
	
	if(n==0 || n==1){    // Fibonacci till 0th index is 0 and till 1st index is 1. 
		return n;			//Therefore, return 0 or 1 if n is 0 or 1 respectively.
	}
	
	int fib = calcFib(n-1) + calcFib(n-2);   //if current element is f(n) then f(n) = f(n-1) + f(n-2). Therefore, call the function recursively for prev elements
	return fib;
	
	}



	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");   //   n = 5     0 1 1 2 3
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++)
			arr[i] = calcFib(i);      // call the method to calculate fibonacci number at each index and store in array
	
		System.out.print(Arrays.toString(arr));
	
	
	}
		
}



//Height of this binary tree -> 5  i.e n
//             5                               	level0           max nodes-> 2^0  1  
//         4      3                           	level1           max nodes-> 2^1  2
//    3       2      2      1					level2 			max nodes-> 2^2   4
//  2  1    1  0    1  0  						level3 			max nodes-> 2^3   8
//1  0											level4 			max nodes-> 2^4   16

// Here, nodes are the recursive calls
// Max no. of nodes in a binary tree = 2^n = 2^5 = 32

//Therefore, Time Complexity -> O(2^n)

//Space Complexity -> O(n) 

//Since at any point, max no. of stacks created will be equal to n as they get destroyed every time they return control to their calling stack
// E.g. 5 -> 4 and 3 but f(4) will get called first then -> 3 and 2 but f(3) will get called first and so on
// so it will be f(5) -> f(4) ->f(3) ->f(2) ->f(1) -> Will return control back   
 