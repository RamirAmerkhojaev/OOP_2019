package Task1;

public class SportCar extends Transport{

	public SportCar() 
	{
		super();
	}
	public SportCar(double engineVolume, double distance)
	{
		this.engineVolume = engineVolume;
		this.distance = distance;
	}
	@Override
	public double FuelConsumption() 
	{
	     return (engineVolume/distance) * 100;	
	}
	@Override
	public void Motion() 
	{
		System.out.println("Sport car is moving");
	}
	
}
