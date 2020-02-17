package problem2;
import java.util.*;

public class GradeBookTest {
	
	public static void main(String args[]) 
	{
		GradeBook gb = new GradeBook(new Course("CS101"));
		
	    Scanner input = new Scanner(System.in); 	
		String student;
		String id;
		int grade;
		
		System.out.println(gb.displayMessage());
		
		while(true) 
		{
			System.out.printf("Student name: ");
			student = input.nextLine();
			if (student.equals("stop"))
				break;
			System.out.printf("Student id: ");
			id = input.nextLine();
			System.out.print("Grade: ");
			grade = input.nextInt();
			gb.addGrade(student,id,grade);
			input.nextLine();
		}
		input.close();
		
		System.out.printf(gb.displayGradeReport());
		System.out.println();
		System.out.println();
		gb.gradesDistribution();
	}
	
}
