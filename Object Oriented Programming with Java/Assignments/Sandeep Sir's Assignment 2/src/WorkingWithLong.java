
public class WorkingWithLong {

	public static void main(String[] args) {
//		a. Explore the Java API documentation for java.lang.Long and observe its modifiers and super types.
//		public class Object
//		
//		public abstract class Number
//		extends Object
//		
//		public final class Long
//		extends Number
		
//		b. Write a program to test how many bytes are used to represent a long value 
//		using the BYTES field. (Hint: Use Long.BYTES).
//		System.out.println(Long.BYTES);
//		-> 8
		
//		c. Write a program to find the minimum and maximum values of long using 
//		the MIN_VALUE and MAX_VALUE fields. (Hint: Use Long.MIN_VALUE and Long.MAX_VALUE).
//		System.out.println(Long.MIN_VALUE);
//		-> -9223372036854775808
		
//		System.out.println(Long.MAX_VALUE);
//		-> 9223372036854775807
		
//		d. Declare a method-local variable number of type long with some value and 
//		convert it to a String using the toString method. (Hint: Use Long.toString(long)).
//		long number = 76;
//		System.out.println(Long.toString(number));
//		-> 76 (in String format)
		
//		e. Declare a method-local variable strNumber of type String with some value 
//		and convert it to a long value using the parseLong method. (Hint: Use Long.parseLong(String)).
//		String strNumber = "56";
//		System.out.println(Long.parseLong(strNumber));
//		-> 56 (in long format)
		
//		f. Declare a method-local variable strNumber of type String with the value "Ab12Cd3" and 
//		attempt to convert it to a long value. (Hint: parseLong method will throw a NumberFormatException).
//		String strNumber = "Ab12Cd3";
//		System.out.println(Long.parseLong(strNumber));
//		-> Exception in thread "main" java.lang.NumberFormatException: For input string: "Ab12Cd3"
//		at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
//		at java.base/java.lang.Long.parseLong(Long.java:709)

//		g. Declare a method-local variable number of type long with some value and 
//		convert it to the corresponding wrapper class using Long.valueOf(). (Hint: Use Long.valueOf(long)).
//		long number = 21;
//		System.out.println(Long.valueOf(number));
//		-> 21 (in Long format)
		
//		h. Declare a method-local variable strNumber of type String with some long value and
//      convert it to the corresponding wrapper class using Long.valueOf(). (Hint: Use Long.valueOf(String)).
//		String strNumber = "900";
//		System.out.println(Long.valueOf(strNumber));
//		-> 900 (in Long format)
		
//		i. Declare two long variables with values 1123 and 9845, and add them using
//		a method from the Long class. (Hint: Use Long.sum(long, long)). 
//		long n1 = 1123, n2 = 9845;
//		long add = Long.sum(n1, n2);
//		System.out.println(add);
//		-> 10968
		
//		j. Declare two long variables with values 1122 and 5566, and find the minimum and
//      maximum values using the Long class. (Hint: Use Long.min(long, long) and Long.max(long, long)).
//		long n1 = 1122, n2 = 5566;
//		long minimum = Long.min(n1, n2);
//		System.out.println(minimum);
//		-> 1122
		
//		long n1 = 1122, n2 = 5566;
//		long maximum = Long.max(n1, n2);
//		System.out.println(maximum);
//		-> 5566
		
//		k. Declare a long variable with the value 7. Convert it to binary, octal, 
//		and hexadecimal strings using methods from the Long class. 
//		(Hint: Use Long.toBinaryString(long), Long.toOctalString(long), and Long.toHexString(long)).
//		long num = 7;
//		System.out.println(Long.toBinaryString(num));
//		-> 111 (binary)
		
//		long num = 7;
//		System.out.println(Long.toOctalString(num));
//		-> 7 (octal)
		
//		long num = 17;
//		System.out.println(Long.toHexString(num));
//		-> 11 (hexadecimal)
		
//		l. Experiment with converting a long value into other
//		primitive types or vice versa and observe the results.
		
		long number = 89;
		
		//Widening
		float f1 = number;
//		double d1 = number;

		System.out.println(number);
		
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
