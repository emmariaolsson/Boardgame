import javax.swing.*;

import java.awt.event.ActionListener;

class ViewControl extends JFrame implements ActionListener {
    //private Boardgame game;
    private int size;
    private Square[][] board;  //Square is a subclass to JButton
    private JLabel mess = new JLabel();  //Message display

    //ViewControl(Boardgame gm, int n) {

    }
}

class Square extends JButton {
    Square(int i, int j) {

        System.out.println("Tryck på knapp " + i + " " + j);
    }
}