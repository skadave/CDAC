



public class WorkingWithBoolean {

	public static void main(String[] args) {
		
		/* a. Explore the Java API documentation for java.lang.Boolean and observe its modifiers and super types.
		 
		public final class Boolean 
		extends Object
		
		Boolean -> Wrapper Class for primitive type boolean
		Modifiers -> public and final
		public -> means available everywhere
		final -> means we cannot create a sub-class of this class (no inheritance)

		public class Object 
		Object -> is the super class of Boolean, Number, Character
		
		 */
		
		/* b. Declare a method-local variable status of type boolean with the value true and 
		 convert it to a String using the toString method. (Hint: Use Boolean.toString(Boolean) ).
		 
		boolean status = true;
		String str = Boolean.toString(status);
		boolean to String
		*/
		
		/* c. Declare a method-local variable strStatus of type String with the value "true" and 
		 convert it to a boolean using the parseBoolean method. (Hint: Use Boolean.parseBoolean(String)).
		 
		String strStatus = "true";
		boolean status1 = Boolean.parseBoolean(strStatus);
		String to boolean
		*/
		
		/* d. Declare a method-local variable strStatus of type String with the value "1" or "0" 
		  and attempt to convert it to a boolean. (Hint: parseBoolean method will not work as expected with "1" or "0").
		 
		String strStatus = "1";
		boolean status = Boolean.parseBoolean(strStatus);
		It is converting both the strings "1" or "0" into false.
		*/
		
		/* e. Declare a method-local variable status of type boolean with the value true and convert
		  it to the corresponding wrapper class using Boolean.valueOf(). (Hint: Use Boolean.valueOf(boolean)).
		   
		boolean status = true;
		Boolean status1 = Boolean.valueOf(status);
		Converted boolean(value type) to Boolean(reference type)
		*/
		
		/* f. Declare a method-local variable strStatus of type String with the value "true" and 
		 convert it to the corresponding wrapper class using Boolean.valueOf(). (Hint: Use Boolean.valueOf(String)).
		 
		String strStatus = "true";
		Boolean status = Boolean.valueOf(strStatus);
		//Converted String(reference type) to Boolean(reference type)
		*/
		
		/* g. Experiment with converting a boolean value into other primitive types or vice versa and observe the results.
		boolean status=true;
		
		byte x = status; //Not ok
		byte x = (byte)status; //Not ok 
		
		
		int x = status; //Not ok
		int x = (int)status; //Not ok 
		
		
		short x = status; //Not ok
		short x = (short)status; //Not ok 
		
		float x = status; //Not ok
		double x = status; //Not ok 
		long x = status; //Not ok
		
		float x = (float)status; //Not ok
		double x = (double)status; //Not ok 
		long x = (long)status; //Not ok
		
	 
		int x = 1;  
		boolean status=x;  //Not ok
		
Conclusion: Cannot convert boolean into any other primitive type and vice verse
is also not allowed. 

We can only convert boolean to its wrapper class Boolean and to String
or vice versa. 
*/

		


	}

}
