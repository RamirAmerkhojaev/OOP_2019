package Problem4;

public class Queen extends Piece {

	public Queen() {
		super();
	}
	
	public Queen(Position position) {
		super(position);
	}
	
	public boolean isMoveVal(Position position) {
		
		int dx = position.getDx(this.position);
		int dy = position.getDy(this.position);
	    if(dy!= 0 && dx != 0 && Math.abs(dx) == Math.abs(dy)) {
	    	return true;
	    }
	    if((dx == 0 && dy != 0) || (dy == 0 && dx != 0)) {
			return true;
	    }
	    return false;
	}
	
}
