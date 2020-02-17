package Task1;

public class Series extends Circuit{

	private Circuit r1;
	private Circuit r2;
	
	public Series() {};
	
	public Series(Circuit r1) {
		this.r1 = r1;
	}
	public Series(Circuit r1, Circuit r2) {
		this(r1);
		this.r2 = r2;
	}
	public double getResistance() {
		return r1.getResistance() + r2.getResistance();
	}
	public double getPotentialDiff() {
		return r1.getPotentialDiff() + r2.getPotentialDiff();
	}
	public void applyPotentialDiff(double potentialDiff) {
		
		double I = potentialDiff / getResistance();
		r1.applyPotentialDiff(I*getResistance());
		r2.applyPotentialDiff(I*getResistance());
	}
	
}
