/*
1 
2*2 
3*3*3 
4*4*4*4 
5*5*5*5*5 
5*5*5*5*5 
4*4*4*4 
3*3*3 
2*2 
1 


*/


import java.util.Scanner;

class Pattern2{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //5
		int x = 0, y =0;
		System.out.println(" ");
/*
1 
2*2 
3*3*3 
4*4*4*4 
5*5*5*5*5 
*/
		for(int row=1; row<=n; row++){
			for(int col=1; col<=row+x; col++){
				if (col%2==0){
					System.out.print("*");
				}
				else
					System.out.print(row);
			}
			x++;
			System.out.println(" ");
		}
/*		
5*5*5*5*5 
4*4*4*4 
3*3*3 
2*2 
1 
*/	
		y = n;
		x = 0;
		for(int row=1; row<=n; row++){ //2
			for(int col=2*n-1; col >= row+x; col--){
				if (col%2==0){
					System.out.print("*");
				}
				else{
					System.out.print(y);
				}
			}
			y--;//4
			x++;
			System.out.println(" ");
		}
		
		
	}
}
/*Output:
C:\Users\Saurabh\Desktop\CDAC\Assignment 3\Section 3\Star-Number patterns>java Pattern2
5

1
2*2
3*3*3
4*4*4*4
5*5*5*5*5
5*5*5*5*5
4*4*4*4
3*3*3
2*2
1
*/