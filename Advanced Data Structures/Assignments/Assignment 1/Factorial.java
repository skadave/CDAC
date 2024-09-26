import java.util.Scanner;

// Factorial -> n! = n * (n-1)!        eg. 5! = 5 * 4 * 3 * 2 * 1 -> 5 * 4!
										 //4! = 4 * 3 * 2 *  1 -> 4 * 3!
										 
										//So if 5! is f(5) then f(5) = 5 * f(5-1) -> f(n) = n * f(n-1)

public class Factorial{

	public static int calcFactorial(int n){
	
	if(n==1 || n==0){  // 1! and 0! is 1. There return 1 for f(1) and f(0)
		return 1;
	}
	
	int factorial = n * calcFactorial(n-1);  // f(n) = n * f(n-1)  -> Recursive call
	return factorial;
	
	}



	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();    
		
		int factorial = calcFactorial(n);  // call method which will return the factorial value

			System.out.println(factorial);

		
	}
		
	}