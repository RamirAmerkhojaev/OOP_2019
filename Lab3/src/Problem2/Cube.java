package Problem2;

public class Cube extends Shapes{

	public Cube() {
		super();
	}
	
	public Cube(double length) {
		this.length = length;
	}
	
    @Override
    public double volume() {
       	return Math.pow(length, 3);
    }
    
	@Override
	public double surfaceArea() {
		return 6*Math.pow(length, 2);
	}
	
	@Override
	public double baseArea() {
		return Math.pow(length, 2);
	}
	
}
