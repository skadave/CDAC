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