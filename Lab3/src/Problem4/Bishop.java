package Problem4;

public class Bishop extends Piece{

	public Bishop() {
		super();
	}
	
	public Bishop(Position position) {
		super(position);
	}
	
	public boolean isMoveVal(Position position) {
		
		int dx = position.getDx(this.position);
		int dy = position.getDy(this.position);
        if(dx != 0 && dy != 0 && Math.abs(dx) == Math.abs(dy)) {
        	return true;
        }
		return false;
    }
	
}
