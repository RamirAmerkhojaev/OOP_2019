package Task1;

public interface Flyable extends Moveable{

	int HeightOnAir = 10000 + Moveable.HeightOnGround;
	void flying();
	
}
