public class Rook extends Piece{
	
	public Rook(String color, int x, int y){
		setColor(color);
		getLoc() = new Point(x,y);
	}

	public void makeMove(int x, int y){
		if(x == (int)(getLoc().getX()) || y == (int)(getLoc().getY()) ){
			move(x,y);
		}else{
			return;
		}
	}

}