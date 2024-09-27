import java.util.Scanner;

public class PrimeNumberRec{

	public static boolean checkPrime(int n, int count, int i){
	if(i>n){
		if(count==2) return true;
		return false;
	}
	if(n%i == 0) count++;
	return checkPrime(n,count,i+1);
	
	}


	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();    
		int count = 0, i=1;
		boolean primeStatus = checkPrime(n, count, i);
		if(primeStatus == true)
			System.out.println("true");
		else
			System.out.println("false");
		
	}
		
	}