import java.util.*;

public class RemoveWhiteSpaces{

public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter string: ");
	String str = sc.nextLine();
	
	System.out.println(str.replace(" ","")); // replace() of String class replaces a character in the string with another character 
	


	}

}

/*Time Complexity: O(n)

Space Complexity: O(n)	
	
*/