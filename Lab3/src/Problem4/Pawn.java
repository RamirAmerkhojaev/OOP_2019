package Problem4;

public class Pawn extends Piece {

	public boolean movemade;
	
	public Pawn() {
		super();
	}
	
	public Pawn(Position position) {
		super(position);
	}
	
	public boolean isMoveVal(Position position) {
		
		int dx = position.getDx(this.position);
		if(dx != 0 ) {
			return false;
		}
		
		int dy = position.getDy(this.position);
	    if(dy > 0 && dy <= 2) 
	    {
	    	return true;
	    }
        if(dy == 1) {
        	return true;
        }
        return false;
	}
	
}
