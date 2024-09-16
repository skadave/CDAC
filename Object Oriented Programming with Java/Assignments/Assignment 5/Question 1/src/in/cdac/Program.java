package in.cdac;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SavingsAccount c1 = new SavingsAccount("Saurabh", 0);
		
		int choice=0;
		
		do {
			System.out.println("0. Exit");
			System.out.println("1. Withdraw");
			System.out.println("2. Deposit");
			System.out.println("3. Display account details");
			System.out.print("Enter choice: ");

			choice = sc.nextInt();
			System.out.println();
			switch(choice) {
			case 1:
					System.out.print("Enter withdrawal amount: ");
					c1.withdraw(sc.nextDouble());
					break;
			case 2:
					System.out.print("Enter deposit amount: ");
					c1.deposit(sc.nextDouble());
					break;
			case 3:
					System.out.println("Name: "+c1.getAccHoldersName());
					System.out.println("Balance: "+c1.getBalance()+" Rs");
					break;
			case 0:
					break;
			default:
					System.out.println("Invalid Choice");
					break;
			}		

			System.out.println();			
			
			
		}while(choice != 0);
		
		sc.close();

	}

}
