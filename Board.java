import java.awt.*;
import javax.swing.*;
import java.awt.GridLayout;

public class Board extends JPanel{

	private Game ga;
	private Team[] teams;
	private Piece[] pieces;
	private PiecePanel[] panels;
	private int[][] squares;
	private Boolean color;

	public Board(){
		super(new GridLayout(0,8));
		ga = new Game();
		squares = new int[8][8];
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
		Color c = new Color(108,5,5);
		Color d = new Color(128,128,128);
		for(int i = 0; i<squares.length; i++){
			if(i%2 == 0){
				color = true;
			}else{
				color = false;
			}
			for(int j = 0; j<squares[i].length; j++){
				if(color){
					g.setColor(d);
					g.fillRect(100*i, 100*j, 100, 100);
					color = false;

				}else{
					g.setColor(c);
					g.fillRect(100*i, 100*j, 100, 100);
					color = true;
				}
			}
		}
	}

}