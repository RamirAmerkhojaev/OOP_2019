package Task1;

public abstract class Transport {
	
	public double distance, engineVolume;
	
	public Transport()
	{
	     distance = engineVolume = 0;
	}
	
	public abstract void Motion();
	public abstract double FuelConsumption();
	
	public String getReport() 
	{
	    String chooseTransport = this.getClass().toString();
	    return chooseTransport+" consumes"+FuelConsumption()+" l per 100 km";
	}
	
}
