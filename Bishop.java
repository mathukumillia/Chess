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