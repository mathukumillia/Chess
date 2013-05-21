import javax.swing.*;
import java.awt.*;

public class PiecePanel extends JPanel {
	
	private Piece p;

	public PiecePanel(Piece p){
		super(new GridLayout(1,1));
		this.p = p;
		this.setVisible(true);
	}

	public void paint(Graphics g){
		p.draw(g, new Dimension(50,50));
	}

}