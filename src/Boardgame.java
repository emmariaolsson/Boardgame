
public interface Boardgame {
	public boolean move(int i, int j);          //gives true if move went okay otherwise false
	public String getStatus(int i, int j);      //returns the contents of square (i,j)
	public String getMessage();                 //return OK or error message
}


class TicTacToeModel implements Boardgame {
	

	private String message;
	private int moveCount;
	private int playerId;
	private char [][] board;
	
	public TicTacToeModel() {
		this.board = new char[3][3];
		this.moveCount = 9;
		this.playerId = 1;
		
	}

	@Override
	public boolean move(int i, int j) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getStatus(int i, int j) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return message;
	}
	
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public int getMoveCount() {
		return moveCount;
	}
	
	public void setMoveCount(int moveCount) {
		this.moveCount = moveCount;
	}
	
	public int getPlayerId() {
		return playerId;
	}
	
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	
	public char[][] getBoard() {
		return board;
	}
	
	public void setBoard(char[][] board) {
		this.board = board;
	}


	
}

