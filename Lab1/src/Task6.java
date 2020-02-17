import java.util.*;

public class Task6 {

	public static void main(String args[]) {
	      
	      System.out.println("Input your word");
	        isPalindrome();
	   	     
}
	
	public static void isPalindrome() {
		
		Scanner input = new Scanner(System.in);
		 String word = "";
	      String reverseWord = ""; 
	      word = input.nextLine();
	     
		int length = word.length();
		for(int i = length - 1 ; i>= 0 ; i--) {
			reverseWord = reverseWord + word.charAt(i);
		}
		if(word.equals(reverseWord)) {
			System.out.println("YES!");
		}else {
			System.out.println("NO!");
		}
		
	}	
	}
	
	
