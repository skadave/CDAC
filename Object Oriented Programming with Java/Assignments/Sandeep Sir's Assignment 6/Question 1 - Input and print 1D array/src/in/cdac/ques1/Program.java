package in.cdac.ques1;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		
//		for(int i=0;i<arr.length;i++) {   //to print default values
//			System.out.print(arr[i]+" ");
//		}
//		System.out.println();            
//		for(int element:arr) {				//using for each loop
//			System.out.print(element+" ");
//		}
		System.out.println();
		
		for(int i=0;i<arr.length;i++) {
			System.out.print("Enter arr["+i+"]: ");
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<arr.length;i++) {   //to print updated values
			System.out.print(arr[i]+" ");
		}
		
		sc.close();
		

	}

}
