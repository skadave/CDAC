package in.cdac;

public class Dog extends Animal {
	
	public Dog() {
		
	}
	
	public Dog(String name) {
		super(name);
	}
	
	public void eat() {
		System.out.println(this.getName() + " is eating dog food.");
	}
	
	public void bark() {
		System.out.println(this.getName()+ " is barking.");
	}
}
