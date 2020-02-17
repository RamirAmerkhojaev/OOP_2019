package Task2;

public class CheckingAccount extends Account {
	
	private int counter = 0;
	private final int FREE_TRANSACTIONS = 2;
	protected double charge;
	
	public CheckingAccount() {
		
		super();
	}
	public CheckingAccount(int accNumber,String holderName,double balance, double charge) {
		super(accNumber, holderName, balance);
		
		this.charge = charge;
	}
	public void transfer(double amount, Account other) {
		counter++;
		super.transfer(amount, other);
		deductFee();
	}
	public void deposit(double sum) {
		counter++;
		super.deposit(sum);
		deductFee();
	}
	public void withdraw(double sum) {
		counter++;
		super.withdraw(sum);
		deductFee();
	}
	public void deductFee() {
		if(counter > FREE_TRANSACTIONS) {
			balance -= charge;
		}
	}
    public String toString() {
        return super.toString()+" ,number of transactions: "+counter;	
    }
	
}
