import java.awt.*;
import javax.swing.*;
import java.awt.GridLayout;

public class Board extends JPanel{

	private Game ga;
	private Dimension d;

	public Board(){
		super(new GridLayout(8,8));
		ga = new Game();
		d = new Dimension(50,50);
	}

	public void paint(Graphics g){
		Team[] teams = ga.getTeams();
		Piece[] pieces;
		for(Team t : teams){
			pieces = t.getPieces();
			pieces[0].draw(g, d);
			Tile tile = new Tile(pieces[0]);
			this.addLayoutComponent("First Square", tile);
		}
	}

}