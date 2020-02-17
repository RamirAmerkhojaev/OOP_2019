import java.io.Serializable;

public class Employee extends User implements Serializable{

	private double salary;
	
	public Employee() {
		super();
	}
	public Employee(String id, double salary) {
		super(id);
		this.salary = salary;
	}
	
	public Employee(String login, String password, String id) {
		super(login, password, id);
	}
	
	public Employee(String login,String password, String id, double salary) {
		super(login, password, id);
		this.salary = salary;
	}
	
	public double getSalary() { return salary;}

	public void setSalary(double salary) {this.salary = salary;}
	
	public void addPremiumSalary(double sum) {
		salary += sum; 
	}
	
	public void sendOrder(Order order) {
		TechSupportGuy.addOrder(order);
	}
	
	public String actions() {
		String s = "";
		
		s += "1)Send order to executor\n";
		s += "2)Get salary\n";
		s += "0)Exit\n";
		
		return s;
	}

	@Override
	public String toString() {
		return "Employee [salary=" + salary + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(salary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Employee other = (Employee) obj;
		if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
			return false;
		return true;
	}
}
