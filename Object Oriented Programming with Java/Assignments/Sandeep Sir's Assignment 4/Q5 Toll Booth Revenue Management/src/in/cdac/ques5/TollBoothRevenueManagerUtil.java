package in.cdac.ques5;

import java.util.Scanner;

public class TollBoothRevenueManagerUtil {
	private TollBoothRevenueManager tm;
	private static Scanner sc;
	
	static{
		sc = new Scanner(System.in);
	}
	
	TollBoothRevenueManagerUtil(){
		this.tm = new TollBoothRevenueManager();
	}

	
	public void acceptRecord(){
		System.out.print("\nEnter the number of Cars: ");
		tm.setNoOfCars(sc.nextInt());
		System.out.print("Enter the number of Trucks: ");
		tm.setNoOfTrucks(sc.nextInt());
		System.out.print("Enter the number of Motorcycles: ");
		tm.setNoOfMotorcycles(sc.nextInt());
		System.out.print("Set the toll rate for Car: ");
		tm.setTollRateCar(sc.nextDouble());
		System.out.print("Set the toll rate for Truck: ");
		tm.setTollRateTruck(sc.nextDouble());
		System.out.print("Set the toll rate for Motorcycle: ");
		tm.setTollRateMotorcycle(sc.nextDouble());
	}
	
	
	public void calculateRevenue(){
		tm.setTotalNoOfVehicles(tm.getNoOfCars() + tm.getNoOfTrucks() + tm.getNoOfMotorcycles());
		tm.setTotalRevenue((tm.getTollRateCar() * tm.getNoOfCars()) + (tm.getTollRateTruck() * tm.getNoOfTrucks()) + (tm.getTollRateMotorcycle() * tm.getNoOfMotorcycles()));
		
	}
	
	public void printRecord(){
		System.out.println(this.toString());
	}

	
	public String toString(){
		return "\nTotal number of vehicles: "+ String.format("%d",tm.getTotalNoOfVehicles())+ 
				"\nTotal Revenue collected: "+ String.format("%.2f",tm.getTotalRevenue())+" Rs";
	}
	
	public static int menuList() {
		System.out.println("\n1. Accept Record\n2. Print Record\n0. Exit");
		System.out.print("Enter your choice: ");
		return sc.nextInt();
		
	}
	
	
}
