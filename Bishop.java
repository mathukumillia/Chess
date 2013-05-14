import java.awt.Point;

public class Bishop extends Piece {
	
	/**
	 * Constructor
	 *
	 * @param p - initial starting point of bishop
	 * 
	 */
	public Bishop(Point p, boolean isWhite){
		super(p, isWhite);
	}

	/**
	 * makeMove
	 * 		makes sure move is legal and moves bishop
	 * 		
	 * @param p - point you want to move bishop to
	 */
	public void makeMove(Point p){
		int x = (int)(p.getX()); 
		int y = (int)(p.getY());
		if(Math.abs(x-getX()) == Math.abs(y-getY())){
			move(p);
		}else{
			return;
		}
	}

}