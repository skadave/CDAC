
public class WorkingWithInteger {

	public static void main(String[] args) {

//		a.  Explore the Java API documentation for java.lang.Integer and observe its modifiers and super types
//		public class Object
//		
//		public abstract class Number
//		extends Object
//		
//		public final class Integer
//		extends Number
		
//		b. Size of integer
//		System.out.println(Integer.BYTES);
//		-> 4
		
//		c. Range of integer
//		System.out.println(Integer.MIN_VALUE);
//		-> -2147483648
		
//		System.out.println(Integer.MAX_VALUE);
//		-> 2147483647
		
//		d. converting int to String
//		int number = 896;
//		System.out.println(Integer.toString(number));
//		-> 896 (in String format)
		
//		e. converting String to int
//		String strNumber = "632";
//		System.out.println(Integer.parseInt(strNumber));
//		-> 632 (in int format)
		
//		f. converting String(non int format) to int
//		String strNumber = "Ab12Cd3";
//		System.out.println(Integer.parseInt(strNumber));
//		-> Exception in thread "main" java.lang.NumberFormatException: For input string: "Ab12Cd3"

//		g. converting int to Integer
//		int number = 35;
//		System.out.println(Integer.valueOf(number));
//		-> 35 (in Integer format)
		
//		h. converting String to Integer
//		String strNumber = "75";
//		System.out.println(Integer.valueOf(strNumber));
//		-> 75 (in Integer format)
		
//		i. adding 2 int numbers using method sum() of Integer class 
		
//		int n1 = 10, n2 = 20;
//		int add = Integer.sum(n1, n2);
//		System.out.println(add);
		
//		j. find minimum and maximum of 2 int numbers using min() and max() methods of Integer class
		
//		int n1 = 10, n2 = 20;
//		int minimum = Integer.min(n1, n2);
//		System.out.println(minimum);
//		-> 10
		
//		int n1 = 10, n2 = 20;
//		int maximum = Integer.max(n1, n2);
//		System.out.println(maximum);
//		-> 20
		
//		k. converting int to binary, octal, hexadecimal strings
//		int num = 7;
//		System.out.println(Integer.toBinaryString(num));
//		-> 111 (binary)
		
//		int num = 7;
//		System.out.println(Integer.toOctalString(num));
//		-> 7 (octal)
		
//		int num = 7;
//		System.out.println(Integer.toHexString(num));
//		-> 7 (hexadecimal)
		
//		l. converting int to primitive and vice versa
//		int number = 97;
		
		//Widening
//		float f1 = number;
//		double d1 = number;
//		long l1 = number;
		
		//Narrowing
//		float f1 = 24.56f;
//		double d1 = 54.32;
//		long l1 = 543;
		
//		int number = (int)f1;  //24
//		int number = (int)d1;  //54
//		int number = (int)l1;  //543
		
//		System.out.println(number);
		
		// Conversion between char and other primitive types is not called Widening or Narrowing. Rather, it is Type Conversion.
//		int number = 65;
//		char ch = (char)number;
//		
//		System.out.println(ch); //A
		
//		char ch = 'A';
//		int number = ch;  // character is stored as an integer internally so no need to type cast it to int
//		System.out.println(number); //65

		
		
		
	}

}
