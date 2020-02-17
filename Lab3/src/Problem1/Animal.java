package Problem1;

public abstract class Animal {

	public int paws;
	
	public Animal(){
		paws = 0;
	}

	public Animal(int paws) {
		this.paws = paws;
	}
	
	public int getFeet(int paws) {
		return paws;
	}
	public void setFeet(int paws) {
		this.paws = paws;
	}

	public abstract void getVoice();
	public abstract void getVoice(int n);
	
	
}
