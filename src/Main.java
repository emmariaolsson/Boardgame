import model.TicTacToeModel;
import viewController.ViewControl;

public class Main {
    public static void main(String[] args) {
        new ViewControl(new TicTacToeModel()); //Later on it will call Boardgame()

    }
}