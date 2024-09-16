package in.cdac;

public class Vehicle {
	private String make;
	private int year;
	
	public Vehicle(){
		this.make ="";
	}
	public Vehicle(String make, int year){
		this.make =make;
		this.year = year;
	}
	
	public String toString(){
		return this.make + "  " + this.year;
	}
}
