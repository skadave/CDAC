package in.cdac.ques1;

public class Project {

	public static void main(String[] args) {

		InstanceCounter i1 = new InstanceCounter();
		InstanceCounter i2 = new InstanceCounter();
		InstanceCounter i3 = new InstanceCounter();
		InstanceCounter i4 = new InstanceCounter();
		
		
		
		System.out.println("Total instances of Class InstanceCounter: "+InstanceCounter.getCount());
	}

}
