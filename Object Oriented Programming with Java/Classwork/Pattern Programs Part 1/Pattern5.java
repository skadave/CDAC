class Pattern5{
	public static void main(String[] args){
		int n=5;
		for(int row=1;row<=n;row++){
			for(int col=n-1;col>=row;col--){
				System.out.print("  ");
			}
			for(int col=1;col<=row;col++){
				System.out.print(col+" ");
			}
			for(int col=row-1;col>=1;col--){
				System.out.print(col+" ");
			}

			System.out.println();
		}
	}
}

/*
----1
---12
--123
-1234
12345

*/