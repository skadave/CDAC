package in.cdac.ques5;

public class TollBoothRevenueManager {
	private double tollRateCar;
	private double tollRateTruck;
	private double tollRateMotorcycle;
	private int noOfCars;
	private int noOfTrucks;
	private int noOfMotorcycles;
	private int totalNoOfVehicles;
	private double totalRevenue;
	
	
	public void setTollRateCar(double tollRateCar){
		this.tollRateCar = tollRateCar;
	}
	
	public double getTollRateCar() {
		return this.tollRateCar;
	}

	public double getTollRateTruck() {
		return tollRateTruck;
	}

	public void setTollRateTruck(double tollRateTruck) {
		this.tollRateTruck = tollRateTruck;
	}

	public double getTollRateMotorcycle() {
		return tollRateMotorcycle;
	}

	public void setTollRateMotorcycle(double tollRateMotorcycle) {
		this.tollRateMotorcycle = tollRateMotorcycle;
	}

	public int getNoOfCars() {
		return noOfCars;
	}

	public void setNoOfCars(int noOfCars) {
		this.noOfCars = noOfCars;
	}

	public int getNoOfTrucks() {
		return noOfTrucks;
	}

	public void setNoOfTrucks(int noOfTrucks) {
		this.noOfTrucks = noOfTrucks;
	}

	public int getNoOfMotorcycles() {
		return noOfMotorcycles;
	}

	public void setNoOfMotorcycles(int noOfMotorcycles) {
		this.noOfMotorcycles = noOfMotorcycles;
	}

	public int getTotalNoOfVehicles() {
		return totalNoOfVehicles;
	}

	public void setTotalNoOfVehicles(int totalNoOfVehicles) {
		this.totalNoOfVehicles = totalNoOfVehicles;
	}

	public double getTotalRevenue() {
		return totalRevenue;
	}

	public void setTotalRevenue(double totalRevenue) {
		this.totalRevenue = totalRevenue;
	}
	
	
	


}
