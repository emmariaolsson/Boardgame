package model;

public interface Boardgame {
	boolean move(int i, int j);          //gives true if move went okay otherwise false
	char getStatus(int i, int j);        //returns the contents of square (i,j)?? states whose turn??
	String getMessage();                 //returns whose turn it is
}
