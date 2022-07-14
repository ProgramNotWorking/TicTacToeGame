import javax.swing.*;

public class WinOrLoseDialogForm extends JFrame {
    private JTextArea textArea;
    private JPanel totalPanel;

    public WinOrLoseDialogForm(String totalSituation) throws Exception {

        this.setTitle("");
        this.setContentPane(totalPanel);
        this.setLocation(800, 450);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.pack();

        this.textArea.setEditable(false);

        switch (totalSituation) {
            case "player" -> textArea.setText("Congrats\nU win!");
            case "computer" -> textArea.setText("Unfortunately u lose\nTry again!");
            case "draw" -> textArea.setText("Draw!");
            default -> textArea.setText("Error!\nDeveloper didn't learn smt");
        }

    }

}
