package Problem3;

public class Person {

	public String name;

	public Person() {}
	
	public Person(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public boolean equals(Object o) {
		if(o == this) return true;
		if(!(o instanceof Person)) {
			return false;
		}
		Person person = (Person) o;
		
		return person.name.equals(name);
	}
	
	@Override
	public int hashCode() {
		int res = 17;
		res = 31 * res + name.hashCode();
		return res;
	}
	
	public String toString() {
		return name;
	}
	
}
