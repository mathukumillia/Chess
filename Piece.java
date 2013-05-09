public abstract class Piece{
	
	private Point location;
	private String color;

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