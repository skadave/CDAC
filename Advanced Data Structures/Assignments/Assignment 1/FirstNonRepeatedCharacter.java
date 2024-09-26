import java.util.Scanner;
import java.util.*;

public class FirstNonRepeatedCharacter{



	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");       
		String str = sc.nextLine();
		boolean charFound = false;
		
		
		for(int i=0; i<str.length(); i++){
			if( (str.indexOf(str.charAt(i))) == (str.lastIndexOf(str.charAt(i))) ){
				System.out.println("'" + str.charAt(i) + "'");
				charFound = true;
				break;
			}

		}
		if (charFound == false)
			System.out.println("null");
		
	
	}
		
}