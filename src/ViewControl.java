import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

class ViewControl extends JFrame /*implements ActionListener */ {
    //private Boardgame game;
    //private int size; //Will be 3
    //private Square[][] board;  //Square is a subclass to JButton
    //private JLabel mess;  //Message display

    //ViewControl(Boardgame gm, int n) {

    ViewControl () {
        super("Emma's & Freddie's fantastic Tic Tac Toe");
        setTitle("Tic Tac Toe");
        setLayout(new FlowLayout());

        JLabel mess  = new JLabel("Player 1 turn"); //Will later depend on getMessage().
        mess.setToolTipText("This will be updated between turns."); //This text is visible when hovering.
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600, 800);
        setVisible(true);
        int size = 3;

        JButton[][] board = new JButton[size][size];
        JPanel p = new JPanel();
        p.setBounds(50, 50, 390, 390);
        p.setLayout(new GridLayout(size, size));
        getContentPane().add(p);
        p.setVisible(true);

        for (int r = 0; r < size; r++) {
            for (int c = 0; c < size; c++) {
                board[r][c] = new JButton();
                board[r][c].setBackground(new Color(188, 200, 188));
                board[r][c].addActionListener(this);
                board[r][c].setSize(130, 130);
                p.add(board[r][c]);
            }
        }
        add(mess);

    }


    public void actionPerformed(ActionEvent e) {
        getMessage(); //
        getStatus(); //empty, X or O


    }
}