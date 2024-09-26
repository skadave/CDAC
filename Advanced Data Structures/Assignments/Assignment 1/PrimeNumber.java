import java.util.Scanner;

public class PrimeNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();    
		int count = 0;
		for(int i=1; i<=n; i++){
			if(n%i==0){					//Check if the input number is completely divisible by any number from 1 to itself					
				count++;           // Increment count when the input number is completely divisble by any number from 1 to itself 
		}
		}
		if(count == 2)              //Prime number should only have 2 cofactors i.e. 1 and itself. Therefore, if count == 2, then it is a prime number
			System.out.println("true");
		else
			System.out.println("false");
		
	}
		
	}
	
//Time Complexity -> O(n)
