import java.util.Scanner;
import java.util.*;

public class RepeatedCharacters{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");       
		String str = sc.nextLine();          //input a string
		
		
		
		Set<Character> chSet = new HashSet<>();   // create a set to store the unique repeated characters  
		
		for(int i=0; i<str.length(); i++){
			
			// check if a character in the string is present at more than one index. If there is only occurence of the char, then its first occurence index should
			// be equal to its last occurence index E.g. -> gaming -> indexes of g are 0 and 5 thus it has repeated 
			// a's first and last index is same that is 1. Thus, it is not repeated in the String
			
			if( (str.indexOf(str.charAt(i))) != (str.lastIndexOf(str.charAt(i))) )   //checking if indexes of first and last occurence of char in the string are not equal
				//System.out.print("'"+str.charAt(i)+"'" + " ");
				chSet.add(str.charAt(i));                          // add the repeated characters in string to Set since we want the unique values from all the repeated letters
		}
		
		System.out.println(chSet);



		//System.out.println(chSet.toString().replace("[","['").replace("]","']").replace(",","', '"));
	
	}
		
}

//Time Complexity -> O(n^2) -> In for loop, indexOf and lastIndexOf also use loops to check for indexes
//Space Complexity -> O(n) 
