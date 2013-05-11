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

	public void setColor(String color){
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
		for(int i = 0; i<8; i++){
			pieces[i] = new Pawn(new Point(i,1));
		}
		pieces[8] = new Rook(new Point(0,0));
		pieces[9] = new Rook(new Point(7,0));
		pieces[10] = new Knight(new Point(1,0));
		pieces[11] = new Knight(new Point(6,0));
		pieces[12] = new Bishop(new Point(2,0));
		pieces[13] = new Bishop(new Point(5,0));
		pieces[14] = new Queen(new Point(3,0));   // MAKE SURE POINT IS RIGHT
		pieces[15] = new King(new Point(4,0));
	}

	private void black(){
		for(int i = 0; i<8; i++){
			pieces[i] = new Pawn(new Point(i,7));
		}
		pieces[8] = new Rook(new Point(0,6));
		pieces[9] = new Rook(new Point(7,6));
		pieces[10] = new Knight(new Point(1,6));
		pieces[11] = new Knight(new Point(6,6));
		pieces[12] = new Bishop(new Point(2,6));
		pieces[13] = new Bishop(new Point(5,6));
		pieces[14] = new Queen(new Point(3,6));   // MAKE SURE POINT IS RIGHT
		pieces[15] = new King(new Point(4,6));
	}

}

