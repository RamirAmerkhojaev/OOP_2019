package student;

import java.util.*;

 public class Student
{

	public String name;
	public String id;
	public int yearOfStudy;
    
	public Student() 
	{
		
	}
	public Student(String name) 
	{
		this.name = name;
	}
	public Student(String name, String id) 
	{
		this(name);
		this.id = id;
	}
	public Student(String name, String id, int yearOfStudy)
	{
		this(name, id);
		this.yearOfStudy = yearOfStudy;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}
	
	public void setID(String id) {
		this.id = id;
	}

	public void setYear(int yearOfStudy) {
		this.yearOfStudy = yearOfStudy;
	}
	
	public int getYear() {
		return yearOfStudy;
	}
	
	public void Increase() 
	{
		yearOfStudy += 1;
		System.out.println(name + " " + id + " "+ yearOfStudy);
	}
	public String toString() {
		return name;
	}
	
}

    class Task1{
public static void main(String args[]) 
{
    
        String name = "Ramir";
        String id = "18BD110311";
        int year = 1;
        
        Student student = new Student(name, id, year);
      
        System.out.println(student);
        
        
        while(true){
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        if(s.equals("q")) {
         student.Increase();
      
        }
        }       	    
     }
   }

