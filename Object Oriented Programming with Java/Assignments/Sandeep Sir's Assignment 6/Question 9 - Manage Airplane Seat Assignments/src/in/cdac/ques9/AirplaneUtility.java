package in.cdac.ques9;

import java.util.Scanner;

public class AirplaneUtility {
	private static Scanner sc = new Scanner(System.in);
	private int r;
	private int c;
	private Airplane a1 = null;
	
	
	public void acceptSize() {
		System.out.println("Enter no. of rows of seats:");
		r = sc.nextInt();
		System.out.println("Enter no. of columns of seats:");
		c = sc.nextInt();
		a1 = new Airplane(r,c);
	}
	
	public void initializeArray() {                         //Set all seats to Available
		for(int i=0;i<a1.getSeatsArray().length;i++)
			for(int j=0;j<a1.getSeatsArray()[i].length;j++) {
				a1.getSeatsArray()[i][j] = "Available";
			}
	}
	
	public void bookASeat(int row, int col) {
		if(a1.getSeatsArray()[row][col]=="Available") {
			a1.getSeatsArray()[row][col]="Occupied";
		}
		else
			System.out.println("This seat is already occupied.");
	}
	public void cancelASeat(int row, int col) {
		a1.getSeatsArray()[row][col]="Available";
	}
	
	public void printArray() {
		String[][] arr = a1.getSeatsArray();
		System.out.println("Status of availability of seats: ");
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print("Row["+i+"]Column["+j+"]  "+arr[i][j]+"  ");
			}
		System.out.println();
	}
	}
		
	
	public static int menuList(){
		System.out.println("0. Exit");
		System.out.println("1. Initialize seating arrangement");
		System.out.println("2. Show available seats");
		System.out.println("3. Book a seat");
		System.out.println("4. Cancel a seat");
		return sc.nextInt();
	}
	
	
}

