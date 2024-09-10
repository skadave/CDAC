package in.cdac.ques2;

import java.util.Scanner;

public class Project {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		
		
		Logger lg = Logger.getInstance();


		System.out.println("\n1. Enter log\n2. Print log\n3. Delete log\n0.Exit");
		while((choice = sc.nextInt())!=0) {
			
			switch(choice){
			case 1:		
				sc.nextLine();
				System.out.println("\nEnter the log message you want to store: ");
				String s1 = sc.nextLine();
				lg.log(s1);
			break;
			
			case 2:	
				if(lg.getLog()=="")
					System.out.println("No log entry is present.");
				else
					System.out.println("Current log: "+lg.getLog());
			break;
			
			case 3:
				lg.clearLog();
				System.out.println("Log entry has been deleted.");
			break;
			
		}
			System.out.println("\n1.Enter log\n2.Print log\n3.Delete log\n0.Exit");		
			
	}
		
		sc.close();
		
		
	}	


}
