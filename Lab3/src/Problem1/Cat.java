package Problem1;

public class Cat extends Animal{

	public Cat() {
		super();
	}
	
	public Cat(int paws) {
		super(paws);
	}
	
	@Override
	public void getVoice() {
		System.out.println("Meooww!");
	}
	@Override
	public void getVoice(int n) {
	    for(int i=0; i<n; i++) {
	    	System.out.println("Meooww!");
	    }
    }
	
	public void setFeet(int paws) {
		this.paws = paws;
	}
	public String toString() {
		String str = "";
		return str+paws;
	}
	
}
