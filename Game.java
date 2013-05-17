public class Game {
	
	private Team white;
	private Team black;

	public Game() {
		white = new Team("white");
		black = new Team("black");
		white.initPieces();
		black.initPieces();
	}

	public Team[] getTeams(){
		Team[] t = {white, black};
		return t;
	}

}