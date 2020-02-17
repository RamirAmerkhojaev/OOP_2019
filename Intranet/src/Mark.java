
public class Mark {

	private double firstAttestation = 0;
	private double secondAttestation = 0;
	private double finalMark = 0;
	
	public Mark(double firstAttestation, double secondAttestation, double finalMark) {
		this.firstAttestation = firstAttestation;
		this.secondAttestation = secondAttestation;
		this.finalMark = finalMark;
	}
	
	public double getFirstAttestation() {
		return firstAttestation;
	}
	
	public void setFirstAttestation(double firstAttestation) {
		this.firstAttestation = firstAttestation;
	}
	
	public double getSecondAttestation() {
		return secondAttestation;
	}
	
	public void setSecondAttestation(double secondAttestation) {
		this.secondAttestation = secondAttestation;
	}
	
	public double getFinalMark() {
		return finalMark;
	}
	
	public void setFinalMark(double finalMark) {
		this.finalMark = finalMark;
	}
    
	public double getFullAttestation() {
		return getFirstAttestation()+getSecondAttestation()+getFinalMark();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(finalMark);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(firstAttestation);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(secondAttestation);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mark other = (Mark) obj;
		if (Double.doubleToLongBits(finalMark) != Double.doubleToLongBits(other.finalMark))
			return false;
		if (Double.doubleToLongBits(firstAttestation) != Double.doubleToLongBits(other.firstAttestation))
			return false;
		if (Double.doubleToLongBits(secondAttestation) != Double.doubleToLongBits(other.secondAttestation))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Mark [firstAttestation=" + firstAttestation + ", secondAttestation=" + secondAttestation
				+ ", finalMark=" + finalMark + "]";
	}
	
}
