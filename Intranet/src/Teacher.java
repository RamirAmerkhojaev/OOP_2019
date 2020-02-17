import java.io.Serializable;
import java.util.*;

public class Teacher extends Employee implements Serializable{

	private String name;
	public Vector <String> inbox;
	private CourseFiles course;
	
	public Teacher() {
		super();
		inbox = new Vector <String>();
		Main.coursefiles = new Vector<CourseFiles>();
		Main.students = new Vector<Student>();
		Main.courses = new Vector<Course>();
	}
	
	public Teacher(String id, double salary, String name) {
		super(id, salary);
		this.name = name;
	}
	
	public Teacher(String login, String password, String id, double salary, String name) {
		super(login, password, id, salary);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	 public Vector<Course> getCourse(){ 
		 return Main.courses;
		 }
	
	public void ShowInbox() {
	    System.out.println(inbox);
	  }
	
	public void viewCourses() {
		System.out.println(Registration.availableCourses);
	}
	
	public void manageCourseFile(String file) {
		course.setFile(file);
	}
	
	public String actions() {
		String s = "";
		
		s += "1)View student's info\n";
		s += "2)View courses\n";
		s += "3)Add course file\n";
		s += "4)Remove course file\n";
		s += "5)Set grade\n";
		s += "0)Exit\n";
		
		return s;
	}
	
	public void addcourseFile(CourseFiles courseFiles) {
			Main.coursefiles.add(courseFiles);
	}
	
	public void deleteFile(String file) {
		for(int i=0; i<Main.coursefiles.size(); i++) {
			if(Main.coursefiles.get(i).getFile().contentEquals(file))
				Main.coursefiles.remove(Main.coursefiles.get(i));
		}
	}
	
	public String viewStudentsInfo(String name) {
		for(int i=0; i<Main.students.size(); i++) {
			if(Main.students.get(i).getName().equals(name))
				return Main.students.get(i).toString();
		  }
		return "Student not found";
	}

	public void giveMark(Student student, Course course, Mark mark) {
		student.marks.replace(course, mark);
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Teacher other = (Teacher) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Teacher [name=" + name + "]";
	}
	
}
