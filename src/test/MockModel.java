package test;
import model.*;

public class MockModel implements Boardgame {
	
	private String message;
	private char [][] board;
	private String playerSymbol;
	


	@Override
	public boolean move(int i, int j) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public char getStatus(int i, int j) {
		// TODO Auto-generated method stub
		return board[i][j];
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return message;
	}
	
	
	
	
	public MockModel() {
		this.board = new char[3][3];
		this.message = "Player 1 start";
		this.playerSymbol = "X";
	}

}
