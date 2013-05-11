public class Pawn extends Piece{
	
	/**
	 * Constructor
	 *
	 * @param p - initial starting point of pawn
	 * 
	 */
	public Pawn(Point p){
		super(p);
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
			if(getColor().equals("white")){
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