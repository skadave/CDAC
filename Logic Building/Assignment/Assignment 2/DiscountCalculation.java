/*
Question 4: Discount Calculation  
Write a program to calculate the discount based on the total purchase amount. Use the following 
criteria: 
 If the total purchase is greater than or equal to Rs.1000, apply a 20% discount. 
 If the total purchase is between Rs.500 and Rs.999, apply a 10% discount. 
 If the total purchase is less than Rs.500, apply a 5% discount. 
Additionally, if the user has a membership card, increase the discount by 5%. 
*/
import java.util.Scanner;
class DiscountCalculation{
		public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter total purchase amount: ");
		double total = sc.nextDouble();
		System.out.println("Do you have a membership? Enter YES or NO");
		String membership = sc.next();
		//boolean membership = false;
		if (total >= 1000){
			if(membership.equals("YES")){
				total = total - (0.25 * total);  //25% discount
			}
			else{
				total = total - (0.2 * total);  //20% discount
			}
			
		}
		else if (total >= 500 && total <= 999){
			if(membership.equals("YES")){
				total = total - (0.15 * total);  //15% discount
			}
			else{
				total = total - (0.1 * total);  //10% discount
			}
		}
		else{
			if(membership.equals("YES")){
			total = total - (0.1 * total); //10% discount
			}
			else{
				total = total - (0.05 * total); //5% discount
			}
		}
		System.out.println("Total price after discount is:" + total);
			
	}
}

/*Output:

C:\Users\Saurabh\Desktop\CDAC\Assignment 2>java DiscountCalculation
Enter total purchase amount: 1000
Do you have a membership? Enter YES or NO
YES
Total price after discount is:750.0

C:\Users\Saurabh\Desktop\CDAC\Assignment 2>java DiscountCalculation
Enter total purchase amount: 1000
Do you have a membership? Enter YES or NO
NO
Total price after discount is:800.0

C:\Users\Saurabh\Desktop\CDAC\Assignment 2>

*/