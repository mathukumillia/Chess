public class Team {
	
	private Piece[] pieceLocations = new Piece[16];

	public Team(String color) {
		setColor(color);
	}




	/**
	 * Getters and Setters
	 */
	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}





}

