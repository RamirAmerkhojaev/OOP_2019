package Task3;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Date d1 = new Date(2016-11-13);
		Date d2 = new Date(2016-12-14);
		Employee e1 = new Employee("Radmir", 10000, d1, "NeRADMiru1234");
		Employee e2 = new Employee("Edyge", 9000, d2, "EdyGaaaay1337");
		Manager m1 = new Manager("IT Manager", 3000, "Ramir", 10000);
		Manager m2 = new Manager("Counting Manager", 2000, "Aron", 10000);
		System.out.println(m1.compareTo(m2));
		System.out.println(e1.compareTo(e2));
	}

}
