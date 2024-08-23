/*
Question 4: Discount Calculation  
Write a program to calculate the discount based on the total purchase amount. Use the following 
criteria: 
 If the total purchase is greater than or equal to Rs.1000, apply a 20% discount. 
 If the total purchase is between Rs.500 and Rs.999, apply a 10% discount. 
 If the total purchase is less than Rs.500, apply a 5% discount. 
Additionally, if the user has a membership card, increase the discount by 5%. 
*/

class DiscountCalculation{
		public static void main(String args[]){
		double total = 400;
		boolean membership = false;
		if (total >= 1000){
			if(membership == true){
				total = total - (0.25 * total);  //25% discount
			}
			else{
				total = total - (0.2 * total);  //20% discount
			}
			
		}
		else if (total >= 500 && total <= 999){
			if(membership == true){
				total = total - (0.15 * total);  //15% discount
			}
			else{
				total = total - (0.1 * total);  //10% discount
			}
		}
		else{
			if(membership == true){
			total = total - (0.1 * total); //10% discount
			}
			else{
				total = total - (0.05 * total); //5% discount
			}
		}
		System.out.println("Total price after discount is:" + total);
			
	}
}