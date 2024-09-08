package in.cdac.ques4;

import java.util.Scanner;

public class DiscountCalculator {
	private double originalPrice;
	private double discountRate ;
	private double discountAmount;
	private double finalPrice;


	
	
	public void acceptRecord(Scanner sc){
		System.out.print("Enter the original price: ");
		this.originalPrice = sc.nextDouble();
		System.out.print("Enter the discount precentage: ");
		this.discountRate = sc.nextDouble();

	}
	
	public void calculateDiscount (){
		discountAmount = originalPrice * (discountRate / 100);
		finalPrice = originalPrice - discountAmount;
	}
	
	public void printRecord(){
		System.out.printf("Discount amount: %.2f Rs\n", discountAmount);
		System.out.printf("Final price: %.2f Rs", finalPrice);
	}

	


}
