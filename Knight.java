import java.awt.Point;

public class Knight extends Piece {
	
	/**
	* Constructor
	* 
	*@param p - initial starting position of Knight
	*
	**/
	public Knight(Point p, boolean isWhite){
		super(p, isWhite);
	}

	/**
	 * makeMove
	 * 		makes sure move is legal and moves knight
	 * 		
	 * @param p - point you want to move knight to
	 */
	public void makeMove(Point p){
		int x = (int)(p.getX()); 
		int y = (int)(p.getY());
		if(Math.abs(x-getX()) == 1 && Math.abs(y-getY()) == 2){
			move(p);
		}else if(Math.abs(y-getY()) == 1 && Math.abs(x-getX()) == 2){
			move(p);
		}else{
			return;
		}
	}

}