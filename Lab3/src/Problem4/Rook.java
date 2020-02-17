package Problem4;

public class Rook extends Piece {

	public Rook () {
		super();
	}
	
	public Rook(Position position) {
		super(position);
	}
	
	public boolean isMoveVal(Position position) {
		
		int dx = position.getDx(this.position);
		int dy = position.getDy(this.position);
		if((dx == 0 && dy != 0) || dx !=0 && dy == 0) {
			return true;
		}
		return false;
	}
	
}
