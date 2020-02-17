package Problem3;

import java.util.HashSet;

import Problem3.Employee;

public class Manager extends Employee{

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
		this(name, bonus, manager);
		this.bonus = bonus;
		this.manager = manager;
	}
	public Manager(String manager, double bonus, String name, double salary, int year) {
		super(name, salary, year);
		this.bonus = bonus;
		this.manager = manager;
	}
	public Manager(String manager, double bonus, String name, double salary, int year, String insuranceNumber) {
		super(name, salary, year, insuranceNumber);
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
	
	public void bonus() {
		salary = salary + bonus;
	}
	
	public void addHashSet(Employee e) {
		h.add(e);
	}
	
	@Override
	public boolean equals(Object o) {
		if(o == this) return true;
		if(!(o instanceof Person)) {
			return false;
		}
		Manager m = (Manager) o;
		
		return m.manager.equals(manager) &&
		           m.bonus == bonus;
		
	}
	@Override
	public int hashCode() {
		int res = 5;
		long longBits = Double.doubleToLongBits(bonus);
		res = 37 * res + manager.hashCode();
		res = 37 * res + (int)(longBits - (longBits >>> 32));
		return res;
	}
	public String toString() {
		return "Manager of team: "+manager;
	}

}
