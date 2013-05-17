import java.awt.Point;
import java.awt.Dimension;
import java.awt.Graphics;

public class Team {
	
	private Piece[] pieces = new Piece[16];
	private String color;

	private Graphics g;

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
		for(Piece p : pieces){
			p.draw(g, new Dimension(400,500));
		}
	}

	private void white(){
		for(int i = 0; i<8; i++){
			pieces[i] = new Pawn(new Point(i,1), true);
		}
		pieces[8] = new Rook(new Point(0,0), true);
		pieces[9] = new Rook(new Point(7,0), true);
		pieces[10] = new Knight(new Point(1,0), true);
		pieces[11] = new Knight(new Point(6,0), true);
		pieces[12] = new Bishop(new Point(2,0), true);
		pieces[13] = new Bishop(new Point(5,0), true);
		pieces[14] = new Queen(new Point(3,0), true);   // MAKE SURE POINT IS RIGHT
		pieces[15] = new King(new Point(4,0), true);
	}

	private void black(){
		for(int i = 0; i<8; i++){
			pieces[i] = new Pawn(new Point(i,7), false);
		}
		pieces[8] = new Rook(new Point(0,6), false);
		pieces[9] = new Rook(new Point(7,6), false);
		pieces[10] = new Knight(new Point(1,6), false);
		pieces[11] = new Knight(new Point(6,6), false);
		pieces[12] = new Bishop(new Point(2,6), false);
		pieces[13] = new Bishop(new Point(5,6), false);
		pieces[14] = new Queen(new Point(3,6), false);   // MAKE SURE POINT IS RIGHT
		pieces[15] = new King(new Point(4,6), false);
	}

}

