package model;


public class TicTacToeModel implements Boardgame {
	

	private String message;
	private int moveCount;
	private int playerId;
	private char [][] board;
	
	//constructor 

	public TicTacToeModel() {
		this.board = new char[3][3];
		this.moveCount = 0;
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

	
	
	public char getBoard(int i, int j) {

		return board[i][j];
	}
	
	
	public void setBoard(char[][] board) {
		this.board = board;
	}
	
	public static String valueOf(char c) {
		String s = String.valueOf(c);
		return s;
	}
	
	public void makeEmpty(int i, int j) {
		board[i][j] ='\0';
	}
	

	public void ticMove (int i, int j) {
		if (getMoveCount() <= 5) {
			if(playerId == 1) 
				board[i][j] = 'X';
			else
				board[i][j] = 'O';
			
			//check if board is full
			if (playerId%2 != 0) {
				setPlayerId(2);
				setMessage("Player 2: 'O'");
			}else {
				setPlayerId(1);
				setMessage("Player 1: 'X'");
			}
		}
		if (getMoveCount() >= 6) {
			//setMessage(valueOf(getBoard(i,j)));
			if (!move(i, j)) {
				setMessage("Invalid move");
				setMoveCount(++moveCount);
			}else {
				makeEmpty(i,j);
				setMessage("Place new");
			}
		}
		setMoveCount(++moveCount);
	}
		
		
//			}else {
//				board[i][j] = ' ';
//				setMoveCount(++moveCount);
//				ticMove(i,j);
//				setMessage("Move to empty square");
//			}
//	
//			if (playerId%2 != 0) {
//				setPlayerId(2);
//				setMessage("Player 2: 'O'");
//			}else {
//				setPlayerId(1);
//				setMessage("Player 1: 'X");
//			
//			}
		
		
	
	@Override
	public boolean move(int i, int j) {
		//TODO gives true if move is ok
		if (board[i][j] == '\0') {
			return false;
		}
		if (board[i][j] == 'X' && playerId == 1) {
			return true;
		}
		if (board[i][j] == '0' && playerId == 2) {
			return true;
		}
		return false;
	}
	
	
	public void newMove(int x, int y) {
		if(playerId == 1) 
			board[x][y] = 'X';
		else
			board[x][y] = 'O';
	}
	


	
}

