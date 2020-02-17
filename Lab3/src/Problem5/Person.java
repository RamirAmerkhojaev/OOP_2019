package Problem5;

public class Person {
	
	public String name;
	public String address;
	
	public Person() {
		
	}
	public Person(String name) {
		this.name = name;
	}
	public Person(String name, String address) {
		this(name);
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public String getAdress() {
		return address;
	}
	public void setAdress(String adress) {
		this.address = adress;
	}
	public String toString() {
		return "Name: "+name+",address: "+address;
	}
	

}
