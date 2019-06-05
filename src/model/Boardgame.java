package model;

public interface Boardgame {
	public void move(int i, int j);             //gives true if move went okay otherwise false
	public char getStatus(int i, int j);        //returns the contents of square (i,j)?? states whose turn??
	public String getMessage();                 //returns whose turn it is
}
