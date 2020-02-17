package Task1;

public class AirPlane implements Flyable{

	private double speed;
	private int height = Flyable.HeightOnAir;
	
	public AirPlane() {};
	public AirPlane(double speed) 
	{
		this.speed = speed;
	}
	
	public void move() 
	{
		System.out.printf("Plane is moving with a speed of %d", speed);
	}
	public void flying() 
	{
		System.out.printf("Plane is moving on the height %d", height);
	}
	
}
