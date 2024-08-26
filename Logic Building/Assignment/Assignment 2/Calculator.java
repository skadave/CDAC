/*
Question 3: Calculator  
Write a program that acts as a simple calculator. It should accept two numbers and an operator 
(+, -, *, /) as input. Use a switch statement to perform the appropriate operation. Use nested if
else to check if division by zero is attempted and display an error message.
*/
import java.util.Scanner;
class Calculator{
		public static void main(String args[]){
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the 1st number: ");
			int num1 = sc.nextInt();
			System.out.print("Enter the 2nd number: ");
			int num2 = sc.nextInt();
			int result;
			
			System.out.println("Enter the operation to perform: + - * /");
			char op = sc.next().charAt(0);
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
				double result1 = (double)num1 / (double)num2;
				System.out.println(num1 + " / " + num2 + " = " + result1);
				}
				break;
			default:
				System.out.println("Invalid input.");
				break;
			}
		}
}

/*Output:
C:\Users\Saurabh\Desktop\CDAC\Assignment 2>java Calculator
Enter the 1st number: 7
Enter the 2nd number: 9
Enter the operation to perform: + - * /
*
7 * 9 = 63

C:\Users\Saurabh\Desktop\CDAC\Assignment 2>java Calculator
Enter the 1st number: 5
Enter the 2nd number: 0
Enter the operation to perform: + - * /
/
Please do not divide by 0.

C:\Users\Saurabh\Desktop\CDAC\Assignment 2>java Calculator
Enter the 1st number: 7
Enter the 2nd number: 3
Enter the operation to perform: + - * /
/
7 / 3 = 2.3333333333333335

C:\Users\Saurabh\Desktop\CDAC\Assignment 2>
*/
			