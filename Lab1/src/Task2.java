import java .util.*;

	public class Task2 {
		
	    public static void main(String args[]) {
	    
	      Scanner input = new Scanner(System.in);
	        
	      int firstGrade;
	      System.out.println("Enter your score");
	      firstGrade = input.nextInt();

	      if(firstGrade >= 0 && firstGrade <= 49)
	      System.out.println("Your grade is F!");
	      else if(firstGrade >= 50 && firstGrade <= 54)
	      System.out.println("Your grade is D!");
	      else if(firstGrade >= 55 && firstGrade <=59 )
	      System.out.println("Your grade is D+!");
	      else if(firstGrade >= 60 && firstGrade <=64 )
	      System.out.println("Your grade is C-!");
	      else if(firstGrade >= 65 && firstGrade <=69 )
	      System.out.println("Your grade is C!");
	      else if(firstGrade >= 70 && firstGrade <=74 )
	      System.out.println("Your grade is C+!");
	      else if(firstGrade >= 75 && firstGrade <=79 )
	      System.out.println("Your grade is B-!");
	      else if(firstGrade >= 80 && firstGrade <=84 )
	      System.out.println("Your grade is B!");
	      else if(firstGrade >= 85 && firstGrade <=89 )
	      System.out.println("Your grade is B+!");
	      else if(firstGrade >= 90 && firstGrade <=94 )
	      System.out.println("Your grade is A-!");
	      else if(firstGrade >= 95 && firstGrade <=100 )
	      System.out.println("Your grade is A!");
	    }
	}

