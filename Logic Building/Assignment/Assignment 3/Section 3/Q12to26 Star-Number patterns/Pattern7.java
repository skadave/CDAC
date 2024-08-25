/*
   * 
  *** 
 ***** 
******* 
 ***** 
  *** 
   * 
*/

import java.util.Scanner;

class Pattern7{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //7
		System.out.println(" ");
		int x=0;
		for(int row=1; row<=(n/2)+1; row++){
			for(int col=row; col<=(n/2); col++){
				System.out.print(" ");
			}
			
			for(int col=1; col<=row+x; col++){
				System.out.print("*");
			}
			
			x++;
			System.out.println(" ");
		}
		x=0;
		for(int row=1; row<=(n/2); row++){
			for(int col=1; col<=row; col++){
				System.out.print(" ");
			}
			
			for(int col=row; col<=(n-2)-x; col++){
				System.out.print("*");
			}
			
			x++;
			System.out.println(" ");
		}
	}
}

/*Output:
C:\Users\Saurabh\Desktop\CDAC\Assignment 3\Section 3\Star-Number patterns>java Pattern7
7

   *
  ***
 *****
*******
 *****
  ***
   *
 
 */