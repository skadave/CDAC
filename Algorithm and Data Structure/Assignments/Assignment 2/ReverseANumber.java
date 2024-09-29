import java.util.*;

public class ReverseANumber{

public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int n = sc.nextInt();       //1234 
	int lastDigit, reverseNum=0;
	while(n!=0){
		lastDigit = n%10;     // Take last digit of number by % 10  (will get last digit as remainder) // 4; 3; 2; 1
		reverseNum = (reverseNum * 10) + lastDigit;    // store that last digit in reverse number and then later keep multiplying by 10
							//	-> 0*10 + 4 -> 4 ; 4*10 +3 -> 43 ;

		n/=10;   // Keep dividing the original number by 10 -> 1234/10 -> 123 ...
	}

	System.out.println(reverseNum);	  
	}

}

/*Time Complexity: O(n) (n-> no. of digits in the number)

Space Complexity: O(1)	
	
*/