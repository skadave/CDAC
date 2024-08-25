/*
***** 
 **** 
  *** 
   ** 
    * 
	
	
*/

import java.util.Scanner;

class Pattern6{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //5
		System.out.println(" ");
		
		for(int row=1; row<=n; row++){
			for(int col=1; col<=row-1; col++){
				if(row==1){
					break;
				}
				System.out.print(" ");
			}
			
			for(int col=row; col<=n; col++){
				System.out.print("*");
			}
			
			
			System.out.println(" ");
		}
	}
}

/*Output:

C:\Users\Saurabh\Desktop\CDAC\Assignment 3\Section 3\Star-Number patterns>java Pattern6
5

*****
 ****
  ***
   **
    *
	
*/