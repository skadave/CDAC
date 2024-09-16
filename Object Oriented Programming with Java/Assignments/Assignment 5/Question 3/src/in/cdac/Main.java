package in.cdac;

public class Main {

	public static void main(String[] args) {
		Animal a1 = new Animal("Lucky");
		
		Dog d1 = new Dog("Ace");
		
		a1.eat();
		d1.eat();
		d1.bark();
		
		Animal a2 = new Dog("Buddy");
		
		a2.eat();
		a2.sleep();
		
		Dog d2 = (Dog)a2;
		d2.bark();

	}

}
