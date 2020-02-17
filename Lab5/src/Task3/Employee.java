package Task3;

import java.util.Date;

public class Employee implements Comparable{
	
	public double salary;
	public Date hireDate;
	public String insuranceNumber;
	public String name;
	
	public Employee() {}
	
	public Employee(String name) {
		this.name = name;
	}
	public Employee(String name, double salary) {
		this(name);
		this.salary = salary;
	}
	public Employee(String name, double salary, Date hireDate) {
		this(name, salary);
		this.hireDate = hireDate;
	}
	public Employee(String name, double salary, Date hireDate, String insuranceNumber) {
		this(name, salary, hireDate);
		this.insuranceNumber = insuranceNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getInsNumber() {
		return insuranceNumber;
	}
	public void setInsNumber(String insuranceNumber) {
		this.insuranceNumber = insuranceNumber;
	}
	
	public int compareTo(Object otherObject) 
	{  
		Employee other = (Employee) otherObject;  
		if (salary < other.salary) return -1;  
		if (salary > other.salary) return 1;  
		return 0;  
	}


}
