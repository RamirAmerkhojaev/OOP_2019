package Task3;

public class EmployeeHireComparator implements Comparator<Employee>, java.util.Comparator<Employee>{

        public int compare(Employee a, Employee b) {
        	
        	return a.getDate().compareTo(b.getDate());
        	
        }
	
}
