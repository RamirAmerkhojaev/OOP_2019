package Task4;
import java.util.*;

public class Test {

   public static void main(String[] arr) {
	    
	   int[] c = {2, 4, 1, 9, 5};
	   Chocolate[] chocs = new Chocolate[5];
	   for(int i=0; i<c.length; i++)
		   chocs[i] = new Chocolate(c[i]);
	   
		 Sort.bubbleSort(chocs);
	   
		  for(Chocolate ch: chocs) {
			   System.out.println(ch);
		   }
		   
	   
	   Time[] times = new Time[5];
	   Random r = new Random();
	   for(int i=0; i<5; i++) 
		   times[i] = new Time(r.nextInt(24), r.nextInt(60), r.nextInt(24));
	   
	   Sort.selectionSort(times);
	   
	   for(Time t: times) {
		   System.out.println(t);
	   }
	   
   }
	
}
