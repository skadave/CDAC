class Pattern8{
	public static void main(String[] args){
		int n=6;
		for(int row=1;row<=n;row++){
			for(int col=n-row+1;col<=n;col++){
			if(col==n)
				System.out.print(0);
			else
				System.out.print(col);
			}
			
			for(int col=n-1; col>=n-row+1; col--){
				System.out.print(col);	
			}
			
			/*
			for(int col=1;col<=row;col++){
				System.out.print(col+" ");
			}
			for(int col=row-1;col>=1;col--){
				System.out.print(col+" ");
			}
			*/
			System.out.println();
		}
	}
}

/*
6
56
456
3456
23456
123456


5
54
543
5432
54321
*/