package in.cdac.ques3;

import java.util.Scanner;

public class BMITrackerUtil {
	BMITracker b = new BMITracker();
	
	public void acceptRecord(Scanner sc){
		System.out.print("Enter weight in kg: ");
		b.setWeight(sc.nextDouble());
		System.out.print("Enter height in meters: ");
		b.setHeight(sc.nextDouble());

	}
	
	public void printRecord(){
		System.out.println(this.toString());
	}

	
	public void calculateBMI(){
		b.setBmiValue(b.getWeight() / (b.getHeight() * b.getHeight()));
		
	}
	public void classifyBMI(){
		if(b.getBmiValue()<18.5)
			b.setBmiClass("Underweight");
		else if(b.getBmiValue()>=18.5 && b.getBmiValue()<25)
			b.setBmiClass("Normal weight");
		else if(b.getBmiValue()>=25 && b.getBmiValue()<30)
			b.setBmiClass("Overweight");
		else
			b.setBmiClass("Obese");
		
	}
	
	public String toString(){
		return "\nBMI: "+ String.format("%.2f",b.getBmiValue())+"\n"+b.getBmiClass(); 
	}
	
	public int menuList(Scanner sc) {
		System.out.println("\n1. Accept Record\n2. Print Record\n0. Exit\n");
		
		return sc.nextInt();
		
	}
}
