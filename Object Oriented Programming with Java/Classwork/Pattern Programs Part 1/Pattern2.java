class Pattern2{
	public static void main(String[] args){
		int n=6;
		int x=0;
		for(int row=1;row<=n;row++){
			for(int col=1;col<=row;col++){
				System.out.print(" ");
			}
			for(int col=(2*n)-1;col>=row+x;col--){
			if(col==row+x || row == 1 || col == (2*n)-1)
				System.out.print("*");
			else
				System.out.print(" ");	
			}
			
			
			x++;
			System.out.println();
		}
	}
}
			
			



/*

-
--
---
----
-----

*/