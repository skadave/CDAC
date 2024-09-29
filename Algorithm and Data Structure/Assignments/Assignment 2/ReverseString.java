import java.util.*;

public class ReverseString{

public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter string: ");
	String str = sc.nextLine();
	
	StringBuilder strB = new StringBuilder(str); // Created a StringBuilder string by passing it a String (we need reverse method of StringBuilder)
	
	System.out.println(strB.reverse()); // Reversed the string using reverse() of StringBuilder
	


	}

}

/*Time Complexity: O(n)

Space Complexity: O(n)	
	
*/