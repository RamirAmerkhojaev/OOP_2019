package Problem5;

public class Staff extends Person{

	public String school;
	public double pay;
	
	public Staff() {
		super();
	}
	public Staff(String name) {
		super(name);
	}
	public Staff(String name, String adress) {
		super(name, adress);
	}
	public Staff(String name, String adress, String school) {
		super(name, adress);
		this.school = school;
	}
	public Staff(String name, String adress, String school, double pay) {
		super(name, adress);
		this.school = school;
		this.pay = pay;
	}
	public String toString() {
		return "\nName:"+name+", address:"+address+", school:"+school+", pay:"+pay;
	}
	
}
