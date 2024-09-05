//Q7

//import java.util.Scanner;

class pattern7{
	public static void main(String... args){
	int n=5;
	int x;
	for(int row=1; row<=n;row++){
	x=1;
		for(int col=1; col<=row; col++){
			System.out.print(col);
		}
		for(int col=row; col<=n; col++){
			System.out.print(" ");
		}
		for(int col=row; col<=n-1; col++){
		if(col==n-1 && row==1)
			System.out.print(row);
		else
			System.out.print(" ");
		}
		for(int col=row; col>=1; col--){
		if(row==1)
			System.out.print(" ");
		else
			System.out.print(col);
		}
		
		
	System.out.println(" ");
	}
	
	
}
}
/*
1---------1    
12-------21    
123-----321
1234---4321
12345-54321
*/
	
