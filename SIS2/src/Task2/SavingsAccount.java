package Task2;

public class SavingsAccount extends Account {

	protected double interest;
	
	public SavingsAccount() {
		super();
	}
	public SavingsAccount(int accNumber) {
		super(accNumber);
	}
	
	public SavingsAccount(int accNumber, double interest) {
		super(accNumber);
		this.interest = interest;
	}
	public void setInterest(double interest) {
		this.interest = interest;
	}
	public void addInterest() {
		super.deposit(super.getBalance()*interest);
	}
	public String toString() {
		return super.toString()+" ,interest: "+interest;
	}
	
}
