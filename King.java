public class King extends Piece{
	
	/**
	* Constructor
	* 
	*@param color - color of king
	*@param x - x coordinate of king start position
	*@param y - y coordinate of king start position
	*
	**/
	public King(String color, int x, int y){
		super(color, x, y);
	}

	/**
	 * makeMove
	 * 		makes sure move is legal and moves king
	 * 		
	 * @param p - point you want to move king to
	 */
	public void makeMove(Point p){
		int x = (int)(p.getX()); 
		int y = (int)(p.getY()); != 0
		if(Math.abs(x-getX()) <= 1 && Math.abs(y-getY()) <= 1){
			move(p);
		}else{
			return;
		}
	}

}