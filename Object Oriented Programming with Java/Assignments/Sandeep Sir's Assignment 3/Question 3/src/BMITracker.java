import java.util.Scanner;

public class BMITracker {
	private double weight;
	private double height;
	private double bmiValue;


	
	
	public void acceptRecord(Scanner sc){
		System.out.print("Enter weight in kg: ");
		this.weight = sc.nextDouble();
		System.out.print("Enter height in meters: ");
		this.height = sc.nextDouble();

	}
	
	public void printRecord(){
		System.out.printf("BMI: %.2f\n", bmiValue);
	}

	
	public void calculateBMI(){
		bmiValue = weight / (height * height);
		
	}
	public void classifyBMI(){
		if(bmiValue<18.5)
			System.out.println("Underweight");
		else if(bmiValue>=18.5 && bmiValue<25)
			System.out.println("Normal weight");
		else if(bmiValue>=25 && bmiValue<30)
			System.out.println("Overweight");
		else
			System.out.println("Obese");
		
	}
}
