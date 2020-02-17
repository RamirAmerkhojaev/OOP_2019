package Task2;
import java.io.*;
import java.util.*;

enum AccountType{
	
	SIMPLE_ACCOUNT,
	CHECKING_ACCOUNT,
	SAVING_ACCOUNT
	
}

public class Bank {

	private Vector<Account> accounts = new Vector<Account>();
	private double sum;
	
	public Bank() {
		
	}
	public Bank(double sum) {
		this.sum = sum;
	}
	public double getSum() {
		return sum;
	}
	public void setSum(double sum) {
		this.sum = sum;
	}
	
	public void update(double sum){
		for(Account a: accounts) {
			a.deposit(sum);
			if(a instanceof SavingsAccount) {
			   ((SavingsAccount) a).addInterest();
			}else if(a instanceof CheckingAccount) {
				((CheckingAccount) a).deductFee();
			}
		}
	}
	
	/*public void openAccount(AccountType choose, int accNumber, String holderName, double balance, double charge, double interest) {
		if(choose == AccountType.SIMPLE_ACCOUNT) {
			accounts.add(new Account(accNumber, holderName, balance));
		}else if(choose == AccountType.CHECKING_ACCOUNT) {
			accounts.add(new CheckingAccount(accNumber, charge));
		}else if(choose == AccountType.SAVING_ACCOUNT) {
			accounts.add(new SavingsAccount(accNumber, interest));
		}
		serialize();
		
	}
	public void closeAccount(AccountType choose, int accNumber, String holderName, double balance, double charge, double interest) {
		if(choose == AccountType.SIMPLE_ACCOUNT) {
			accounts.remove(new Account(accNumber, holderName, balance));
		}else if(choose == AccountType.CHECKING_ACCOUNT) {
			accounts.remove(new CheckingAccount(accNumber, charge));
		}else if(choose == AccountType.SAVING_ACCOUNT) {
			accounts.remove(new SavingsAccount(accNumber, interest));
		}
		serialize();
	}*/
	
	public boolean serialize() {
		
		try
		{
			ObjectOutputStream serializer = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Dell\\Desktop\\unik\\oop\\accounts.txt", true));
			serializer.writeObject(accounts);
			serializer.flush();
			serializer.close();
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
		
		
	}
}
