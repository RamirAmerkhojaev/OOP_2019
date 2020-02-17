
import java.util.*;

public class Example4
{
    public static void main(String[] args)
    {
       double                 leftOperand = 0, result, rightOperand = 0;
       String                 leftString, operator, rightString;
       StringTokenizer        tokenizer;
       Scanner in = new Scanner(System.in);

       tokenizer = new StringTokenizer(in.nextLine(), "+-*/", true);
 

       try
       {
          leftString   = tokenizer.nextToken();
          operator     = tokenizer.nextToken();
          rightString  = tokenizer.nextToken();

          try{
          leftOperand  = Double.parseDouble(leftString);
          }catch(NumberFormatException nfe1) {
        	  System.out.println("First operand is not a number");
          }

          try{	  
          rightOperand = Double.parseDouble(rightString);    
          }catch(NumberFormatException nfe2) {
          	  System.out.println("Second operand is not a number");
          }
          

          if (operator.equals("+"))
             result = leftOperand + rightOperand;
          else if (operator.equals("-"))
              result = leftOperand - rightOperand;
          else if (operator.equals("*"))
              result = leftOperand * rightOperand;
          else if (operator.equals("/"))
              result = leftOperand / rightOperand;
          else
             result = 0.0;

          System.out.println("Result: " + result);  
       }
       catch (NoSuchElementException nsee)
       {
          System.out.println("Invalid syntax");
       }



    }
}