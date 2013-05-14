import java.awt.Point;

public class Pawn extends Piece{
	
	/**
	 * Constructor
	 *
	 * @param p - initial starting point of pawn
	 * 
	 */
	public Pawn(Point p, boolean isWhite){
		super(p, isWhite);
	}

	/**
	 * makeMove
	 * 		makes sure move is legal and moves pawn
	 * 		
	 * @param p - point you want to move pawn to
	 */
	public void makeMove(Point p){
		int x = (int)(p.getX()); 
		int y = (int)(p.getY());
		if(x == getX()){
			if(isWhite()){
				if(y-getY() == 1){
					move(p);
				}
			}else{
				if(y-getY() == -1){
					move(p);
				}
			}
		}else{
			return;
		}
	}

}