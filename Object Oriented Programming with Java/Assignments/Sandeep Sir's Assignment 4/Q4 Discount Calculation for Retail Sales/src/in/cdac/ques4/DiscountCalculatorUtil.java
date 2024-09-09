package in.cdac.ques4;

import java.util.Scanner;

public class DiscountCalculatorUtil {

	DiscountCalculator dc = new DiscountCalculator();
	
	public void acceptRecord(Scanner sc){
		System.out.print("\nEnter the original price: ");
		dc.setOriginalPrice(sc.nextDouble());
		System.out.print("Enter the discount precentage: ");
		dc.setDiscountRate(sc.nextDouble());

	}
	
	public void calculateDiscount (){
		dc.setDiscountAmount( dc.getOriginalPrice() * (dc.getDiscountRate() / 100) );
		dc.setFinalPrice(dc.getOriginalPrice() - dc.getDiscountAmount());
	}
	
	public void printRecord(){
		System.out.println(this.toString());
	}
	
	public String toString(){
		return "\nDiscount amount: "+ String.format("%.2f",dc.getDiscountAmount())+ 
				" Rs\nFinal price: "+ String.format("%.2f",dc.getFinalPrice()) + " Rs\n\n";
	}
	
	public int menuList(Scanner sc) {
		System.out.println("\n1. Accept Record\n2. Print Record\n0. Exit\n");
		
		return sc.nextInt();
		
	}
	
	
}
