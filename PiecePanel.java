import javax.swing.*;
import java.awt.*;

public class PiecePanel extends JPanel {
	
	private Piece p;
	private Color c;

	public PiecePanel(Piece p, Color c){
		super(new GridLayout(1,1));
		this.p = p;
		this.c = c;
		this.setVisible(true);
	}

	public PiecePanel(Piece p){
		super(new GridLayout(1,1));
		this.p = p;
		this.setVisible(true);
	}

	public void paint(Graphics g){
		g.setColor(c);
		g.fillRect(0, 0, 100, 100);
		if(p != null) p.draw(g, new Dimension(100,100));
		
	}

}