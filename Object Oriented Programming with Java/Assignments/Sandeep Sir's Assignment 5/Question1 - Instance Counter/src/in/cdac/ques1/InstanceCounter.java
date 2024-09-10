package in.cdac.ques1;

public class InstanceCounter {
	private static int count=0;  //declare count as a static field so that count will be shared for all instances
	
	
	public InstanceCounter(){
		InstanceCounter.count++; //increment count after an instance is created and constructor is called
	}


	public static int getCount() {
		return InstanceCounter.count;
	}



	
	
	
	
}
