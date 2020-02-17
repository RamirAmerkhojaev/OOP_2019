package Task1;

public class Parallel extends Circuit {

	private Circuit r1;
	private Circuit r2;
	
	public Parallel() {};
	
	public Parallel(Circuit r1) {
		this.r1 = r1;
	}
    public Parallel(Circuit r1, Circuit r2) {
    	this(r1);
    	this.r2 = r2;
    }
    public double getResistance() {
    	return (r1.getResistance()*r2.getResistance()) / (r1.getResistance() + r2.getResistance());
    }
	public double getPotentialDiff() {
		return r1.getPotentialDiff();
	}
	public void applyPotentialDiff(double potentialDiff) {
		r1.applyPotentialDiff(potentialDiff);
		r2.applyPotentialDiff(potentialDiff);
	}
    
}
