import java.awt.Point;

public abstract class Piece{
	
	private Point location;
	private String color;

	public Piece(String color, int x, int y){
		if(!(color.equals("white") || color.equals("black"))){
			color = "white";
		}
		this.location = new Point(x,y);
		this.color = color;
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
		if(! p.equals(location)){
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

	public void setColor(String c){
		color = c;
	}

	public String getColor(){
		return color;
	}

}