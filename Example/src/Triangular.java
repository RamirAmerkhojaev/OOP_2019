
public class Triangular extends Shape{
	
	public Triangular(Color c) {
		super(c);
	}
	
	public boolean isIsosceles() {
        return true;		
	}
	
	{
		id++;
	}
	
	@Override
	public void Draw(int d) 
	{
		if(color == Color.RED) {
			System.err.println("^");
		}else {
			System.out.println("^");
		}
	}

	@Override
	void Draw() {
		if(color == Color.RED) {
			System.err.println("^");
		}else {
			System.out.println("^");
		}
	}

}
