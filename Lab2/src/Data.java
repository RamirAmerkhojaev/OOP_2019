import java.util.*;

 class Data {
      	 
	 private double cnt, max;
	 private int amount;
	 
	 Data(){
		 cnt = 0;
		 amount = 0;
		 max = 0;
	 }
	 
	 public void add(double value) {
		 amount++;
		 cnt += value;
		 if(value > max) max = value;
	 }
	 
	 public double avg() {
		 
		 double avg = cnt/amount;
		 
		 if(amount != 0) {
			 return avg;
		 }else {
			 return 0;
		 }
	 }
	 public double max() {
		 return max;
	 }
	 
 }
 
 class Analyzer{
	 
	 public static void main(String args[]) {
		 
	    Data data = new Data();
	    String s = "";
	    Scanner input = new Scanner(System.in);
	    
	    while(true) {
			System.out.print("Enter number(Q to quit): ");
			s = input.next();
			if (s.equals("Q")) {
			break;
			}else {
			data.add(Double.parseDouble(s));			
		  }
	    }
		System.out.println("Average: " + data.avg());
		System.out.println("Max: " + data.max());
		
		
	 }
 }
 
 
 