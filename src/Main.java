import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            JFrame frame = null;
            try {
                frame = new TicTacToeForm();
            } catch(Exception ex) {
                throw new RuntimeException(ex);
            }
            frame.setExtendedState(JFrame.NORMAL);
            frame.setVisible(true);
        });

    }
}