package Problem4;

public class Position {

	public int horizont;
	public int vertic;
	
	public Position() {
		horizont = vertic = 0;
	}
	public Position(int vertic) {
		this.vertic = vertic;
	}
	public Position(int horizont, int vertic) {
		this(vertic);
		this.horizont = horizont;
	}
	public boolean isPosVal(int a) {
		if(a>7 || a<0) {
			return false;
		}
		return true;
	}
	
	public int getHor() {
		return horizont;
	}
	public int getVer() {
		return vertic;
	}
	
	public boolean setHor(int horizont){
		if(isPosVal(horizont)) 
		{
		     this.horizont = horizont;
		     return true;
		}
		return false;
	}
	public boolean setVert(int vertic) 
	{
		if(isPosVal(vertic)) 
		{
			this.vertic = vertic;
			return true;
		}
		return false;
	}
	public int getDx(Position p)
	{
		return horizont - p.horizont;
	}
	
	public int getDy(Position p)
	{
		return vertic - p.vertic;
	}
	
}
