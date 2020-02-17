package Task3;

import java.util.HashSet;

public class Manager extends Employee implements Comparable{

	public String manager;
	public double bonus;
	public HashSet<Employee> h;
	
	public Manager() {
		super();
	}
	public Manager(String manager) {
		h = new HashSet<Employee>();
		this.manager = manager;
	}
	public Manager(String manager, double bonus) {
		this(manager);
		this.bonus = bonus;
	}
	public Manager(String manager, double bonus, String name) {
		super(name);
		this.bonus = bonus;
		this.manager = manager;
	}
	public Manager(String manager, double bonus, String name, double salary) {
		super(name, salary);
		this.bonus = bonus;
		this.manager = manager;
	}
	
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	public int compareTo(Object otherObject) 
	{  
		Manager other = (Manager) otherObject;  
		
		int comp = super.compareTo(otherObject);
		if(comp!=0) {
		    return comp;
		}
		if(bonus > other.bonus) return -1;
		else if(bonus < other.bonus) return 1;
		return 0;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(bonus);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((h == null) ? 0 : h.hashCode());
		result = prime * result + ((manager == null) ? 0 : manager.hashCode());
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
		Manager other = (Manager) obj;
		if (Double.doubleToLongBits(bonus) != Double.doubleToLongBits(other.bonus))
			return false;
		if (h == null) {
			if (other.h != null)
				return false;
		} else if (!h.equals(other.h))
			return false;
		if (manager == null) {
			if (other.manager != null)
				return false;
		} else if (!manager.equals(other.manager))
			return false;
		return true;
	}
	
}
