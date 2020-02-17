package problem2;

public class Course {

	public String courseName;
	public String description;
	public int numberOfCredits, prerequisites;
	
	Course()
	{
		
	}
	Course(String courseName)
	{
		this.courseName = courseName;
	}
	Course(String courseName, String description)
	{
		this(courseName);
		this.description = description;
	}
	Course(String courseName, String description, int numberOfCredits)
	{
		this(courseName, description);
		this.numberOfCredits = numberOfCredits;
	}
	Course(String courseName, String description, int numberOfCredits, int prerequisites)
	{
		this(courseName, description, prerequisites);
		this.prerequisites = prerequisites;
	}
	public String toString() 
	{
		return courseName+" "+description; 
	}
	
}
