import java.util.*;

public class Temperature {

	private double value;
	private char scale;
	
	Temperature()
	{
		value = 0.0;
		scale = 'C';
	}
	Temperature(double value, char scale)
	{
		this.value = value;
	    this.scale = scale;
	}
	Temperature(double value)
	{
		this.value = value;
	    this.scale = 'C';
	}
	Temperature(char scale)
	{
		this.scale = scale;	
		this.value = 0.0;
	}
	public void setValue(double value) 
	{
		this.value = value;
	}
	public void setScale(char scale) 
	{
		this.scale = scale;
	}
	public void setBoth(double value, char scale) 
	{
		this.scale = scale;
		this.value = value;
	}
	public char getScale() 
	{
		return scale;
	}
	String toFahrenheit() {
	    if(this.scale == 'F' || this.scale == 'f') {
	      return "Already in Fahrenheit";
	    }else {
	      System.out.printf("Temperature in Fahrenheit: ");
	      this.scale = 'F';
	      return Double.toString(9*(value/5)+32);
	    }	      
	  }
	String toCelsius() {
	    if(this.scale == 'C' || this.scale == 'c') {
	      return "Already in Celsius";
	    }else {
	      System.out.printf("Temperature in Celsius: ");
	      this.scale = 'C';
	      return Double.toString(5*(value-32)/9);
	    }   
	  }
}


class Problem1 {
    	
        public static void main(String args[]) 
        {
        	double n;
        	char c;    
    	    Scanner input = new Scanner(System.in);
    	    System.out.println("Input value of temperature with the scale: ");
    	    n = input.nextDouble();
    	    c = input.next().charAt(0);
    	    
    	    Temperature t = new Temperature(n,c);
    	    
    	    if(c == 'F') {
    	          System.out.println(t.toFahrenheit() + " " + t.getScale());
    	          System.out.println(t.toCelsius() + " " + t.getScale());
    	          }else if(c == 'C') {
    	          System.out.println(t.toCelsius() + " " + t.getScale());
    	          System.out.println(t.toFahrenheit() + " " + t.getScale());
    	          }
    	      	           
        }	
}


