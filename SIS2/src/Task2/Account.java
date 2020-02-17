package Task2;


public class Account {

	protected double balance;
	protected int accNumber;
	protected String holderName;
	
	public Account() {
		balance = 0.0;
		holderName = "";
	}
	public Account(int accNumber) {
		this.accNumber = accNumber;
	}
	public Account(int accNumber, String holderName) {
		this(accNumber);
		this.holderName = holderName;
	}
	public Account(int accNumber, String holderName, double balance) {
		this(accNumber,holderName);
		this.balance = balance;
	}
	public String getHolderName() {
		return holderName;
	}
	public double getBalance() {
		return balance;
	}
	public int getAccNumber() {
		return accNumber;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void setAccountNumber(int accNumber) {
		this.accNumber = accNumber;
	}
	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}
	public void deposit(double sum) {
		if(sum>0) {
		balance += sum;
		}else {
			System.out.println("You can't add negative sum");
		}
	}
	public void withdraw(double sum) {
		if(balance-sum > 0) {
			balance -= sum;
		}else {
			System.out.println("Not enough money for withdraw");
		}
	}
	public void transfer(double amount, Account other) {
		if(balance-amount>0) {
			other.deposit(amount);
		}else {
			System.out.println("Not enough money for transfer");
		}
	}
	public String toString() {
		return "Account number: "+accNumber+" ,holder name: "+holderName+" ,current balance: "+balance+"\n";
	}
	public final void print() {
		System.out.println(toString());
	}
	
	
	
}
