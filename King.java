public class King extends Piece{
	
	/**
	* Constructor
	* 
	*@param p - initial starting position of king
	*
	**/
	public King(Point p){
		super(p);
	}

	/**
	 * makeMove
	 * 		makes sure move is legal and moves king
	 * 		
	 * @param p - point you want to move king to
	 */
	public void makeMove(Point p){
		int x = (int)(p.getX()); 
		int y = (int)(p.getY());
		if(Math.abs(x-getX()) <= 1 && Math.abs(y-getY()) <= 1){
			move(p);
		}else{
			return;
		}
	}

}