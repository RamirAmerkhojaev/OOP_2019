import java.util.*;

public class Task4 {

	public static void main(String args[]) {
        
	      Scanner input = new Scanner(System.in);
	     
	      int a, b, c;
	      System.out.println("Enter values of constants");
	      a = input.nextInt();
	      b = input.nextInt();
	      c = input.nextInt();
	      
	      double D;
	      
	      D = ( b*b - 4*a*c);
	      
	      double x1, x2, x3;
	      
	      x1 = (-b - Math.sqrt(D)) / (2*a);
	      x2 = (-b + Math.sqrt(D)) / (2*a);
	      x3 = (-b) / (2*a);
	      
	      if(D < 0){
	           System.out.println("Can not find the roots!");
	      }else if(D == 0) {
	    	  System.out.printf("root is equal: %.2f%n", x3);
	      }
	      else {
	          System.out.printf("first root is %.2f%n", x1);
	          System.out.printf("second root is %.2f%n", x2);
	      }
	   }
	
}
