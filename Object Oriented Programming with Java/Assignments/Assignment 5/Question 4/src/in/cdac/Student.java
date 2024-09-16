package in.cdac;


class Date{
	private int day;
	private int month;
	private int year;
	
	public Date() {
		
	}
	
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	
	
}



public class Student {
	private String name;
	private int rollNo;
	private Date birthDate;
	
	public Student() {
		
	}
	
	public Student(String name, int rollNo, int day, int month, int year) {
		this.name = name;
		this.rollNo = rollNo;
		this.birthDate = new Date(day, month, year);
		
	}
	
	
	public String toString() {
		return this.name + " " + this.rollNo + " " + this.birthDate.getDay() + " " + this.birthDate.getMonth() + " " + this.birthDate.getYear() + " ";
	}
}
