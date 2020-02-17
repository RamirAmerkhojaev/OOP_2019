import java.io.Serializable;
import java.util.*;

public class ORManager extends Employee implements Serializable{
	
	private StudentsNameComparator comp; 
	Teacher t;
	
	public ORManager() {
		super();
		comp = new StudentsNameComparator();
		t = new Teacher();
	}
	
	public void addCourse(Course course) {
		Registration.availableCourses.add(course);
	}

	public void reportNew(News news) {
		  News.addNews(news);
	}
	
	public void addStudents(Student student) {
		Main.students.add(student);
	}
	
	public void addTeachers(Teacher teacher) {
		Main.teachers.add(teacher);
	}
	
	public void sendMessage(String message) {
	    	t.inbox.add(message);
	  }
	
	public String actions() {
		String s = "";
		
		s += "1)Add course\n";
		s += "2)Add students\n";
		s += "3)Add teachers\n";
		s += "4)Report new\n";
		s += "5)Remove User\n";
		s += "0)Exit\n";
		
		return s;
	}
	
	public void sortStudents() {
		
		Collections.sort(Main.students, comp);
		for(Student s: Main.students) {
			System.out.println(s.toString());
		}
	}
}
