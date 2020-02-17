package problem3;
import java.util.*;

enum Gender {
	BOY,
	GIRL
}

class Person {
	
	Gender gender;
	
	public Person(Gender gender) 
	{
		this.gender = gender;
	}
	public Person(char c) {
		switch(c) {
		case 'B':
			gender = Gender.BOY;
			break;
		case 'G':
			gender = Gender.GIRL;
			break;
			}
	}
	
	public String toString() 
	{
		return gender.toString();
	}
	
}

public class DragonLaunch 
{

	Vector<Person> v = new Vector<Person>();
	
	public void kidnap(Person p) 
	{
         v.add(p);
	}
	 boolean willDragonEatOrNot() 
	{
		 int cnt1 = 0;
		 
		for(int i=0; i<v.size()-1; i++) {
			 
			   if(v.get(i).gender == Gender.BOY) {
				  cnt1++;
			   }
		          else if(v.get(i).gender == Gender.GIRL) 
		          {
		        	  cnt1--;
			 }
		}
		return (cnt1 > 0);
		
	}
}

class Main {

    public static void main(String args[]) 
    {
    	DragonLaunch d = new DragonLaunch();
    	
		Scanner input = new Scanner(System.in);
		System.out.println("Insert students: ");
		String s = input.next();
		
		for(int i = 0; i < s.length(); i++) {
			 Person p = new Person(s.charAt(i));
			 d.kidnap(p);
		 }
		
		if(d.willDragonEatOrNot()==false) 
		     System.out.printf("Yes, his launch consists of students");	
		else 
			System.out.println("No lunch for dragon");	
		
	}	
}



