package Problem1;

public class Pig extends Animal{

	public Pig() {
		super();
		paws = 0;
	}
	
	public Pig(int paws) {
		super(paws);
	}
	
	@Override
	public void getVoice() {
		System.out.println("Hru-Hru!");
	}
	//overloading
	public void getVoice(int n) {
	    for(int i=0; i<n; i++) {
	    	System.out.println("Hru-Hru!");
	    }
    }
	
	public void setFeet(int paws) {
		this.paws = paws;
	}
	public String toString() {
		
		return "Pigs don't have paws!";
		
	}
	
}
