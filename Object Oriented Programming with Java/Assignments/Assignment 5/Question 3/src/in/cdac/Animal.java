package in.cdac;

public class Animal {
	private String name;
	
	public Animal() {
		this("");
	}
	
	public Animal(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void eat() {
		System.out.println(this.name + " is eating food.");
	}
	
	public void sleep() {
		System.out.println(this.name + " is sleeping.");
	}
}
