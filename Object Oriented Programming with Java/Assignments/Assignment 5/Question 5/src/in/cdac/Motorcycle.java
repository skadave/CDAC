package in.cdac;

public class Motorcycle extends Vehicle{
	public Motorcycle() {
		
	}
	
	public Motorcycle(String modelName) {
		super(modelName);
	}
	
	
	public void startEngine() {
		System.out.println("Motorcycle " +this.modelName+"'s engine has been started.");
	}
	
	public void stopEngine() {
		System.out.println("Motorcycle " +this.modelName+"'s engine has been stopped.");
	}
}
