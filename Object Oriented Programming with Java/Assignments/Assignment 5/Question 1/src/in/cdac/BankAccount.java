package in.cdac;

public class BankAccount {
	private String accHoldersName;
	private double balance;
	
	public BankAccount(){
		this.accHoldersName = "";
	}
	
	public BankAccount(String accHoldersName, double balance){
		this.accHoldersName = accHoldersName;
		this.balance = balance;
	}
	
	
	public void setAccHoldersName(String accHoldersName) {
		this.accHoldersName = accHoldersName;
	}
	
	public String getAccHoldersName() {
		return this.accHoldersName;
	}

	public double getBalance() {
		return this.balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	
	public void deposit(double depositAmmount) {
		this.balance = this.balance + depositAmmount;
		System.out.println(depositAmmount+" RS has been deposited");
	}
	
	public void withdraw(double withdrawAmmount) {
	if((withdrawAmmount <= this.balance) && (this.balance > 0) && (withdrawAmmount>0)) {
		System.out.println(withdrawAmmount+" RS has been withdrawn");
		this.balance = this.balance - withdrawAmmount;
	}
	else {
		System.out.println("Invalid withdrawal ammount");
		}
	}
	
	
}
