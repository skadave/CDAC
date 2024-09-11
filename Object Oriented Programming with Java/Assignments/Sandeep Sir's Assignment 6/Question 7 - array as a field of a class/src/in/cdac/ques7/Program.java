package in.cdac.ques7;

public class Program {

	public static void main(String[] args) {
		
		ArrayPrac a1 = new ArrayPrac();
		ArrayPrac a2 = new ArrayPrac(7);
		
		System.out.println("Enter elements for 1st array");
		a1.acceptRecord();
		System.out.println();
		System.out.println("Enter elements for 2nd array");
		a2.acceptRecord();
		System.out.println();
		
		System.out.println("Elements of 1st array: ");
		a1.printRecord();
		System.out.println();
		System.out.println();
		System.out.println("Elements of 2nd array: ");
		a2.printRecord();
		
	}

}
