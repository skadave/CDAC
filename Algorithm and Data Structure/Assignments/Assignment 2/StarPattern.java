import java.util.Scanner;

public class StarPattern{

public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int n = sc.nextInt();
	
	for(int row=1; row<=n; row++){
		for(int col=1; col<=row; col++){
			System.out.print("*");
		}
	System.out.println();
	}

	}

}

/*
Time Complexity: O(n^2)

Space Complexity: O(n)	
	
*/