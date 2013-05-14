import java.awt.Point;

public class Rook extends Piece{
	
	/**
	 * Constructor
	 *
	 * @param  p - initial starting position of rook
	 * 
	 */
	public Rook(Point p, boolean isWhite){
		super(p, isWhite);
	}

	/**
	 * makeMove
	 * 		makes sure move is legal and moves rook
	 * 		
	 * @param p - point you want to move rook to
	 */
	public void makeMove(Point p){
		int x = (int)(p.getX()); 
		int y = (int)(p.getY());
		if(x == getX() || y == getY()){
			move(p);
		}else{
			return;
		}
	}

}