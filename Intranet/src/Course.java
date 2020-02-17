import java.io.Serializable;

public class Course implements Serializable{

	private String name;
	private int numOfCredits;
	private String faculty;
	Mark mark;
	
	public Course() {}
	
	public Course(String name) {
		this.name = name;
	}
	
	public Course(String name, int numOfCredits, String faculty) {
		this.name = name;
		this.numOfCredits = numOfCredits;
		this.faculty = faculty;
	}
    
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public int getNumOfCredits() {
		return numOfCredits;
	}

	public void setNumOfCredits(int numOfCredits) {
		this.numOfCredits = numOfCredits;
	}
	
	public Mark getMark() {
	    return mark;
	}
	
	public void setMark(Mark mark) {
		this.mark = mark;
	}
	
	@Override
	public String toString() {
		return "Course [name=" + name + ", numOfCredits=" + numOfCredits + ", faculty=" + faculty + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((faculty == null) ? 0 : faculty.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + numOfCredits;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		if (faculty == null) {
			if (other.faculty != null)
				return false;
		} else if (!faculty.equals(other.faculty))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (numOfCredits != other.numOfCredits)
			return false;
		return true;
	}		
}
