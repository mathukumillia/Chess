public class Team {
	
	private Piece[] pieces = new Piece[16];
	private String color;

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

	public void initPieces(){
		if(color.equals("white")){
			white();
		}else{
			black();
		}
	}

	private void white(){
		
	}


}

