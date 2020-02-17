
public class Circle extends Shape{

	public Circle(Color c) {
		super(c);
	}
	
	{
		id++;
	}
	
	@Override
	public void Draw(int d) 
	{
		if(color == Color.RED) {
			System.err.println("()");
		}else {
			System.out.println("()");
		}
	}


	@Override
	void Draw() {
		if(color == Color.RED) {
			System.err.println("()");
		}else {
			System.out.println("()");
		}
	}
	
}
