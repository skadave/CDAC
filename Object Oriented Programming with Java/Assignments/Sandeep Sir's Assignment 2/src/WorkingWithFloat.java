
public class WorkingWithFloat {

	public static void main(String[] args) {


//		a. Explore the Java API documentation for java.lang.Float and observe its modifiers and super types.
//		public class Object
//		
//		public abstract class Number
//		extends Object
//		
//		public final class Float
//		extends Number
		
//		b. Write a program to test how many bytes are used to represent a 
//		float value using the BYTES field. (Hint: Use Float.BYTES).
//		System.out.println(Float.BYTES);
//		-> 4
		
//		c. Write a program to find the minimum and maximum values of float using the MIN_VALUE 
//		and MAX_VALUE fields. (Hint: Use Float.MIN_VALUE and Float.MAX_VALUE).
//		System.out.println(Float.MIN_VALUE);
//		-> 1.4E-45
		
//		System.out.println(Float.MAX_VALUE);
//		-> 3.4028235E38
		
//		d. Declare a method-local variable number of type float with some 
//		value and convert it to a String using the toString method. (Hint: Use Float.toString(float)).
//		float number = 46.34f;
//		System.out.println(Float.toString(number));
//		-> 46.34 (in String format)
		
//		e. Declare a method-local variable strNumber of type String with some value and 
//		convert it to a float value using the parseFloat method. (Hint: Use Float.parseFloat(String)).
//		String strNumber = "97.44f";
//		System.out.println(Float.parseFloat(strNumber));
//		-> 97.44 (in float format)
		
//		f. Declare a method-local variable strNumber of type String with the value "Ab12Cd3" and 
//		attempt to convert it to a float value. (Hint: parseFloat method will throw a NumberFormatException).
//		String strNumber = "Ab12Cd3";
//		System.out.println(Float.parseFloat(strNumber));
//		-> Exception in thread "main" java.lang.NumberFormatException: For input string: "Ab12Cd3"

//		g. Declare a method-local variable number of type float with some value and
//		convert it to the corresponding wrapper class using Float.valueOf(). (Hint: Use Float.valueOf(float)).
//		float number = 661.642f;
//		System.out.println(Float.valueOf(number));
//		-> 661.642 (in Float format)
		
//		h. Declare a method-local variable strNumber of type String with some float value and 
//		convert it to the corresponding wrapper class using Float.valueOf(). (Hint: Use Float.valueOf(String)).
//		String strNumber = "77.35f";
//		System.out.println(Float.valueOf(strNumber));
//		-> 77.35 (in Float format)
		
//		i. Declare two float variables with values 112.3 and 984.5, and 
//		add them using a method from the Float class. (Hint: Use Float.sum(float, float)).
//		float n1 = 112.3f, n2 = 984.5f;
//		float add = Float.sum(n1, n2);
//		System.out.println(add);
//		-> 1096.8
		
//		j. Declare two float variables with values 112.2 and 556.6, and find the minimum and 
//		maximum values using the Float class. (Hint: Use Float.min(float, float) and Float.max(float, float)).
//		float n1 = 112.2f, n2 = 556.6f;
//		float minimum = Float.min(n1, n2);
//		System.out.println(minimum);
//		-> 112.2
		
//		float n1 = 112.2f, n2 = 556.6f;
//		float maximum = Float.max(n1, n2);
//		System.out.println(maximum);
//		-> 556.6
		
//		k. Declare a float variable with the value -25.0f.
//		Find the square root of this value. (Hint: Use Math.sqrt() method).
//		float num = -25.0f;
//		System.out.println(Math.sqrt(num));
//		-> NaN 
//		According to documentation, if the argument is less than zero, then the result is NaN.
		
//		float num = 25.0f;
//		System.out.println(Math.sqrt(num));
//		-> 5.0  (works with positive values)
		
		
//		l. Declare two float variables with the same value, 0.0f, and divide them. 
//		(Hint: Observe the result and any special floating-point behavior).
		
//		float num1 = 0.0f, num2 = 0.0f; 
//		float result = num1/num2;
//		System.out.println(result);
//		-> NaN
//		Division by 0 in floating value does not result to Arithmetic Exception of / by zero
//		It only gives output as NaN.
		
//		int num1 = 0, num2 = 0;
//		int result = num1/num2;
//		System.out.println(result);
//		Exception in thread "main" java.lang.ArithmeticException: / by zero
		
//		m. Experiment with converting a float value into other primitive types or vice versa 
//		and observe the results.
		
//		float number = 48.56f;
	
		//Widening
//		double d1 = number;
//		long l1 = number;  //This is NOT widening as decimal values have higher possibilities/ range of values (Don't look at their size)
//		long l1 = (long)number; //This is OK. (Narrowing)
//		System.out.println(l1); //48
		
		//Narrowing
//		double d1 = 54.32;
//		float number = (float)d1;  //54.32
		
//		System.out.println(number);
		
		
		
		// Conversion between char and other primitive types is not called Widening or Narrowing. Rather, it is Type Conversion.
//		float number = 67.32f;
//		char ch = (char)number; //OK. 67.32f will be stored as 67 internally
//		
//		System.out.println(ch); //C
		
//		char ch = 'A';
//		float number = ch;  // 65(integral const.) to 65.0(float)
//		System.out.println(number); //65.0
		


	}

}
