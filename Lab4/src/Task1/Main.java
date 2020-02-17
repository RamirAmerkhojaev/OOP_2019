package Task1;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;



public class Main {

	public static void main(String[] args) throws IOException {
		
		Grades g = new Grades();
	   FileReader fl = new FileReader("C:\\Users\\Dell\\Desktop\\unik\\oop\\scores.txt");
	   BufferedReader bw = new BufferedReader(fl);
	   String line = bw.readLine();
	   while(line != null) {
		      String[] arr = line.split("-");
		      String name = arr[0];
		      double mark = Double.parseDouble(arr[1]);
		      g.add(name, mark);
		      line = bw.readLine();
	   }bw.close();
	   fl.close();
	
	   
          
          BufferedWriter bwr = new BufferedWriter (new FileWriter("C:\\Users\\Dell\\Desktop\\unik\\oop\\grades.txt", true));    
          bwr.write(g.getReport());
          bw.close();
      
      
	}
}
