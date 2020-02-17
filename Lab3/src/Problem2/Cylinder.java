package Problem2;

public class Cylinder extends Shapes{

	public Cylinder() {
		super();
	}
	
	public Cylinder(double radius) {
		this.radius = radius;
	}
	
	public Cylinder(double radius, double height) {
		this(radius);
		this.height = height;
	}
	
	@Override
	public double volume() {
		return height*Math.PI*Math.pow(radius, 2);
	}
	
	@Override
	public double surfaceArea() {
		return 2*Math.PI*radius*height;
	}
	
	@Override
	public double baseArea() {
		return Math.PI*Math.pow(radius, 2);
	}
	
	
}
