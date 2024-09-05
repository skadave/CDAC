class Pattern10{
	public static void main(String[] args){
		int n=7;
		int y;
		for(int row=1; row<=n-3;row++){
		y=1;
			for(int col=1;col<=row;col++){
				System.out.print((row*y)+" ");
				y++;
			}
		
		System.out.println();
		}
		
		for(int row=1; row<=n-4;row++){
		y=1;
			for(int col=row;col<=n-4;col++){
				System.out.print((  ( (n-3) + row)  * y)+" ");
				y++;
			}
		
		System.out.println();
		}
		
		
		
		
		
	}
}