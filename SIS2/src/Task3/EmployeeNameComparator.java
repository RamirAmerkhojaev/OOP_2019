package Task3;

public class EmployeeNameComparator implements Comparator<Employee>, java.util.Comparator<Employee> {
	
	 public int compare(Employee a, Employee b){
	      
	        return a.getName().compareTo(b.getName());
	        
	    }
	
}
