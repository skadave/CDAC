package in.cdac.ques5;



public class Program {

	public static void main(String[] args) {
		TollBoothRevenueManagerUtil util = new TollBoothRevenueManagerUtil();

		
		int choice;
		
		while ( (choice = TollBoothRevenueManagerUtil.menuList()) != 0) {
			
			switch(choice) {
			case 1: 
					util.acceptRecord();
					util.calculateRevenue();
					break;
			case 2: util.printRecord();
					break;
			}
			
		
		}

	}

}
