/*
1 
1*3 
1*3*5 
1*3*5*7 
1*3*5*7*9 
*/

import java.util.Scanner;

class Pattern10{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //5
		System.out.println(" ");
		int x=0;
		int initialCol;
		for(int row=1; row<=n; row++){
			initialCol=1;
			for(int col=1; col<=row+x; col++){
				if(col%2==0){
					System.out.print("*");
				}
				else{
					System.out.print(initialCol);
				    initialCol=initialCol+2;
				}
			}
			
			
			x++;
			System.out.println(" ");
		}
		
	}
}

/*Output:
C:\Users\Saurabh\Desktop\CDAC\Assignment 3\Section 3\Star-Number patterns>java Pattern10
5

1
1*3
1*3*5
1*3*5*7
1*3*5*7*9

*/