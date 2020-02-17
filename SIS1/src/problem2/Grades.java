package problem2;
import student.Student;

public class Grades {
	
	private Student student;
	private double grade;
	
	Grades()
	{
		student = new Student();
	}
	Grades(String name, double grade)
	{
		student = new Student(name);
		setGrade(grade);
	}
	Grades(String name, String id)
	{
		student = new Student(name, id);
	}
	Grades(String name,String id,double grade)
	{
		this(name, id);
		setGrade(grade);
	}
	public void setGrade(double grade)
	{
		if (grade > 0 && grade <= 100) 
		{
			this.grade = grade;
		}else 
		{
			this.grade = 0;
		}
	}
	public double getGrade() 
	{
	    return grade;	
	}
	public Student getStudent() 
	{
		return student;
	}
	public String ToString() 
	{
		return grade+" ("+student.name+", "+"id: "+student.id+")";
	}
	
}
