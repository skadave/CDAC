package in.cdac;

public class Main {

	public static void main(String[] args) {
		Vehicle v1 = new Car("Tata Nexon");
		Vehicle v2 = new Motorcycle("Pulsar");
		
		v1.startEngine();
		v1.stopEngine();
		
		System.out.println();
		
		v2.startEngine();
		v2.stopEngine();

	}

}
