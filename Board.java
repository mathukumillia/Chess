import java.awt.*;
import javax.swing.*;

public class Board extends JPanel{

	private Game ga;

	public Board(){
		ga = new Game();
	}

	public void paint(Graphics g){
		Team[] teams = ga.getTeams();
		for(Team t : teams){
			for(Piece p : t.getPieces()){
				p.draw(g,new Dimension(300,400));
			}
		}
	}

}