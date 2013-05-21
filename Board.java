import java.awt.*;
import javax.swing.*;
import java.awt.GridLayout;

public class Board extends JPanel{

	private Game ga;
	private Team[] teams;
	private Piece[] pieces;
	private PiecePanel[] panels;

	public Board(){
		super(new GridLayout(8,8));
		ga = new Game();
		teams = ga.getTeams();
		this.setVisible(true);
		for(Team t : teams){
			pieces = t.getPieces();
			panels = new PiecePanel[pieces.length];
			for(int i = 0; i<pieces.length; i++){
				panels[i] = new PiecePanel(pieces[i]);
				this.add(panels[i]);
			}
		}
	}

	public void paint(Graphics g){
		super.paint(g);
	}

}