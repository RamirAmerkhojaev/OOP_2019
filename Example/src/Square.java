
public class Square extends Shape {
	
	public Square(Color c) {
		super(c);
	}
	
	{
		id++;
	}
	
	@Override
	void Draw(int d) 
	{	
		if(color == Color.RED) {
			System.err.println("[]");
		}else {
			System.out.println("[]");
		}
	}

	@Override
	void Draw() {
		if(color == Color.RED) {
			System.err.println("[]");
		}else {
			System.out.println("[]");
		}
	}


}
