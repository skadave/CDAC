package in.cdac;

public class Main {

	public static void main(String[] args) {
		int n = 97;
		double d1 = n;
		float f1 = n;
//		boolean b1 = n; //Not OK
//		boolean b2 = (boolean)n; //Not Ok
		String s1 = Integer.toString(n);
		
		
		System.out.println(d1);
		System.out.println(f1);
		System.out.println(s1);

	}

}
