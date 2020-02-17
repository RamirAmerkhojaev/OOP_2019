package Problem5;

import java.util.*;
import java.util.HashSet;

public class Test {

	public static void main(String[] args) {
		
		HashSet<Student> students = new HashSet<Student>();
		HashSet<Staff> staff = new HashSet<Staff>();
		String name;
		String address;
		String program;
		int year;
		double fee;
		double pay;
		String school;
		
	    System.out.println("Do you want to add students or staff");
 			
	    Scanner input = new Scanner(System.in);
		String s = input.nextLine();
 		if(s.equals("students")) {
	    
			while(true) {
			
				System.out.printf("Student name: ");
				name = input.nextLine();
				if(name.equals("stop")) {
					break;
				}
				System.out.printf("Student adress: ");
				address = input.nextLine();
				System.out.printf("Student program: ");
				program = input.nextLine();
				System.out.printf("Student year: ");
	            year = input.nextInt();
				System.out.printf("Student fee: ");
				fee = input.nextDouble();
				Student newstudent = new Student(name, address, program, year, fee);
				students.add(newstudent);
				input.nextLine();
				
			}input.close();
		    
			System.out.println(students.toString());
			
		}else if(s.equals("staff")) {
		    
				while(true) {
				
					System.out.printf("Staff name: ");
					name = input.nextLine();
					if(name.equals("stop")) {
						break;
					}
					System.out.printf("Staff adress: ");
					address = input.nextLine();
					System.out.printf("Staff school: ");
					school = input.nextLine();
					System.out.printf("Staff pay: ");
		            pay = input.nextDouble();
					Staff newstaff = new Staff(name, address, school, pay);
					staff.add(newstaff);
					input.nextLine();
					
				}input.close();
			    
				System.out.println(staff.toString());
				
		
	}

}
}
