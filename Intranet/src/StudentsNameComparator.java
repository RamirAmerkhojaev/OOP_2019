
public class StudentsNameComparator implements Comparator<Student>, java.util.Comparator<Student> {

	public int compare(Student a, Student b) {
	   return a.getName().compareTo(b.getName());	
	}
}
