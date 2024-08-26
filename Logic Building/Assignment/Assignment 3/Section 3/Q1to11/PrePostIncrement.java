// 11. Write a Java program to demonstrate the use of both pre-increment and post-decrement operators in a single expression 

class PrePostIncrement{
	public static void main(String args[]){
		int a = 10, b = 11;
		int result = ++a * b--;  //11 * 11 => 121
		//On the next line, b=10
		System.out.println(result);
	}
}

/*Output:
C:\Users\Saurabh\Desktop\CDAC\Assignment 3\Section 3\Q1to11>java PrePostIncrement
121
*/