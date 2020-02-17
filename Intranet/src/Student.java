import java.io.Serializable;
import java.util.*;

public class Student extends User implements Serializable {

	private String name;
	private int yearofStudy;
	private HashMap<Course, Boolean> register;
	public HashMap<Course, Mark> marks;
	
	public Student() {
		super();
		register = new HashMap<Course, Boolean>();
	    marks = new HashMap<Course, Mark>();
	}

	public Student(String login, String password, String id) {
		super(login, password, id);
	}
	
	public Student(String name, int yearOfStudy, String id) {
		super(id);
		this.name = name;
		this.yearofStudy = yearOfStudy;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getYearofStudy() {
		return yearofStudy;
	}

	public void setYearofStudy(int yearofStudy) {
		this.yearofStudy = yearofStudy;
	}
    
	public void registerCourse(Course course) {
		register.put(course, true);
	}
	
	public void viewTeacherInfo(String name) {
		for(int i=0; i<Main.teachers.size(); i++) {
			if(Main.teachers.get(i).getName().equals(name)) {
				System.out.println(Main.teachers.get(i));
			}
		}
	}
	
	public void viewTeacherInfo(Course course) {
		for(int i=0; i<Main.students.size(); i++) {
			for(int j=0; j<Main.teachers.get(i).getCourse().size(); j++) {
				if(Main.teachers.get(i).getCourse().get(j).equals(course))
					System.out.println(Main.teachers.get(i));
			}
		}
	}
	
	public void viewMarks(Course course) {
		for(int i=0; i<Main.courses.size(); i++) {
			if(Main.courses.get(i).equals(course)) {
				System.out.println(Main.courses.get(i).getMark());
			}
		}
	}
	
	 public String  transcript(){
	        String transcripter = "";
	        Iterator it = marks.entrySet().iterator();
	        while(it.hasNext()){
	            Map.Entry pair = (Map.Entry)it.next();
	            transcripter += pair.getKey() + " " + pair.getValue();
	        }
	        return transcripter;
	    }
	 
	 public String actions() {
			
			String s = "";
			
			s += "1)Register course\n";
			s += "2)View teacher info by course\n";
			s += "3)View transcript\n";
			s += "4)View marks on the course\n";
			s += "0)Exit\n";
			
			return s;
		}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + yearofStudy;
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
		Student other = (Student) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (yearofStudy != other.yearofStudy)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", yearofStudy=" + yearofStudy + ", id= "+ super.getId() +"]";
	}
	
}
