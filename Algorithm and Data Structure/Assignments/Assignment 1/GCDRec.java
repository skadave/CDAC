import java.util.Scanner;

public class GCDRec{

	public static int calcGCD(int a, int b){
		
		if(a==0) return b;  //if any number is 0, then the other remaining value should be the GCD
		if(b==0) return a;
	
		if(a>b) a = a%b;
		else b = b%a;
	
		return calcGCD(a, b);  //pass the modified values of a and b to calcGCD(int a, int b)
		
	}


	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a: ");       
		int a = sc.nextInt();
		System.out.print("Enter b: ");     
		int b = sc.nextInt();
		
		// 5 , 15
		// a   b
		// b>a -> b%a, a    -> 15%5 = 0, 5  -> if any number becomes 0, the other number is the GCD (Euclideans Algorithm)
		// a>b -> a%b, b
		
		int gcd = calcGCD(a, b);  //call calcGCD(int a, int b) which will return the GCD value
		System.out.print("GCD is " + gcd);

	
	}
		
}