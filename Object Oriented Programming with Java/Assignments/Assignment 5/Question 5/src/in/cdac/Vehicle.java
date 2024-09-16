package in.cdac;

public abstract class Vehicle {
	protected String modelName;
	public Vehicle() {
		
	}
	
	public Vehicle(String modelName) {
		this.modelName = modelName;
	}
	
	abstract public void startEngine();
	
	abstract public void stopEngine();
	
	
}
