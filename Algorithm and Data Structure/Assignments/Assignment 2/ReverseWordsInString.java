import java.util.*;

public class ReverseWordsInString{

public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter string: ");
	String str = sc.nextLine(); //Hello World
	
	StringTokenizer stk = new StringTokenizer(str);  //Tokenize the string (convert each word separated by space(default) into a separate string) using StringTokenizer
	
	List<String> list = new ArrayList<>(); //ArrayList of strings to store the tokenized strings
	
	while(stk.hasMoreTokens()){           //Check if there are tokens (words) available in the tokenized string
			list.add(stk.nextToken());   // Add each token into the ArrayList of strings
	}
	
	for(int i= list.size() -1; i>=0 ; i--)     // Print the ArrayList in reverse order starting from last index
		System.out.print(list.get(i) + " ");      
	}

}

/*Time Complexity: O(n)

Space Complexity: O(n)	
	
*/