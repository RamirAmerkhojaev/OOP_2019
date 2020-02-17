package Task3;

import java.util.Date;

public class Employee implements Cloneable{

	public Date hireDate;
	public String name;
	
	public Employee() {
	}
	
	public Employee(String name) {
		this.name = name;
	}
	public Employee(String name, Date hireDate) {
		this(name);
		this.hireDate = hireDate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDate() {
		return hireDate;
	}
	public void detDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	public Employee clone() throws CloneNotSupportedException {
		Employee e = (Employee)super.clone();
		e.hireDate = (Date)hireDate.clone();
		return e;
	}
	public String toString() {
		return name+" "+hireDate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((hireDate == null) ? 0 : hireDate.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Employee other = (Employee) obj;
		if (hireDate == null) {
			if (other.hireDate != null)
				return false;
		} else if (!hireDate.equals(other.hireDate))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}
