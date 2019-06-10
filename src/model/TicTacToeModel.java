package model;


public class TicTacToeModel implements Boardgame {
	

	private String message;
	private int moveCount;
	private int playerId;
	private char [][] board;
	private String playerSymbol;

	
	//constructor 

	public TicTacToeModel() {
		this.board = new char[3][3];
		this.moveCount = 0;
		this.playerId = 1;
		this.message = "Player 1 start";
		this.playerSymbol = "X";
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
	
	public void setplayerSymbol(String playerSymbol) {
		this.playerSymbol = playerSymbol;
	}
	
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
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
			if (board[i][j] == '\0') {
				if(playerId == 1) 
					board[i][j] = 'X';
				else if(playerId == 2)
					board[i][j] = 'O';
				
				//check if board is full
				if (playerId%2 != 0) {
					setPlayerId(2);
					setplayerSymbol("O");
					setMessage("Player 2: 'O'");
				}else {
					setPlayerId(1);
					setplayerSymbol("X");
					setMessage("Player 1: 'X'");
				}
			}else {
				setMessage("Invalid Move");
				setMoveCount(--moveCount);
			}
		}
		if (getMoveCount() >= 6) {
			//setMessage(valueOf(getBoard(i,j)));
			if (!move(i, j)) {
				setMessage("Invalid Move");
				setMoveCount(--moveCount);
				
			}else {
				makeEmpty(i,j);
				setMessage("Place new");
				setMoveCount(moveCount-2);
			}
		
		}
		setMoveCount(++moveCount);
		System.out.println(moveCount);	
		System.out.println(playerId);
	}
				
	
	@Override
	public boolean move(int i, int j) {
		//TODO gives true if move is ok
		if (board[i][j] == '\0') {
			return false;
		}
		else if (board[i][j] == 'O' && playerId == 2) {
			return true;
		}
		else if (board[i][j] == 'X' && playerId == 1) {
			return true;
		}
		return false;
	}
		
}

