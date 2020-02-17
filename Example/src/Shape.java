enum Color{
	
	RED,
	BLACK,
	
}

public abstract class Shape
{
	
    private static int cnt = 0;
    int id = 0;
	Color color;
	private int x;
	
	public Shape(Color color) {
		this.color = color;
	}
	
	public void getCnt() {
		cnt++;
	}
	
    abstract void Draw(int d);
    abstract void Draw();

	void setPosition(int x) {
		this.x = x;	
	}
    
    
		
}
