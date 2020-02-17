package problem2;
import java.util.*;

public class GradeBook {
	
    public ArrayList<Grades> arrOfGrades;
    public Course course;
    
   
    
    GradeBook() 
    {
    	arrOfGrades = new ArrayList<Grades>();
    	course = new Course();
    }
    
     GradeBook(Course course)
     {
    	 arrOfGrades = new ArrayList<Grades>();
    	 this.course = course;
     }
     GradeBook(Grades grades, Course course) 
     {
    	 this(course);
     	 arrOfGrades.add(grades);
     }
	
	public String displayMessage()
	{
		return "Welcome to the grade book for " +course.courseName+ " Object-oriented Programming and Design!"+"\n\n"
		+"Please, input grades for students: "+"\n";
	}

	public String displayGradeReport() 
	{
		
	    return "The class average "+getAverage()+"\n"
	    		+ "Lowest grade is "+getBest().ToString()+"\n"
	    		+ "Highest grade is "+getWorst().ToString();
	}
	
	public boolean addGrade(Grades grades) 
	{
		return arrOfGrades.add(grades);
	}
	
	public boolean addGrade(String name,String id, double grade) 
	{
		return arrOfGrades.add(new Grades(name,id, grade));
	}
	
	private Grades getBest()
	{
		Grades best = arrOfGrades.get(0);
		for(Grades g: arrOfGrades) 
		{
			if(g.getGrade() > best.getGrade())
				best = g;
		}
		
		return best;
	}
	
	private Grades getWorst()
	{
        Grades worst = arrOfGrades.get(0);
		
		for(Grades g: arrOfGrades) 
		{
			if(g.getGrade() < worst.getGrade()) 
				worst = g;
		}
		return worst;
	}
	
	private double getAverage()
	{
		double avg = 0;
		for(Grades g: arrOfGrades) 
		{
			avg += g.getGrade();
		}
		return avg/arrOfGrades.size();
	}
	
	public void gradesDistribution() 
	{
		System.out.println("Classes distribution: ");
		int cnt1 = 0;
		int cnt3 = 0;
		int cnt2 = 0;
		int cnt4 = 0;
		int cnt5 = 0;
		int cnt6 = 0;
		int cnt7 = 0;
		int cnt8 = 0;
		int cnt9 = 0;
		int cnt10 = 0;
		
		for(Grades g: arrOfGrades) 
		{
			if(g.getGrade() >0 && g.getGrade()< 10) {
				cnt1++;
			}else if(g.getGrade() >=10 && g.getGrade()<20) {
				cnt2++;
			} else if(g.getGrade() >=20 && g.getGrade()<30) {
				cnt3++;
			}else if(g.getGrade() >=30 && g.getGrade()<40) {
				cnt4++;
			}else if(g.getGrade() >=40 && g.getGrade()<50) {
				cnt5++;
			}else if(g.getGrade() >=50 && g.getGrade()<60) {
				cnt6++;
			}else if(g.getGrade() >=60 && g.getGrade()<70) {
				cnt7++;
			}else if(g.getGrade() >=70 && g.getGrade()<80) {
				cnt8++;
			}else if(g.getGrade() >=80 && g.getGrade()<90) {
				cnt9++;
			}else if(g.getGrade() >=90 && g.getGrade()<=100) {
				cnt10++;
			}
		}
		System.out.printf("00-09: ");
		for(int i=0; i<cnt1; i++) {
			System.out.printf("*");
		}
		System.out.println();
		System.out.printf("10-19: ");
		for(int i=0; i<cnt2; i++) {
			System.out.printf("*");
		}
		System.out.println();
		System.out.printf("20-29: ");
		for(int i=0; i<cnt3; i++) {
			System.out.printf("*");
		}
		System.out.println();
		System.out.printf("30-39: ");
		for(int i=0; i<cnt4; i++) {
			System.out.printf("*");
		}
		System.out.println();
		System.out.printf("40-49: ");
		for(int i=0; i<cnt5; i++) {
			System.out.printf("*");
		}
		System.out.println();
		System.out.printf("50-59: ");
		for(int i=0; i<cnt6; i++) {
			System.out.printf("*");
		}
		System.out.println();
		System.out.printf("60-69: ");
		for(int i=0; i<cnt7; i++) {
			System.out.printf("*");
		}
		System.out.println();
		System.out.printf("70-79: ");
		for(int i=0; i<cnt8; i++) {
			System.out.printf("*");
		}
		System.out.println();
		System.out.printf("80-89: ");
		for(int i=0; i<cnt9; i++) {
			System.out.printf("*");
		}
		System.out.println();
		System.out.printf("90-100: ");
		for(int i=0; i<cnt10; i++) {
			System.out.printf("*");
		}
		
	}
	
	public String toString() 
	{
	     return course.courseName;
	}
}