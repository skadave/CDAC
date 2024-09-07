
public class WorkingWithByte {

	public static void main(String[] args) {

//a. Explore the Java API documentation for java.lang.Byte and observe its modifiers and super types.		
//	
//		public class Object
//		
//		public abstract class Number
//		extends Object
//		
//		public final class Byte
//		extends Number
		
		
//b.
//		System.out.println(Byte.BYTES); //to find size of byte
//		Output: 1

//c.
//		System.out.println(Byte.MIN_VALUE);  //max range of byte
//		Output: -128


//		System.out.println(Byte.MAX_VALUE); //min range of byte
//		Output: 127
		
//d.		
//		byte number = 45;
//		System.out.println(Byte.toString(number)); //convert byte to String
//		Output: 45
	
//e.
//		String strNumber = "37";
//		System.out.println(Byte.parseByte(strNumber)); //convert String to byte
//		Output: 37

//f.
//		String strNumber = "Ab12Cd3";
//		System.out.println(Byte.parseByte(strNumber)); //NumberFormatException
//		
//		Output: Exception in thread "main" java.lang.NumberFormatException:
//		For input string: "Ab12Cd3"
	
//g.
//		byte number = 64;
//		System.out.println(Byte.valueOf(number));//convert byte to Byte wrapper class
//		Output: 64

//h.
//		String strNumber = "124";
//		System.out.println(Byte.valueOf(strNumber));//convert String to Byte
//		Output: 124
		
//i.
//		WIDENING
//		byte number = 54;
		
//		short num = number;
//		int num = number;
//		float num = number;
//		double num = number;
//		long num = number;
		
//		NARROWING CAN BE DONE ONLY BY TYPE CASTING
//		int num = 43;
		
//		byte number = (byte)num;
//		System.out.println(number);
//		Output: 43
		

//		byte number = 54;
		
//		char num = number; //NOT OK
//		char num = (char)number; 
//		Output:6   (54 got converted to 6 during byte to char conversion)
//		byte can be converted to char using type casting only but value will change
		
		
//		char ch = 'a';
		
//		byte number = ch; //NOT OK
//		byte number = (byte)ch;//OK
//		Output: 97
//		char can be converted to byte by type casting only

		
	
//		System.out.println(number);
	
	}

}
