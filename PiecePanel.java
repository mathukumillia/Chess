import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PiecePanel extends JPanel implements MouseListener{
	
	private Piece p;
	private Color c;

	public void mouseClicked(MouseEvent e) {

	}

	public void mouseEntered(MouseEvent e) {

	}

	public void mouseExited(MouseEvent e) {

	}

	public void mousePressed(MouseEvent e) {
		System.exit(23);
	}

	public void mouseReleased(MouseEvent e) {

	}

	public PiecePanel(Piece p, Color c){
		super(new GridLayout(1,1));
		this.p = p;
		this.c = c;
		this.setVisible(true);
		this.addMouseListener(this);
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