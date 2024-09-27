import java.util.Scanner;
import java.util.*;

public class Palindrome{



	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	//	System.out.print("Enter a string: ");       
		String str = sc.nextLine();
		
		StringBuilder reverseStr = new StringBuilder();
		
		//for eg. consider String -> 121 
		for(int i=str.length() - 1; i>=0; i--){ //  traverse from last index(str.length() - 1) to 0 index
			reverseStr.append(str.charAt(i));    // append letters from last to first in another string (StringBuilder to append)
			}
			
			
		if(str.compareTo(reverseStr.toString()) == 0){   // compare the original string with reversed string (compareTo returns 0 if they are equal)
			System.out.print("true");

		}
		else
			System.out.print("false");

	}
		
}

//Time Complexity -> O(n)
//Space Complexity -> O(n)