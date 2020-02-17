package Problem4;

public class King extends Piece{

	public King() {
		super();
	}
	
	public King(Position position) {
		super(position);
	}
	
	public boolean isMoveVal(Position position) {
		
		int dx = position.getDx(this.position);
		int dy = position.getDy(this.position);
		if(Math.abs(dx) <= 1 && Math.abs(dy) <= 1) {
			return true;
		}
		return false;
	}
	
}
