/*
Question 3: Calculator  
Write a program that acts as a simple calculator. It should accept two numbers and an operator 
(+, -, *, /) as input. Use a switch statement to perform the appropriate operation. Use nested if
else to check if division by zero is attempted and display an error message.
*/

class Calculator{
		public static void main(String args[]){
			int num1 = 20, num2 = 0, result;
			char op = '/';
			switch(op){
			case '+':
				result = num1 + num2;
				System.out.println(num1 + " + " + num2 + " = " + result);
				break;
			case '-':
				result = num1 - num2;
				System.out.println(num1 + " - " + num2 + " = " + result);
				break;
			case '*':
				result = num1 * num2;
				System.out.println(num1 + " * " + num2 + " = " + result);
				break;
			case '/':
				if(num2 == 0){
					System.out.println("Please do not divide by 0.");
				}
				else
				{
				result = num1 / num2;
				System.out.println(num1 + " / " + num2 + " = " + result);
				}
				break;
			}
		}
}
			