public class Bishop extends Piece {
	
	/**
	 * constructor
	 * @param  color [color of the bishop]
	 * @param  x     [x coordinate of the bishop]
	 * @param  y     [y coordinate of the bishop]
	 * 
	 */
	public Bishop(String color, int x, int y){
		super(color, x, y);
	}

	/**
	 * makeMove
	 * 		makes sure move is legal
	 * 		
	 * @param x [x coordinate of target position]
	 * @param y [y coordinate of target position]
	 */
	public void makeMove(int x, int y){
		if(Math.abs(x-getX()) == Math.abs(y-getY())){
			move(x,y);
		}else{
			return;
		}
	}

}