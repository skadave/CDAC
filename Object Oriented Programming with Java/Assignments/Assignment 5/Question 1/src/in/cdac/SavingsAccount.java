package in.cdac;

public class SavingsAccount extends BankAccount{

	public SavingsAccount(String name, double balance) {
		super(name,balance);
	}
	
	
	@Override
	public void withdraw(double withdrawAmmount) {   //Put restriction of 10,000 RS
		
	if((withdrawAmmount <= this.getBalance()) && (this.getBalance() > 0) && (withdrawAmmount>0) && (withdrawAmmount <= 10000))
	{
		System.out.println(withdrawAmmount+" RS has been withdrawn");
		this.setBalance(this.getBalance() - withdrawAmmount);
	}
	else
		System.out.println("Invalid withdrawal ammount");
	
	}
}
