package Problem2;

public class Sphere extends Shapes{
	
	public Sphere() {
		super();
	}
	
	public Sphere(double radius) {
		this.radius = radius;
	}
	
    @Override
    public double volume() {
       return (4/3)*Math.PI*Math.pow(radius, 3);	
    }
    
	@Override
	public double surfaceArea() {
		return 4*Math.PI*Math.pow(radius, 2);
	}
	
	@Override
	public double baseArea() {
		return Math.PI*Math.pow(radius, 2);
	}
}
