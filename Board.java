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
		//squares = new int[8][8];
		teams = ga.getTeams();
		this.setVisible(true);
		int count = 0;
		for(Team t : teams){
			pieces = t.getPieces();
			panels = new PiecePanel[pieces.length];
			for(int i = 0; i<pieces.length; i++){
				count++;
				if(count <= 8) {
					if(i % 2 == 0) {
						panels[i] = new PiecePanel(pieces[i], Color.BLUE);
					}
					else {
						panels[i] = new PiecePanel(pieces[i], Color.RED);
					}
				}else{
					if(i % 2 == 1) {
						panels[i] = new PiecePanel(pieces[i], Color.BLUE);
					}
					else {
						panels[i] = new PiecePanel(pieces[i], Color.RED);
					}
				}
				if(count == 16) {
					count = 0;
				}
				this.add(panels[i]);
			}
			if(t.getColor() == "white") {
				count = 0;
				for(int i = 0; i < 32; i++) {
					count++;
					if(count <= 8){
						if(i % 2 == 0) {
							this.add(new PiecePanel(null, Color.BLUE));
						}else{
							this.add(new PiecePanel(null, Color.RED));
						}
					}else{
						if(i % 2 == 1) {
							this.add(new PiecePanel(null, Color.BLUE));
						}else{
							this.add(new PiecePanel(null, Color.RED));
						}
					}
					if(count == 16) {
						count = 0;
					}
				}
			}
		}
	}

	public void paint(Graphics g){
		super.paint(g);
		// Color c = new Color(108,5,5);
		// Color d = new Color(128,128,128);
		// for(int i = 0; i<squares.length; i++){
		// 	if(i%2 == 0){
		// 		color = true;
		// 	}else{
		// 		color = false;
		// 	}
		// 	for(int j = 0; j<squares[i].length; j++){
		// 		if(color){
		// 			g.setColor(d);
		// 			g.fillRect(100*i, 100*j, 100, 100);
		// 			color = false;

		// 		}else{
		// 			g.setColor(c);
		// 			g.fillRect(100*i, 100*j, 100, 100);
		// 			color = true;
		// 		}
		// 	}
		// }
	}

}