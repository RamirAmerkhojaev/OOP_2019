import java.util.*;

public class Test {
	
	public static void main(String[] args) 
	{
		
		Vector<Shape>shapes = new Vector<Shape>();
		
		Square s = new Square(Color.RED);
		Triangular t = new Triangular(Color.BLACK);
		Circle c = new Circle(Color.RED);
		Rectangular r = new Rectangular(Color.BLACK); 
		
		s.setPosition(11);
		t.setPosition(4);
		c.setPosition(5);
		r.setPosition(15);
		
		shapes.add(s);
		shapes.add(t);
		shapes.add(c);
		shapes.add(r);
			
       	for(Shape shape: shapes) {
       		shape.Draw();
       	}
		
	}

}
