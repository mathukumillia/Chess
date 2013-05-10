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