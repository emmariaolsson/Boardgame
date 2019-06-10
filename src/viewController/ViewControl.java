package viewController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import model.*;
//import test.*;

public class ViewControl extends JFrame implements ActionListener {
    private TicTacToeModel model;
    private int size = 3;
    private JFrame view;
    private JButton[][] board; // All squares with buttons on board
    private JLabel message; // Message display

    private void setRequest(ArrayList<Integer> position) {
        model.ticMove(position.get(0), position.get(1));
        updateBoard(position.get(0), position.get(1), model.getStatus(position.get(0), position.get(1)));
    }

    public ViewControl(TicTacToeModel model) {
        this.model = model;
        view = new JFrame("Emma's & Freddie's fantastic Tic Tac Toe");
        this.setTitle("Tic Tac Toe");
        this.board = new JButton[size][size];
        this.message = new JLabel("Player 1 start"); // Will later depend on getMessage().
        message.setToolTipText("Will update upon next turn."); // This text is visible when hovering over the boardgame.
        initialize();
    }

    private void initialize() {
        view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        view.setSize(500, 500);

        // Below, the containers which will hold the are initialized.
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        JPanel game = new JPanel();
        game.setLayout(new GridLayout(size, size));
        game.setBackground(new Color(240, 190, 183));
        game.setVisible(true);
        panel.add(game, BorderLayout.CENTER); // Places the TicTacToe grid in the center of the frame.

        // Container for the textbox that will be updated upon new player's turn.
        JPanel turnMessage = new JPanel(new FlowLayout());
        turnMessage.setBackground(new Color(255, 255, 255)); // Can also write e.g. Color.white.

        // These panels are added to the view frame.
        view.add(panel, BorderLayout.NORTH);
        view.add(turnMessage, BorderLayout.SOUTH);

        turnMessage.add(message);
        message.setText("Player 1 start"); // Maybe should receive the message from model
        message.setFont(new Font("", Font.BOLD, 20));

        // Each cell in JButton[][] board is given individual buttons.
        for (int r = 0; r < size; r++) {
            for (int c = 0; c < size; c++) {
                board[r][c] = new JButton();
                board[r][c].setPreferredSize(new Dimension(120, 120));
                board[r][c].setBackground(new Color(240, 190, 183));
                board[r][c].addActionListener(this);
                board[r][c].setText("");

                game.add(board[r][c]);
            }
        }
        view.setVisible(true);
    }

    private ArrayList<Integer> getPosition(ActionEvent e) { // When a button is pressed it returns the row and column.
        ArrayList<Integer> position = new ArrayList<>();
        for (int r = 0; r < size; r++) {
            for (int c = 0; c < size; c++) {
                if (e.getSource() == board[r][c]) {
                    position.add(r);
                    position.add(c);
                }
            }
        }
        return position;
    }

    private void updateBoard(int r, int c, char player) {
        board[r][c].setText(Character.toString(player)); // Here the button is updated with players symbol on
                                                         // actionEvent(meaning button pressed)
        // board[r][c].setEnabled(false); //This will be controlled in model
        message.setText(model.getMessage());
    }

    public String getButtonValue(int i, int j) {
        return board[i][j].getText();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ArrayList<Integer> position = this.getPosition(e);
        this.setRequest(position);
    }

}
