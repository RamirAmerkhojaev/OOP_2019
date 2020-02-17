import java.util.*;

public class Task3 {
	
	//double interest = (b * (p/100) * t)/ 365;
	
	 public static void main(String args[]) {
	      
	      double initialBalance;
	      Scanner input = new Scanner(System.in);
	      System.out.println("Enter initial balance");
	      initialBalance = input.nextDouble();
	      
	      double interest;
	      System.out.println("Enter size of interest");
	      interest = input.nextDouble();
	      
	      double time;
	      System.out.println("Enter a time (per days)");
	      time = input.nextDouble();
	      
	      double newBalance;
	      
	      newBalance = ((initialBalance * (interest/100) * time) / 365 ) + initialBalance; 
	      double received = (initialBalance * (interest/100) * time) / 365;
	      
	      System.out.printf("Initial balance: %.1f\n", initialBalance);
	       System.out.printf("Interest rate (per year): %.1f percent\n", interest);
	       System.out.printf("Received after n days: %.1f\n", received);
	      System.out.printf("New balance : %.1f", newBalance);
	      
	    }
}
