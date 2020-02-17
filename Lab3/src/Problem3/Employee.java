package Problem3;

import Problem3.Person;

public class Employee extends Person{

	public double salary;
	public int year;
	public String insuranceNumber;
	
	public Employee() {
		super();
	}
	public Employee(String name) {
		super(name);
	}
	public Employee(String name, double salary) {
		this(name);
		this.salary = salary;
	}
	public Employee(String name, double salary, int year) {
		this(name, salary);
		this.year = year;
	}
	public Employee(String name, double salary, int year, String insuranceNumber) {
		this(name, salary, year);
		this.insuranceNumber = insuranceNumber;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getInsNumber() {
		return insuranceNumber;
	}
	public void setInsNumber(String insuranceNumber) {
		this.insuranceNumber = insuranceNumber;
	}
	
	@Override
	public boolean equals(Object o) {
		if(o == this) return true;
		if(!(o instanceof Person)) {
			return false;
		}
		Employee employee = (Employee) o;
		
		return employee.salary == salary &&
				employee.year == year &&
				employee.insuranceNumber.equals(insuranceNumber);
		
	}
	@Override
	public int hashCode() {
		int res = 7;
		long longBits = Double.doubleToLongBits(salary);
		res = 89 * res + (int)(longBits - (longBits >>> 32));
		res = 89 * res + year;
		res = 89 * res + insuranceNumber.hashCode();
		return res;
	}
	
	public String toString() {
		return "\nName: "+name+", salary: "+salary+", year: "+year+", insurance number: "+insuranceNumber;
	}
	
}
