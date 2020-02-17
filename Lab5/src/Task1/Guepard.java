package Task1;

public class Guepard implements Moveable{

	private double speed;
	
	public Guepard() {}
	public Guepard(double speed) 
	{
		this.speed = speed;
	}
	public double getSpeed()
	{
		return speed;
	}
	public void setSpeed(double speed) 
	{
		this.speed = speed;
	}
	
	public void move() 
	{
	   System.out.printf("Guepard is moving with a speed of %d", speed);	
	}
	
}
