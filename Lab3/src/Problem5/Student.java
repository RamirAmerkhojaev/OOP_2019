package Problem5;

public class Student extends Person{

	public String program;
	public int year;
	public double fee;
	
	public Student() {
		super();
	}
	public Student(String name) {
		super(name);
	}
	public Student(String name, String adress) {
		super(name, adress);
	}
	public Student(String name, String adress, String program) {
		super(name, adress);
		this.program = program;
	}
	public Student(String name, String adress, String program, int year) {
		super(name, adress);
		this.program = program;
		this.year = year;
	}
	public Student(String name, String adress, String program, int year, double fee) {
		super(name, adress);
		this.program = program;
		this.year = year;
		this.fee = fee;
	}
	public String getProgram() {
		return program;
	}
	public void setProgram(String program) {
		this.program = program;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	
	public String toString() {
		return "\nName:"+name+", address:"+address+", program:"+program+", year:"+year+", fee:"+fee;
	}
	
}
