import java.util.Scanner;

class LeapYearUsingSwitch{
	public static void main(String... args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year: ");
		int year = sc.nextInt();
		int x = (year%4==0 && year%100!=0 || year%400==0)?1:0;
		switch(x){
			case 1:
				System.out.println("It is a leap year");
				break;
			case 0:
				System.out.println("It is not a leap year");
				break;
			}
	}
}