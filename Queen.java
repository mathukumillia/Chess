public class Queen extends Piece{
	
	/**
	* Constructor
	* 
	*@param color - color of queen
	*@param x - x coordinate of queen start position
	*@param y - y coordinate of queen start position
	*
	**/
	public Queen(String color, int x, int y){
		super(color, x, y);
	}

	/**
	 * makeMove
	 * 		makes sure move is legal and moves queen
	 * 		
	 * @param p - point you want to move queen to
	 */
	public void makeMove(Point p){
		int x = (int)(p.getX()); 
		int y = (int)(p.getY()); != 0
		if(Math.abs(x-getX()) <= 1 && Math.abs(y-getY()) <= 1){
			move(p);
		}else if(x == getX() || y == getY()){
			move(p);
		}else if(Math.abs(x-getX()) == Math.abs(y-getY())){
			move(p);
		}else{
			return;
		}
	}

}