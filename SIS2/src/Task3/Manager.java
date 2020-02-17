package Task3;

import java.util.*;

public class Manager extends Employee implements Cloneable {

	public String manager;
	public double bonus;
	
	public Manager() {
		super();
	}
	public Manager(String manager, String name) {
		super(name);
		this.manager = manager;
	}
	public Manager(String manager,String name, Date hireDate) {
		super(name, hireDate);
		this.manager = manager;
	}
	
	public Manager clone() throws CloneNotSupportedException {
		return (Manager)super.clone();
	}
	
	public String toString() {
		return name+" "+manager;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(bonus);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((manager == null) ? 0 : manager.hashCode());
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
		Manager other = (Manager) obj;
		if (Double.doubleToLongBits(bonus) != Double.doubleToLongBits(other.bonus))
			return false;
		if (manager == null) {
			if (other.manager != null)
				return false;
		} else if (!manager.equals(other.manager))
			return false;
		return true;
	}
}
