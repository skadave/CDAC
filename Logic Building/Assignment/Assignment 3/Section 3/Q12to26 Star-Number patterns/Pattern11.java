/*
********* 
******* 
***** 
*** 
* 
*** 
***** 
******* 
********* 
*/

import java.util.Scanner;

class Pattern11{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //9
		System.out.println(" ");
		int x=0;
		for(int row=1; row<=(n/2)+1; row++){
			for(int col=row; col<=n-x; col++){
				System.out.print("*");
			}
			
			x++;
			System.out.println(" ");
		}
		int y=2;
		for(int row=1; row<=(n/2); row++){
			for(int col=1; col<=row+y; col++){
				System.out.print("*");
			}
			
			y++;
			System.out.println(" ");
		}
	}
}

/*Output:
C:\Users\Saurabh\Desktop\CDAC\Assignment 3\Section 3\Star-Number patterns>java Pattern11
9

*********
*******
*****
***
*
***
*****
*******
*********

*/