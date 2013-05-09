public class Rook extends Piece{
	
	/**
	 * constructor
	 * @param  color [color of the rook]
	 * @param  x     [x coordinate of the rook]
	 * @param  y     [y coordinate of the rook]
	 * 
	 */
	public Rook(String color, int x, int y){
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
		if(x == getX() || y == getY()){
			move(x,y);
		}else{
			return;
		}
	}

}