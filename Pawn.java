public class Pawn extends Piece{
	
	/**
	 * constructor
	 * @param  color [color of the pawn]
	 * @param  x     [x coordinate of the pawn]
	 * @param  y     [y coordinate of the pawn]
	 * 
	 */
	public pawn(String color, int x, int y){
		super(color, x, y);
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