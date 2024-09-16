package in.cdac;

public class Car extends Vehicle{
	private String model;
	
	public Car() {
		this.model = "";
	}
	
	public Car(String make, int year, String model) {
		super(make,year);
		this.model = model;
	}
	
	public String toString() {
		return super.toString()+ "  "+ this.model;
	}

}
