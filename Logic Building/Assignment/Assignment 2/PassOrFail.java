/*
Question 5: Student Pass/Fail Status with Nested Switch 
Write a program that determines whether a student passes or fails based on their grades in three 
subjects. If the student scores more than 40 in all subjects, they pass. If the student fails in one or 
more subjects, print the number of subjects they failed in. 
*/

// Using Nested Switch-case and if-else
class PassOrFail{
	public static void main(String args[]){
		int sub1 = 45, sub2 = 21, sub3 = 15, failcount = 0;
		String result;
		if (sub1>=40 && sub2>=40 && sub3>=40){
			result = "pass";
		}
		else
		{
			result = "fail";
		}
		
		switch(result){
			case "pass": System.out.println("Student has passed all 3 subjects.");
			break;
			
			case "fail":
			if(sub1<40){
				failcount++;
			}
			if(sub2<40){
				failcount++;
			}
			if(sub3<40){
				failcount++;
			}
			switch(failcount){
					case 1: System.out.println("Student has failed in 1 subject.");
					break;
					case 2: System.out.println("Student has failed in 2 subjects.");
					break;
					case 3: System.out.println("Student has failed in 3 subjects.");
					break;
			}		
			break;
		}
	}
}

/* Using if-else only
class PassOrFail{
		public static void main(String args[]){
		int sub1 = 66, sub2 = 80, sub3 =23, count = 0;
		if (sub1>=40 && sub2>=40 && sub3>=40){
			System.out.println("Pass");
		}
		else{
			if(sub1<40){
				count = count + 1;
			}
			if(sub2<40){
				count = count + 1;
			}
			if(sub3<40){
				count = count + 1;
			}
			if(count == 1){
				System.out.println("Student has failed in " + count + " subject.");
			}
			else{
				System.out.println("Student has failed in " + count + " subjects.");
			}
		}
	}
}
*/



/* Using Switch-case and if-else
class PassOrFail{
	public static void main(String args[]){
		int sub1 = 55, sub2 = 39, sub3 = 65, failcount = 0;
		String result;
		if (sub1>=40 && sub2>=40 && sub3>=40){
			result = "pass";
		}
		else
		{
			result = "fail";
		}
		
		switch(result){
			case "pass": System.out.println("Student has passed all 3 subjects.");
			break;
			
			case "fail":
			if(sub1<40){
				failcount++;
			}
			if(sub2<40){
				failcount++;
			}
			if(sub3<40){
				failcount++;
			}
			switch(failcount):
					case 1: System.out.println("Student has failed in 1 subject.");
					break;
					case 2: System.out.println("Student has failed in 2 subjects.");
					break;
					case 3: System.out.println("Student has failed in 3 subjects.");
					break;
					
			if(failcount == 1){
				System.out.println("Student has failed in " + failcount + " subject.");
			}
			else{
				System.out.println("Student has failed in " + failcount + " subjects.");
			}
			break;
		}
	}
}
*/



