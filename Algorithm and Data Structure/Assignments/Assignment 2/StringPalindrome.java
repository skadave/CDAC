import java.util.*;

public class StringPalindrome{

public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a string: ");
	String str = sc.nextLine();     
	
	boolean isPalindrome = true;
	
	for(int start=0, end=str.length()-1; start < end; start++, end--) //O(n/2) -> O(n)
	{
			if(str.charAt(start) != str.charAt(end))  // Comparing characters from both ends of the string 
			{
					isPalindrome = false;  // set flag to false if starting and ending characters are not equal
					break;
			}
	}
	if(isPalindrome)
	{
		System.out.println("true");
	}
	else
		System.out.println(false);
	 
	}

}

/*Time Complexity: O(n)

Space Complexity: O(n)	
	
*/