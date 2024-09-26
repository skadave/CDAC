import java.util.Scanner;
import java.util.*;

public class Palindrome{



	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");       
		String str = sc.nextLine();
		
		//ArrayList<Character> list = new ArrayList<>();
		StringBuilder reverseStr = new StringBuilder();
		
		for(int i=str.length() - 1; i>=0; i--){
			reverseStr.append(str.charAt(i));
			}
			
			
		if(str.compareTo(reverseStr.toString()) == 0){
			System.out.print("true");

		}
		else
			System.out.print("false");

	}
		
}