package in.cdac;

public class Car extends Vehicle{
	
	public Car() {
		
	}
	
	public Car(String modelName) {
		super(modelName);
	}
	
	public void startEngine() {
		System.out.println("Car "+this.modelName+"'s engine has been started.");
	}
	
	public void stopEngine() {
		System.out.println("Car "+this.modelName+"'s engine has been stopped.");
	}

}
