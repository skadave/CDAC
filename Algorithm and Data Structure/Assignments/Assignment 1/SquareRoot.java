import java.util.Scanner;

public class SquareRoot{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt(); 

			int squareRoot = (int)Math.sqrt(n); // cast result of Math.sqrt to integer
			System.out.print(squareRoot);
}}
	
//Time Complexity -> O(1)
//Space Complexity -> O(1)