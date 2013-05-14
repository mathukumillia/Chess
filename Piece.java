import java.awt.Point;
import java.awt.image.BufferedImage;

public abstract class Piece{
	
	private Point location;

	private BufferedImage image;
	private boolean isWhite;

	/**
	* Constructor
	*
	* @param p - starting point of piece
	*
	**/
	public Piece(Point p, boolean isWhite){
		this.location = p;
		this.isWhite = isWhite;
		image = ChessApplet.getImage(this);
	}

	/**
	 * draw
	 * 		paint the piece to the screen, must be called from the paint
	 * 		method of a Graphic object
	 * @param g   - the drawing context
	 * @param dim - dimensions of the containing Square
	 */
	public void draw(Graphics g, Dimension dim) {
		g.drawImage(image, 0, 0, (int)dim.getWidth(), (int)dim.getHeight(), null);
	}

	public boolean isWhite() {
		return isWhite;
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
		if(! (p.equals(location))){					//checks to make sure location passed in is not current location
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