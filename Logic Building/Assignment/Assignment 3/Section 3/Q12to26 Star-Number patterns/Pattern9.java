/*
5 
5*4 
5*4*3 
5*4*3*2 
5*4*3*2*1 

*/

import java.util.Scanner;

class Pattern9{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //5
		System.out.println(" ");
		int x=0;
		int initialCol;
		for(int row=1; row<=n; row++){
			initialCol=n;
			for(int col=1; col<=row+x; col++){
				if(col%2==0){
					System.out.print("*");
				}
				else{
					System.out.print(initialCol);
				    initialCol--;
				}
			}
			
			
			x++;
			System.out.println(" ");
		}
		
	}
}
/*Output:

C:\Users\Saurabh\Desktop\CDAC\Assignment 3\Section 3\Star-Number patterns>java Pattern9
5

5
5*4
5*4*3
5*4*3*2
5*4*3*2*1

*/