import java.util.Scanner;

public class GCD{

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

		
		while(a !=0 && b!=0)
	{
		if(a>b) 
			a = a%b;
		else 
			b = b%a;
	}
		if(a==0)
			System.out.print(b);
		if(b==0)
			System.out.print(a);

	
	}
		
}

//Time Complexity -> O(log n)  -> Not sure about this but the numbers are getting divided in each loop 
//Space Complexity -> O(1) 
