public class Piece{
	
	private Point location;

	/**
	 * move
	 * 		moves the piece to the specified location
	 */
	public void move(int x, int y){
		location.setLocation(x,y);
	}

	/**
	 * getter
	 */
	public Point getLoc(){
		return location;
	}

}