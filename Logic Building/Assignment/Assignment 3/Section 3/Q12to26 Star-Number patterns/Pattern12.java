/*
11111 
22222 
33333 
44444 
55555 

*/

import java.util.Scanner;

class Pattern12{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(" ");
		
		for(int row=1; row<=n; row++){
			for(int col=1; col<=n; col++){
				System.out.print(row);
			}
			System.out.println(" ");
		}
	}
}

/*Output:
C:\Users\Saurabh\Desktop\CDAC\Assignment 3\Section 3\Star-Number patterns>java Pattern12
5

11111
22222
33333
44444
55555
*/