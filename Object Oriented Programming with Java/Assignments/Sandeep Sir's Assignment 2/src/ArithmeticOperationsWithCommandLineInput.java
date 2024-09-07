//Arithmetic Operations with Command Line Input
//Write a program that accepts two integers and an arithmetic operator (+, -, *, /)
//from the command line. Perform the specified arithmetic operation based on the operator provided. 
//(Hint: Use switch-case for operations).


public class ArithmeticOperationsWithCommandLineInput {

	public static void main(String[] args) {  //18 6 '*'  <- Cmd line input (3 strings)
		
		// convert commandline strings to integers
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		char operator = args[2].charAt(1);  //had to convert string to char as * is a wildcard in cmdline 
//		and charAt(1) because * is 2nd char (index 1) in '*'
		
		switch(operator){
		case '+':
			System.out.println(num1 + num2);
			break;
		case '-':
			System.out.println(num1 - num2);
			break;
		case '*':
			System.out.println(num1 * num2);
			break;
		case '/':
			System.out.println(num1 / num2);
			break;
		default:
			System.out.println("Invalid operator");
			break;
			
		};
		
		

	}

}

