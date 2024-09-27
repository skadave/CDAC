//Using Recursion
import java.util.Scanner;
public class ArmstrongRec{
	
	public static int checkArmstrong(int n, int count, int sum){
		
		if(n == 0)
			return sum;
		
		int lastDigit = n%10;
		sum = sum + (int)Math.pow(lastDigit, count);
		return checkArmstrong(n/10, count, sum);
		
	}
	
	
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();     
		int nBackup = n; 
		
		int count = Integer.toString(n).length();
		
		int sum = 0;
		sum = checkArmstrong(n, count, sum);
		
		if(sum == nBackup){
			System.out.println("true");
		}
		else
			System.out.println("false");
		
		}
	}
	
	