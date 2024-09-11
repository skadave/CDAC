package in.cdac.ques9;

public class Airplane {
	private String[][] seatsArray;
	
	
	public Airplane(int rows, int cols){
		this.seatsArray = new String[rows][cols];
		
	}
	
	public String[][] getSeatsArray() {
		return this.seatsArray;
	}
	

}
