package model;


public class TicTacToeModel implements Boardgame {
	

	private String message;
	private int moveCount;
	private int playerId;
	private char [][] board;
	
	//constructor 

	public TicTacToeModel() {
		this.board = new char[3][3];
		this.moveCount = 9;
		this.playerId = 1;
		this.message = "Player 1 start";
	
	}

	@Override
	public char getStatus(int i, int j) {
		return board[i][j];
	}

	@Override
	public String getMessage() {
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
	

	public void ticMove (int i, int j) {
		if (getMoveCount() > 0) {
			if(playerId == 1) 
				board[i][j] = 'X';
			else
				board[i][j] = 'O';
			setMoveCount(--moveCount);
			
			//check if board is full
			
			if (getMoveCount() == 3) {
				//kolla isWinner() 
				//TODO something flyttfasen move()
			}else {
				if (playerId%2 != 0) {
					setPlayerId(2);
					setMessage("Player 2: 'O'");
				}else {
					setPlayerId(1);
					setMessage("Player 1: 'X");
				
				}
			}
			
	}
		
	}
	@Override
	public void move(int i, int j) {
		
	}
	
	public void isWinner(int i, int j) {
		//TODO check if there is winner
	}


	
}
