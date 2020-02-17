package Task1;

import java.util.ArrayList;

public class Grades {
	
	public ArrayList<Gradeinfo> arrOfGrades;
	
	Grades(){
		arrOfGrades = new ArrayList<Gradeinfo>();
	}

	public boolean add(String studentName, double grade) {
		return arrOfGrades.add(new Gradeinfo(studentName, grade));
	}
	public String getReport() {
		return "Average - "+getAverage()+"\n"+"Maximum - "+getBest().getGrade()+"\n"+"Minimum - "+getWorst().getGrade();
	}
	
	public Gradeinfo getBest()
	{
		
		Gradeinfo best = arrOfGrades.get(0);
		for(Gradeinfo g: arrOfGrades) 
			
		{
			if(g.getGrade() > best.getGrade())
				best = g;
		}
		return best;
	}
	
	private Gradeinfo getWorst()
	{
		Gradeinfo worst = arrOfGrades.get(0);
		
		for(Gradeinfo g: arrOfGrades) 
		{
			if(g.getGrade() < worst.getGrade()) 
				worst = g;
		}
		return worst;
	}
	
	private double getAverage()
	{
		double avg = 0;
		for(Gradeinfo g: arrOfGrades) 
		{
			avg += g.getGrade();
		}
		return avg/arrOfGrades.size();
	}
	public String getNewMarks()
	{
		String res = "";
		Gradeinfo best = getBest();
		for(Gradeinfo gi: arrOfGrades)
		{
			gi.analyzeMark(best.getGrade());
			res += gi.toString() + "\n";
		}
		return res;
	}
	
	
}
