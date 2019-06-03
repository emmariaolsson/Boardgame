import javax.swing.*;
import javax.swing.ImageIcon;
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
    ImageIcon X, O;
    byte value = 0;
    /*
    0: default
    1: X
    2: O
     */

    Square(int i, int j) {
        X = new ImageIcon(this.getClass().getResource("X.png"));
        O = new ImageIcon(this.getClass().getResource("O.png"));
    }
}