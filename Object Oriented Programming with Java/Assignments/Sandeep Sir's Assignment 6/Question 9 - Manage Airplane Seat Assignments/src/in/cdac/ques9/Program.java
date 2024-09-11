package in.cdac.ques9;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AirplaneUtility u1 = new AirplaneUtility();

		
		int choice = 0;
		int row, col;
		while ((choice = AirplaneUtility.menuList()) != 0) {
			switch(choice) {
			case 1: 
				u1.acceptSize();
				u1.initializeArray();
				break;
			case 2:
				u1.printArray();
				break;
			case 3:
				System.out.print("Enter seat row no. and column no. - \nRow: ");
				row = sc.nextInt();
				System.out.print("Column: ");
				col = sc.nextInt();
				u1.bookASeat(row, col);
				break;
			case 4:
				System.out.print("Enter seat row no. and column no. to cancel the seat - \nRow: ");
				row = sc.nextInt();
				System.out.print("Column: ");
				col = sc.nextInt();
				u1.cancelASeat(row, col);
				break;
			}
		}
		
		sc.close();
	}

}
