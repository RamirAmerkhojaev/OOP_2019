package Problem3;

import java.util.*;

import Problem3.Employee;

public class Test {

	public static void main(String[] args) {
		
		Manager m = new Manager("Ramir");
		HashSet<Employee> hs = new HashSet<Employee>(); 
		
	    Employee programmer = new Employee("Edyge", 15000, 1, "228");
	    Employee programmer2 = new Employee("Edyge", 15000, 1, "228");
		Employee counter = new Employee("Timur", 10000, 2, "1337");
		Employee ITspecialist = new Employee("Radmir", 80000, 3, "322");
		Employee abc = new Employee("Radmir", 80000, 3, "322");
		
		m.addHashSet(programmer);
		m.addHashSet(programmer2);
		m.addHashSet(counter);
		m.addHashSet(ITspecialist);
		m.addHashSet(abc);
		hs.add(programmer);
		hs.add(programmer2);
	    hs.add(counter);
		hs.add(ITspecialist);
		hs.add(abc);
		
		System.out.println(m.toString());
		System.out.println(hs.toString());
	
}
}
