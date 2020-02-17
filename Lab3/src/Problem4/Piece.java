package Problem4;

public abstract class Piece {

	public Position position;
	
	public Piece() {
		position = new Position();
	}
	public Piece(Position position) {
		this.position = position;
	}
	public Position getPosition() {
		return position;
	}
	public int getVertic() {
		return position.getVer();
	}
	public int getHor() {
		return position.getHor();
	}
	
	public abstract boolean isMoveVal(Position position);
	
	public boolean move(Position position) {
		
		if(isMoveVal(position)) {
			return true;
		}
		return false;
	}
	
}
