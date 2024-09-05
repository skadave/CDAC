class Pattern9{
	public static void main(String[] args){
		int n = 9;
		for(int row=1; row<=n; row++){
			for(int col=n-1; col>=row; col--)
			{
				System.out.print(" ");
			}
			
			for(int col=1;col<=row;col++){
					System.out.print(col);
			}
			
			System.out.print(" x "+ (n-1) +" + "+row+" = ");
			
			for(int col=n; col>n-row; col--)
			{
				System.out.print(col);
			}
			
			System.out.println();
	}
	}
}