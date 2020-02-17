package Task1;

public class Resistor extends Circuit{
	
	private double resistance;
	private double potenDiff;
	
	public Resistor(double resistance){
		this.resistance = resistance;
	}
	public Resistor(double resistance, double potenDiff) {
		this(resistance);
		this.potenDiff = potenDiff;
	}
	public double getResistance() {
		return resistance;
	}
	public void setResistance(double resistance) {
		this.resistance = resistance;
	}
    public double getPotentialDiff() {
    	return potenDiff;
    }
    public void applyPotentialDiff(double potenDiff) {
    	this.potenDiff = potenDiff;
    }
    
}
