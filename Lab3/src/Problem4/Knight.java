package Problem4;

public class Knight extends Piece{

	public Knight() {
		super();
	}
	
	public Knight(Position position) {
		super(position);
	}
	
	public boolean isMoveVal(Position position) {
		
		int dx = position.getDx(this.position);
		int dy = position.getDy(this.position);
	    if((dx == 1 && dy == 2) || (dx == 2 && dy == 1)) {
	    	return true;
	    }
	  return false;
	}
	
}
