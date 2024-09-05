class pattern1{
	public static void main(String... args){
	int n=6;
	int x=0;
	for(int row=1; row<=n;row++){

		for(int col=n-1; col>=row; col--){
			System.out.print(" ");
		}
		for(int col=1; col<=row+x; col++){
		if(col==1 || col==row+x || row==n)
			System.out.print("*");
		else
			System.out.print(" ");
		}
		/*
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
		*/
		
	x++;
	System.out.println(" ");
	}
	
	
}
}
/*
-----
----
---
--
-
*/