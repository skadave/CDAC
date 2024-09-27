import java.util.Scanner;
import java.util.*;

public class FirstNonRepeatedCharacter{


	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");       
		String str = sc.nextLine();
		boolean charFound = false;
		
		
		for(int i=0; i<str.length(); i++){
			if( (str.indexOf(str.charAt(i))) == (str.lastIndexOf(str.charAt(i))) ){  // The unique character which has no duplicates must have same first and last index
				System.out.println("'" + str.charAt(i) + "'");   
				charFound = true;                                          // Break out of loop as soon as first unique character is found
				break;
			}

		}
		if (charFound == false)
			System.out.println("null");
		
	
	}
		
}


//Time Complexity -> O(n^2) -> In for loop, indexOf and lastIndexOf also use loops to check for indexes
//Space Complexity -> O(n)