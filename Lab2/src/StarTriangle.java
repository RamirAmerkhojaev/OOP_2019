import java.util.*;

  class StarTriangle{
	  
	  public int width;
	  public String star;
	  
	  StarTriangle(int Width){
		  Width = width;
	  }
	  public String toString() {
		  return star;
	  }
	  
  }
     class Program {
    	 public static void main(String args[]) {
    		 
    		 int width = 3; 
    		 
    		 StarTriangle small = new StarTriangle(width);
    		 
    		 System.out.println(small.toString());
    		 
    	 }
     }