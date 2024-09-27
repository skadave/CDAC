import java.util.Scanner;

public class Armstrong{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();     //153
		int nBackup = n; //take backup of n
		
		int count = Integer.toString(n).length();
		
		int sum=0, lastDigit;
		
		for(int i=0; i<count; i++){ 
			lastDigit = n%10; //3 ; 5
			sum = sum + (int)Math.pow(lastDigit, count);  // 0 + 3^3  ;   3^3 + 5^3
			n /= 10;   //15 ; 
		}
		
		if(sum == nBackup){
			System.out.println("true");
		}
		else
			System.out.println("false");
		
		}
	}
	
/* Armstrong No.-> 153 = 1^3 + 5^3 + 3^3    (No. of digits is 3)
1. Take input from user

2. Calculate the count of digits in the input number eg. 153 -> 3 digits  (convert int to String then find length of string)
	int count = Integer.toString(n).length();

3. Now, we need to calculate 1^3 + 5^3 + 3^3 and then compare it with original value

4. Using for loop, separate the input number into individual digits using n%10 eg. 153%10 = 3; 15%10 = 5

5. Add the digit^count (3^3;5^3;1^3) into sum --> sum = sum + (int)Math.pow(lastDigit, count);

6. Keep dividing n/10  so that we can remove the units place

7. If sum == input number (3^3+5^3+1^3 == 153) -> Then it is Armstrong


Time Complexity -> O(n)
Space Complexity -> O(1)
*/
