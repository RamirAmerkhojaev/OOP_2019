import java.util.*;

public class Task5 {

	public static void main(String args[]) {
	     
	     Scanner input = new Scanner(System.in);
	     
	     int a;
	     System.out.println("Write a length of the side");
	     a = input.nextInt();
	     
	     double diagonal, area, perimeter;
	     
	     diagonal = Math.sqrt(2)*a;
	     System.out.printf("Diagonal = %.2f\n", diagonal);
	     
	     area = a*a;
	     System.out.printf("Area = %.2f\n", area);
	     
	     perimeter = (a+a)*2;
	     System.out.printf("Perimeter = %.2f\n", perimeter);
	    
	    }
	
}
