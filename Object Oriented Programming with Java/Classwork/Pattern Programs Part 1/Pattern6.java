class Pattern6{
	public static void main(String[] args){
		int n=4;
		for(int row=1;row<=n;row++){
			for(int col=n-1;col>=row;col--){
				System.out.print(" ");
			}
			for(int col=1;col<=row;col++){
				System.out.print(col);
			}
			for(int col=row-1;col>=1;col--){
				System.out.print(col);
			}
		System.out.println();
		}
		int x=0, y=0;
		for(int row=1;row<=n-1;row++){
			for(int col=1;col<=row;col++){
				System.out.print(" ");
			}
			for(int col=1;col<=n-1-x;col++){
				System.out.print(col);
			}
			for(int col=n-2-y;col>=1;col--){
				System.out.print(col);
			}
		x++;
		y++;
		System.out.println();
		}
		
		
		
		
	}
}
		
		
			
		
/*

---1
--121
-12321
1234321

-
1
21
321
--------------------------
-12321
--121
---1

123
12
1


*/

