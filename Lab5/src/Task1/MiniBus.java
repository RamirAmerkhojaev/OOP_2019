package Task1;

public class MiniBus extends Transport {
	
	public MiniBus() 
	{
		super();
	}
	public MiniBus(double distance, double engineVolume) 
	{
		this.distance = distance;
		this.engineVolume = engineVolume;
	}
	@Override
	public double FuelConsumption() 
	{
		return (engineVolume/distance) * 100;
	}
	@Override
	public void Motion() 
	{
		System.out.println("Mini bus is moving");
	}
}
