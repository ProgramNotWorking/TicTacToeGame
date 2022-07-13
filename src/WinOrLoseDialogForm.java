import javax.swing.*;

public class WinOrLoseDialogForm extends JFrame {
    private JTextArea textArea;
    private JPanel totalPanel;

    public WinOrLoseDialogForm(int totalNumber) throws Exception {

        this.setTitle("");
        this.setContentPane(totalPanel);
        this.setLocation(800, 450);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.pack();

        this.textArea.setEditable(false);

        if (totalNumber == 1)
            textArea.setText("Congrats\nU win!");
        else if (totalNumber == 0)
            textArea.setText("Unfortunately u lose\nTry again!");
        else
            textArea.setText("Draw!");

    }

}
