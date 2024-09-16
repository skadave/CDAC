package in.cdac;

public class Main {

	public static void main(String[] args) {
		int a = 32;
		double b = 72.34;
		float c = 10.0f;
		
		double sum = a + b + c;
		float multiply = a * c;
		int multiplyInt = (int)(a * c);
		float sum1 = (float)(a + b + c);
		double multiplyDouble = a * c;

		System.out.println(sum);
		System.out.println(multiply);
		System.out.println(sum1);
		System.out.println(multiplyInt);
		System.out.println(multiplyDouble);

	}
}
