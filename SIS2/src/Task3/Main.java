package Task3;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
	  Date d1 = new Date(2016-11-13);
	  Date d2 = new Date(2017-06-24);
	  Date d3 = new Date(2020-06-24);
	  Date d4 = new Date(2015-06-24);
	  Date d5 = new Date(2014-06-24);
	
      EmployeeNameComparator comp = new EmployeeNameComparator();
	  Vector<Manager> emp = new Vector<Manager>();
	   Vector<Employee> emp2 = new Vector<Employee>();  
	   EmployeeHireComparator comp2 = new EmployeeHireComparator();
	  
	  emp.add(new Manager("IT manager","Ramir", d1));
	  emp.add(new Manager("Marketing manager","Aron", d2));
	  emp.add(new Manager("Financial manager","Edyge", d3));
	  emp.add(new Manager("Law manager","Bagdat", d4));
	  emp.add(new Manager("Creative Manager","Radmir", d5));
	  emp.add(new Manager("Production manager","Timoxa", d1));
	  
	  Collections.sort(emp, comp2);
	  
	  for(Employee e : emp){
		   System.out.println(e); 
	  }
	  
	}	
}
