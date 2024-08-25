/*
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 
*/

import java.util.Scanner;

class Pattern15{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//5
		int x=0, y=1;
		System.out.println(" ");
		
		for(int row=1; row<=n; row++){
			for(int col=1; col<=row; col++){
				System.out.print(y + " ");
				y++;
			}
			
			x++;
			System.out.println(" ");
		}
	}
}

/*Output:
C:\Users\Saurabh\Desktop\CDAC\Assignment 3\Section 3\Star-Number patterns>java Pattern15
5

1
2 3
4 5 6
7 8 9 10
11 12 13 14 15

*/