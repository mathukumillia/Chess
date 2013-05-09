import java.awt.Point;

public abstract class Piece{
	
	private Point location;
	private String color;

	public Piece(String color, int x, int y){
		this.location = new Point(x,y);
		this.color = color;
	}

	/**
	 * move
	 * 		moves the piece to the specified location
	 */
	public void move(int x, int y){
		location.setLocation(x,y);
	}

	/**
	 * getters and setters
	 */
	public Point getLoc(){
		return location;
	}

	public void setColor(String c){
		color = c;
	}

	public String getColor(){
		return color;
	}

}