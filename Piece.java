import java.awt.Point;

public abstract class Piece{
	
	private Point location;

	/**
	* Constructor
	*
	* @param p - starting point of piece
	*
	**/
	public Piece(Point p){
		this.location = p;
	}

	/**
	 * move
	 * 		moves the piece to the specified location
	 *
	 *@param x - x coordinate of target location
	 *@param y - y coordinate of target location
	 */
	public void move(int x, int y){
		move(new Point(x,y));
	}

	/**
	 * move
	 * 		moves the piece to the specified location
	 *
	 *@param p - target location in point format
	 */
	public void move(Point p){
		if(! (p.equals(location)){					//checks to make sure location passed in is not current location
			location.setLocation(p);
		}else{
			return;
		}
	}

	/**
	 * getters and setters
	 */
	public Point getLoc(){
		return location;
	}

	public int getX(){
		return (int)(location.getX());
	}

	public int getY(){
		return (int)(location.getY());
	}
}