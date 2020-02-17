package Task1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main2 {

	public static void main(String[] args) throws IOException {
		
		Grades g = new Grades();
		   FileReader in = new FileReader("C:\\Users\\Dell\\Desktop\\unik\\oop\\scores.txt");
			BufferedReader br = new BufferedReader(in);
	          String line = br.readLine();
	          System.out.println(line);
	          while(line != null){
	        	String[] gradeStudent = line.split("-");
	  			String name = gradeStudent[0];
	  			double grade = Double.parseDouble(gradeStudent[1]);
	  			g.add(name, grade);			
	  			line = br.readLine();
	          }
	          in.close();
	          br.close();
	          
	          
	          BufferedWriter bw = new BufferedWriter (new FileWriter("C:\\Users\\Dell\\Desktop\\unik\\oop\\grades.txt"));
	          bw.write(g.getNewMarks());     
	          bw.close();

	}

}
