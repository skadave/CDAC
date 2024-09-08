package in.cdac.ques5;

import java.util.Scanner;

public class TollBoothRevenueManager {
	private double tollRateCar;
	private double tollRateTruck;
	private double tollRateMotorcycle;
	private int noOfCars;
	private int noOfTrucks;
	private int noOfMotorcycles;
	private int totalNoOfVehicles;
	private double totalRevenue;

	
	public void acceptRecord(Scanner sc){
		System.out.print("Enter the number of Cars: ");
		this.noOfCars = sc.nextInt();
		System.out.print("Enter the number of Trucks: ");
		this.noOfTrucks = sc.nextInt();
		System.out.print("Enter the number of Motorcycles: ");
		this.noOfMotorcycles = sc.nextInt();

	}
	public void setTollRates(Scanner sc){
		System.out.print("Set the toll rate for Car: ");
		this.tollRateCar = sc.nextDouble();
		System.out.print("Set the toll rate for Truck: ");
		this.tollRateTruck = sc.nextDouble();
		System.out.print("Set the toll rate for Motorcycle: ");
		this.tollRateMotorcycle = sc.nextDouble();
	}
	
	public void calculateRevenue  (){
		totalNoOfVehicles = noOfCars + noOfTrucks + noOfMotorcycles;
		totalRevenue = (tollRateCar * noOfCars) + (tollRateTruck * noOfTrucks) + (tollRateMotorcycle * noOfMotorcycles);
		
	}
	
	public void printRecord(){
		System.out.println("Total number of vehicles: "+totalNoOfVehicles);
		System.out.printf("Total Revenue collected: %.2f Rs", totalRevenue);
	}

	
}
