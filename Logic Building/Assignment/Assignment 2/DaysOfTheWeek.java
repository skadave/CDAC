/*
Question 2: Days of the Week  
Write a program that uses a nested switch statement to print out the day of the week based on an 
integer input (1 for Monday, 2 for Tuesday, etc.). Additionally, within each day, print whether it 
is a weekday or weekend. 
*/
import java.util.Scanner;
class DaysOfTheWeek{
			public static void main(String args[]){
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter day in integer: ");
			int day = sc.nextInt();
			switch(day){
				case 1: case 2: case 3: case 4: case 5:
				switch(day){
					case 1: 
						System.out.println("Monday.");
						break;
					case 2: 
						System.out.println("Tuesday.");
						break;
					case 3: 
						System.out.println("Wednesday.");
						break;
					case 4: 
						System.out.println("Thursday.");
						break;
					case 5: 
						System.out.println("Friday.");
						break;
					case 6: 
						System.out.println("Saturday.");
						System.out.println("It is a weekend.");
						break;
					case 7: 
						System.out.println("Sunday.");
						System.out.println("It is a weekend.");
						break;
				}
				System.out.println("It is a weekday.");
				break;
				
				case 6: case 7:
				switch(day){
					case 6: 
						System.out.println("Saturday.");
						break;
					case 7: 
						System.out.println("Sunday.");
						break;
				}
				System.out.println("It is a weekend.");
				break;
				
				default:
				System.out.println("Invalid input.");
				break;
            }
		}
}

/*Output:

C:\Users\Saurabh\Desktop\CDAC\Assignment 2>java DaysOfTheWeek
Enter day in integer: 5
Friday.
It is a weekday.

C:\Users\Saurabh\Desktop\CDAC\Assignment 2>java DaysOfTheWeek
Enter day in integer: 7
Sunday.
It is a weekend.

C:\Users\Saurabh\Desktop\CDAC\Assignment 2>java DaysOfTheWeek
Enter day in integer: 8
Invalid input.

C:\Users\Saurabh\Desktop\CDAC\Assignment 2>

*/