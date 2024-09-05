class pattern3{
	public static void main(String... args){
	int n=5; 
	int x=0;
	int col=0;
	char a= 'A';
	for(int row=1; row<=n;row++){
		for(col=row; col<=n-1; col++){

			System.out.print(" ");
		}
		
		for(col=1; col<=row+x; col++){
			System.out.print(a);
			a++;
		}
		if(row==n && col>row+x){
			System.out.print(a);
		}
		/*
		for(int col=row; col<=4; col++){
			System.out.print(" ");
		}
		for(int col=row; col>=1; col--){
			System.out.print(col);
		}
		*/
		
	x++;
	System.out.println(" ");
	System.out.println(" ");
	}
	
}
}
/*
     A 
	 
    BCD 
	
   EFGHI 
   
  JKLMNOP 
  
 QRSTUVWXYZ 
 
 
 
    A 
   BCD 
  EFGHI 
 JKLMNOP 
QRSTUVWXY  and at last row and col add Z 
 
A 
BCD 
EFGHI 
JKLMNOP 
QRSTUVWXYZ 



*/