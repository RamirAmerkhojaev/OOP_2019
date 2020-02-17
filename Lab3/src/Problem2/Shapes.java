package Problem2;

public abstract class Shapes {

	public double radius, height, length; 
	
	public Shapes() {
		radius = height = length = 0;
	}
	
	public abstract double volume();	
	public abstract double surfaceArea();
	public abstract double baseArea();
	
	public String getReport() {
		
		String chooseShape = this.getClass().toString();
		return chooseShape+" has a volume: "+volume()+"\n"+"surface area: "+surfaceArea()+"\n"+"base area: "+baseArea();
	}
	
}
