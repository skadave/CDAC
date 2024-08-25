/*
1 
1*2 
1*2*3 
1*2*3*4 
1*2*3*4*5
 
*/

import java.util.Scanner;

class Pattern8{
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
				    initialCol++;
				}
			}
			
			
			x++;
			System.out.println(" ");
		}
		
	}
}

/*Output:
C:\Users\Saurabh\Desktop\CDAC\Assignment 3\Section 3\Star-Number patterns>java Pattern8
5

1
1*2
1*2*3
1*2*3*4
1*2*3*4*5

*/