package in.cdac.ques1;


public class LoanAmortizationCalculator {
	private double principal;
	private double annualInterestRate;
	private int loanTerm;
	private int numberOfMonths;
	private double monthlyInterestRate;
	private double monthlyPayment;
	private double totalAmountPaid;

	
	LoanAmortizationCalculator(){
	
	}
	
	

	
	public double getPrincipal(){
		return this.principal;
	}
	
	
	public void setPrincipal(double principal){
		this.principal = principal;
	}
	
	
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}


	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}


	public int getLoanTerm() {
		return loanTerm;
	}


	public void setLoanTerm(int loanTerm) {
		this.loanTerm = loanTerm;
	}


	public int getNumberOfMonths() {
		return numberOfMonths;
	}
	


	public void setNumberOfMonths(int numberOfMonths) {
		this.numberOfMonths = numberOfMonths;
	}


	public double getMonthlyInterestRate() {
		return monthlyInterestRate;
	}


	public void setMonthlyInterestRate(double monthlyInterestRate) {
		this.monthlyInterestRate = monthlyInterestRate;
	}


	public void setMonthlyPayment(double monthlyPayment) {
		this.monthlyPayment = monthlyPayment;
	}



	public double getMonthlyPayment() {
		return monthlyPayment;
	}

	public void setTotalAmountPaid(double totalAmountPaid){
		this.totalAmountPaid = totalAmountPaid;
	}

	public double getTotalAmountPaid() {
		return totalAmountPaid;
	}





	




	


	
	
	
	
	
}
