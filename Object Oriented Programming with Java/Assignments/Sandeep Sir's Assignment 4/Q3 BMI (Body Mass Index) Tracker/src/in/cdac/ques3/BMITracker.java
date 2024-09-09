package in.cdac.ques3;

public class BMITracker {

	private double weight;
	private double height;
	private double bmiValue;
	private String bmiClass;
	
	public BMITracker(){
		this.bmiClass = "0";
	}
	
	public String getBmiClass() {
		return bmiClass;
	}
	public void setBmiClass(String bmiClass) {
		this.bmiClass = bmiClass;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getBmiValue() {
		return bmiValue;
	}
	public void setBmiValue(double bmiValue) {
		this.bmiValue = bmiValue;
	}


	
	
	

	
}
