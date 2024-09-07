
public class WorkingWithDouble {

	public static void main(String[] args) {


//		a. Explore the Java API documentation for java.lang.Double and observe its modifiers and super types.
//		public class Object
//		
//		public abstract class Number
//		extends Object
//		
//		public final class Double
//		extends Number
		
//		b. Write a program to test how many bytes are used to represent a double value 
//		using the BYTES field. (Hint: Use Double.BYTES).
//		System.out.println(Double.BYTES);
//		-> 8
		
//		c. Write a program to find the minimum and maximum values of double using the MIN_VALUE and MAX_VALUE fields.
//		(Hint: Use Double.MIN_VALUE and Double.MAX_VALUE).
//		System.out.println(Double.MIN_VALUE);
//		-> 4.9E-324
		
//		System.out.println(Double.MAX_VALUE);
//		-> 1.7976931348623157E308
		
//		d. Declare a method-local variable number of type double with some value and convert it to a 
//		String using the toString method. (Hint: Use Double.toString(double)).
//		double number = 57.5;
//		System.out.println(Double.toString(number));
//		-> 57.5 (in String format)
		
//		e. Declare a method-local variable strNumber of type String with some value and convert it 
//		to a double value using the parseDouble method. (Hint: Use Double.parseDouble(String)).
//		String strNumber = "68.7";
//		System.out.println(Double.parseDouble(strNumber));
//		-> 68.7 (in double format)
		
//		f. Declare a method-local variable strNumber of type String with the value "Ab12Cd3" 
//		and attempt to convert it to a double value.(Hint: parseDouble method will 
//		throw a NumberFormatException).
//		String strNumber = "Ab12Cd3";
//		System.out.println(Double.parseDouble(strNumber));
//		-> Exception in thread "main" java.lang.NumberFormatException: For input string: "Ab12Cd3"

//		g. Declare a method-local variable number of type double with some value and convert 
//		it to the corresponding wrapper class using Double.valueOf(). (Hint: Use Double.valueOf(double)).
//		double number = 51.4;
//		System.out.println(Double.valueOf(number));
//		-> 51.4 (in Double format)
		
//		h. Declare a method-local variable strNumber of type String with some double value and 
//		convert it to the corresponding wrapper class using Double.valueOf(). 
//      Hint: Use Double.valueOf(String)).
//		String strNumber = "58.7";
//		System.out.println(Double.valueOf(strNumber));
//		-> 58.7 (in Double format)
		
//		i. Declare two double variables with values 112.3 and 984.5, and add them using
//		a method from the Double class. (Hint: Use Double.sum(double, double)).
//		double n1 = 112.3, n2 = 984.5;
//		double add = Double.sum(n1, n2);
//		System.out.println(add);
//		-> 1096.8
		
//		j. Declare two double variables with values 112.2 and 556.6, and find the minimum and 
//		maximum values using the Double class. (Hint: Use Double.min(double, double) and 
//		Double.max(double, double)).
//		double n1 = 112.2, n2 = 556.6;
//		double minimum = Double.min(n1, n2);
//		System.out.println(minimum);
//		-> 112.2
		
//		double n1 = 112.2, n2 = 556.6;
//		double maximum = Double.max(n1, n2);
//		System.out.println(maximum);
//		-> 556.6
		
//		k. Declare a double variable with the value -25.0. 
//		Find the square root of this value. (Hint: Use Math.sqrt() method).
//		double num = -25.0;
//		System.out.println(Math.sqrt(num));
//		-> NaN 
//		According to documentation, if the argument is less than zero, then the result is NaN.
		
//		double num = 25.0;
//		System.out.println(Math.sqrt(num));
//		-> 5.0  (works with positive values)
		
		
//		l. Declare two double variables with the same value, 0.0, and divide them.
//		(Hint: Observe the result and any special floating-point behavior).
		
//		double num1 = 0.0, num2 = 0.0; 
//		double result = num1/num2;
//		System.out.println(result);
//		-> NaN
//		Division by 0 of floating type (float or double) does not result to Arithmetic Exception of / by zero
//		It only gives output as NaN.
		
//		Below, the exception occurs when you try to divide by integer 0.
//		int num1 = 0, num2 = 0;
//		int result = num1/num2;
//		System.out.println(result);
//		Exception in thread "main" java.lang.ArithmeticException: / by zero
		
//		m. Experiment with converting a double value into other primitive types
//		or vice versa and observe the results.

//		double number = 59.63;
		//Widening (No option. It is the biggest in decimal type (don't consider long)
		//Narrowing (no data type of bigger value to store in double)
		

		
		
		// Conversion between char and other primitive types is not called Widening or Narrowing. Rather, it is Type Conversion.
//		double number = 68.63;
//		char ch = (char)number; //OK. 68.63 will be stored as 68 internally
//	
//		System.out.println(ch); //D
		
//		char ch = 'A';
//		float number = ch;  // 65(integral const.) to 65.0(float)
//		System.out.println(number); //65.0
		
		
	}

}
