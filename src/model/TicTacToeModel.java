package model;


public class TicTacToeModel implements Boardgame {
	

	private String message;
	private int moveCount;
	private int playerId;
	private char [][] board;
	
	//constructor 

	public TicTacToeModel() {
		this.board = new char[3][3];
		this.moveCount = 0; //Changed so it counts up ++moveCount, since we will make an endless game where moveCount should be reset when it reaches 6 symbols on the board.
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
	
	
	private void setMessage(String message) {
		this.message = message;
	}
	
	private int getMoveCount() {
		return moveCount;
	}
	
	private void setMoveCount(int moveCount) {
		this.moveCount = moveCount;
	}
	
	public int getPlayerId() {
		return playerId;
	}
	
	private void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	
	/*
	public char[][] getBoard() {

		return board;
	}
	*/
	
	public void setBoard(char[][] board) {
		this.board = board;
	}
	

	public void ticMove (int i, int j) {
		if (getMoveCount() < 7) {
			if(playerId == 1) 
				board[i][j] = 'X';
			else
				board[i][j] = 'O';
			setMoveCount(++moveCount);
			
			//check if board is full
			if (playerId%2 != 0) {
				setPlayerId(2);
				setMessage("Player 2: 'O'");
			}else {
				setPlayerId(1);
				setMessage("Player 1: 'X'");
			}
		}
		if (getMoveCount() == 7) {
			if (!move(i, j)) {
				setMessage("Invalid Move");
			}else {
				board[i][j] = ' ';
				setMoveCount(++moveCount);
				ticMove(i,j);
				setMessage("Move to empty square");
			}
			
			if (playerId%2 != 0) {
				setPlayerId(2);
				setMessage("Player 2: 'O'");
			}else {
				setPlayerId(1);
				setMessage("Player 1: 'X");
			
			}
		}
		
	}
	@Override
	public boolean move(int i, int j) {
		//TODO gives true if move is ok
		if (board[i][j] == '\0') {
			return false;
		}
		return true;
	}
	
	
	public void newMove(int x, int y) {
		if(playerId == 1) 
			board[x][y] = 'X';
		else
			board[x][y] = 'O';
	}
	


	
}

