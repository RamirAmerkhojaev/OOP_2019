package Task2;
import java.util.*;

public class Test {
	
	public static void main(String[] args) {
		
		//Scanner input = new Scanner(System.in);
		String select;
		Bank bank = new Bank(100);
		//String openOrClose = input.nextLine();
		Account a1 = new Account(123,"Asd",500.0);
		
		a1.deposit(300.0);
		
		System.out.print(a1.toString());
		
		CheckingAccount check = new CheckingAccount(12345,"asas",500, 0.02);
	
		System.out.println(check.toString());
		
		
	/*	if(openOrClose.equals("Open")) {
			while(true) {
		select = input.nextLine();
		if(select.equals("Simple Account")) {
			bank.openAccount(AccountType.SIMPLE_ACCOUNT,1234, "Ramir", 1000.0, 0.0,0.0);
	    }else if(select.equals("Saving Account")) {
	    	bank.openAccount(AccountType.SAVING_ACCOUNT,1337, "Aron", 500.0, 0.02,0.0);
	    }else if(select.equals("Checking Account")) {
	    	bank.openAccount(AccountType.CHECKING_ACCOUNT,228, "Edyge", 5000.0, 0.0, 500.0);
	    }else if(select.equals("exit")) {
	    	break;
	    }
		}input.close();
	  }
		
		    if(openOrClose.equals("Close")) {
			while(true) {
			select = input.nextLine();
			if(select.equals("Simple Account")) {
				bank.closeAccount(AccountType.SIMPLE_ACCOUNT,1234, "Ramir", 1000.0, 0.0,0.0);
		    }else if(select.equals("Saving Account")) {
		    	bank.closeAccount(AccountType.SAVING_ACCOUNT,1337, "Aron", 500.0, 0.02,0.0);
		    }else if(select.equals("Checking Account")) {
		    	bank.closeAccount(AccountType.CHECKING_ACCOUNT,228, "Edyge", 5000.0, 0.0, 500.0);
		    }else if(select.equals("exit")) {
		    	break;
		    }
			}input.close();
		}
		*/
		
		
	}
}
