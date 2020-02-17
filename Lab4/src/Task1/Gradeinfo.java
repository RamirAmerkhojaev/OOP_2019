package Task1;

import student.Student;

public class Gradeinfo {

	Grades g = new Grades();
	private Student student;
	private double grade;
	private char mark;
	
	Gradeinfo()
	{
		student = new Student();
		grade = 100;
		mark = 'A';
	}
	Gradeinfo(String name, double grade)
	{
		student = new Student(name);
		this.grade = grade;
		analyzeMark(100);
	}
	
	public void setGrade(double grade)
	{
		this.grade = grade;
	}
	public double getGrade() 
	{
	    return grade;	
	}
	public Student getStudent() 
	{
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	
	public void analyzeMark(double max)
	{
		if (max - grade <= 10)
			mark = 'A';
		else if (max - grade <= 20)
			mark = 'B';
		else if (max - grade <= 30)
			mark = 'C';
		else if (max - grade <= 40)
			mark = 'D';
		else mark = 'F';
	}
	public String toString() 
	{
		return student.name+" "+"'"+mark+"'";
	}
	
}
