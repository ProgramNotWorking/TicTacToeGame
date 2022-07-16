import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class TicTacToeForm extends JFrame {
    private JPanel contentPanel;
    private JButton restartButton;
    private JButton exitButton;
    private JButton field1;
    private JButton field3;
    private JButton field2;
    private JButton field4;
    private JButton field5;
    private JButton field6;
    private JButton field7;
    private JButton field8;
    private JButton field9;
    private JRadioButton twoPlayers;
    private JRadioButton computerGame;

    public TicTacToeForm() throws Exception {

        this.setTitle("Tic-Tac-Toe game");
        this.setContentPane(contentPanel);
        this.setLocation(800, 450);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.pack();

        boolean[] fieldArray = new boolean[9];
        fillArray(fieldArray);

        final char[] whatSymbol = {'X'};

        exitButton.addActionListener(e -> System.exit(1));

        restartButton.addActionListener(e -> {
            getRestartContent(whatSymbol);
            fillArray(fieldArray);
            whatSymbol[0] = 'X';
        });

        restartButton.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    getRestartContent(whatSymbol);
                    fillArray(fieldArray);
                    whatSymbol[0] = 'X';
                }
            }
        });

        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
                    System.exit(1);
                    System.out.println("YES");
                }
            }
        });

        this.computerGame.setSelected(true);
        computerGame.addActionListener(e -> {
            if (twoPlayers.isSelected())
                twoPlayers.setSelected(false);

            getRestartContent(whatSymbol);
            fillArray(fieldArray);
            whatSymbol[0] = 'X';
        });

        twoPlayers.addActionListener(e -> {
            if (computerGame.isSelected())
                computerGame.setSelected(false);

            getRestartContent(whatSymbol);
            fillArray(fieldArray);
            whatSymbol[0] = 'X';
        });

        field1.addActionListener(e -> {
            if (twoPlayers.isSelected()) {
                switch (whatSymbol[0]) {
                    case 'X' -> {
                        field1.setText("X");
                        whatSymbol[0] = 'O';
                    }
                    case 'O' -> {
                        field1.setText("0");
                        whatSymbol[0] = 'X';
                    }
                }
            }
            if (computerGame.isSelected()) {
                field1.setText("X");
                setZeroField(field1, field2, field3, field4, field5, field6, field7, field8, field9, fieldArray);
            }
            field1.setEnabled(false);
            fieldArray[0] = true;
            winCheck(whatSymbol);
            checkDrawSituation(fieldArray, whatSymbol);
        });

        field2.addActionListener(e -> {
            if (twoPlayers.isSelected()) {
                switch (whatSymbol[0]) {
                    case 'X' -> {
                        field2.setText("X");
                        whatSymbol[0] = 'O';
                    }
                    case 'O' -> {
                        field2.setText("0");
                        whatSymbol[0] = 'X';
                    }
                }
            }
            if (computerGame.isSelected()) {
                field2.setText("X");
                setZeroField(field1, field2, field3, field4, field5, field6, field7, field8, field9, fieldArray);
            }
            field2.setEnabled(false);
            fieldArray[1] = true;
            winCheck(whatSymbol);
            checkDrawSituation(fieldArray, whatSymbol);
        });

        field3.addActionListener(e -> {
            if (twoPlayers.isSelected()) {
                switch (whatSymbol[0]) {
                    case 'X' -> {
                        field3.setText("X");
                        whatSymbol[0] = 'O';
                    }
                    case 'O' -> {
                        field3.setText("0");
                        whatSymbol[0] = 'X';
                    }
                }
            }
            if (computerGame.isSelected()) {
                field3.setText("X");
                setZeroField(field1, field2, field3, field4, field5, field6, field7, field8, field9, fieldArray);
            }
            field3.setEnabled(false);
            fieldArray[2] = true;
            winCheck(whatSymbol);
            checkDrawSituation(fieldArray, whatSymbol);
        });

        field4.addActionListener(e -> {
            if (twoPlayers.isSelected()) {
                switch (whatSymbol[0]) {
                    case 'X' -> {
                        field4.setText("X");
                        whatSymbol[0] = 'O';
                    }
                    case 'O' -> {
                        field4.setText("0");
                        whatSymbol[0] = 'X';
                    }
                }
            }
            if (computerGame.isSelected()) {
                field4.setText("X");
                setZeroField(field1, field2, field3, field4, field5, field6, field7, field8, field9, fieldArray);
            }
            field4.setEnabled(false);
            fieldArray[3] = true;
            winCheck(whatSymbol);
            checkDrawSituation(fieldArray, whatSymbol);
        });

        field5.addActionListener(e -> {
            if (twoPlayers.isSelected()) {
                switch (whatSymbol[0]) {
                    case 'X' -> {
                        field5.setText("X");
                        whatSymbol[0] = 'O';
                    }
                    case 'O' -> {
                        field5.setText("0");
                        whatSymbol[0] = 'X';
                    }
                }
            }
            if (computerGame.isSelected()) {
                field5.setText("X");
                setZeroField(field1, field2, field3, field4, field5, field6, field7, field8, field9, fieldArray);
            }
            field5.setEnabled(false);
            fieldArray[4] = true;
            winCheck(whatSymbol);
            checkDrawSituation(fieldArray, whatSymbol);
        });

        field6.addActionListener(e -> {
            if (twoPlayers.isSelected()) {
                switch (whatSymbol[0]) {
                    case 'X' -> {
                        field6.setText("X");
                        whatSymbol[0] = 'O';
                    }
                    case 'O' -> {
                        field6.setText("0");
                        whatSymbol[0] = 'X';
                    }
                }
            }
            if (computerGame.isSelected()) {
                field6.setText("X");
                setZeroField(field1, field2, field3, field4, field5, field6, field7, field8, field9, fieldArray);
            }
            field6.setEnabled(false);
            fieldArray[5] = true;
            winCheck(whatSymbol);
            checkDrawSituation(fieldArray, whatSymbol);
        });

        field7.addActionListener(e -> {
            if (twoPlayers.isSelected()) {
                switch (whatSymbol[0]) {
                    case 'X' -> {
                        field7.setText("X");
                        whatSymbol[0] = 'O';
                    }
                    case 'O' -> {
                        field7.setText("0");
                        whatSymbol[0] = 'X';
                    }
                }
            }
            if (computerGame.isSelected()) {
                field7.setText("X");
                setZeroField(field1, field2, field3, field4, field5, field6, field7, field8, field9, fieldArray);
            }
            field7.setEnabled(false);
            fieldArray[6] = true;
            winCheck(whatSymbol);
            checkDrawSituation(fieldArray, whatSymbol);
        });

        field8.addActionListener(e -> {
            if (twoPlayers.isSelected()) {
                switch (whatSymbol[0]) {
                    case 'X' -> {
                        field8.setText("X");
                        whatSymbol[0] = 'O';
                    }
                    case 'O' -> {
                        field8.setText("0");
                        whatSymbol[0] = 'X';
                    }
                }
            }
            if (computerGame.isSelected()) {
                field8.setText("X");
                setZeroField(field1, field2, field3, field4, field5, field6, field7, field8, field9, fieldArray);
            }
            field8.setEnabled(false);
            fieldArray[7] = true;
            winCheck(whatSymbol);
            checkDrawSituation(fieldArray, whatSymbol);
        });

        field9.addActionListener(e -> {
            if (twoPlayers.isSelected()) {
                switch (whatSymbol[0]) {
                    case 'X' -> {
                        field9.setText("X");
                        whatSymbol[0] = 'O';
                    }
                    case 'O' -> {
                        field9.setText("0");
                        whatSymbol[0] = 'X';
                    }
                }
            }
            if (computerGame.isSelected()) {
                field9.setText("X");
                setZeroField(field1, field2, field3, field4, field5, field6, field7, field8, field9, fieldArray);
            }
            field9.setEnabled(false);
            fieldArray[8] = true;
            winCheck(whatSymbol);
            checkDrawSituation(fieldArray, whatSymbol);
        });

    }

    private void fillArray(boolean[] Array) {
        for (int i = 0; i < 9; i++)
            Array[i] = false;
    }

    private int checkField(boolean[] Array) {
        int randomCell = (int) (Math.random() * 9);
        boolean isNeededCell = false;

        while (!isNeededCell) {
            if (Array[randomCell])
                randomCell = (int) (Math.random() * 9);
            else
                isNeededCell = true;
        }

        return randomCell;
    }

    private void setZeroField(JButton field1, JButton field3, JButton field2, JButton field4, JButton field5,
                                   JButton field6, JButton field7, JButton field8, JButton field9, boolean[] Array) {
        switch (checkField(Array)) {
            case 0 -> {
                field1.setText("0");
                field1.setEnabled(false);
                Array[0] = true;
            }
            case 1 -> {
                field2.setText("0");
                field2.setEnabled(false);
                Array[1] = true;
            }
            case 2 -> {
                field3.setText("0");
                field3.setEnabled(false);
                Array[2] = true;
            }
            case 3 -> {
                field4.setText("0");
                field4.setEnabled(false);
                Array[3] = true;
            }
            case 4 -> {
                field5.setText("0");
                field5.setEnabled(false);
                Array[4] = true;
            }
            case 5 -> {
                field6.setText("0");
                field6.setEnabled(false);
                Array[5] = true;
            }
            case 6 -> {
                field7.setText("0");
                field7.setEnabled(false);
                Array[6] = true;
            }
            case 7 -> {
                field8.setText("0");
                field8.setEnabled(false);
                Array[7] = true;
            }
            case 8 -> {
                field9.setText("0");
                field9.setEnabled(false);
                Array[8] = true;
            }
        }
    }

    private void winCheck(char[] symbol) {
        String status = checkStatus(field1, field2, field3, field4, field5,
                field6, field7, field8, field9, twoPlayers, computerGame);

        if (status.equals("player") || status.equals("computer") || status.equals("X") || status.equals("O")) {
            updateSymbolValue(symbol[0]);
            callTotalDialogWindow(status);
        }
    }

    private void checkDrawSituation(boolean[] Array, char[] symbol) {
        int countFilledCells = 0;

        for (int i = 0; i < 9; i++) {
            if (Array[i])
                countFilledCells++;
        }

        if (countFilledCells == 8) {
            updateSymbolValue(symbol[0]);

            String status = checkStatus(field1, field2, field3, field4, field5,
                    field6, field7, field8, field9, twoPlayers, computerGame);

            if (status.equals("NONE"))
                callTotalDialogWindow(status);
        }
    }

    private String checkStatus(JButton field1, JButton field2, JButton field3, JButton field4, JButton field5,
                               JButton field6, JButton field7, JButton field8, JButton field9,
                               JRadioButton twoPlayers, JRadioButton PC) {

        if (field1.getText().equals(field5.getText()) && field1.getText().equals(field9.getText())
                && field1.getText().equals("X")) {
            if (PC.isSelected())
                return "player";
            else if (twoPlayers.isSelected())
                return "X";
            else
                return "NONE";
        } else if (field1.getText().equals(field5.getText()) && field1.getText().equals(field9.getText())
                && field1.getText().equals("0")) {
            if (PC.isSelected())
                return "computer";
            else if (twoPlayers.isSelected())
                return "O";
            else
                return "NONE";
        }  else if (field3.getText().equals(field5.getText()) && field3.getText().equals(field7.getText())
                && field3.getText().equals("X")) {
            if (PC.isSelected())
                return "player";
            else if (twoPlayers.isSelected())
                return "X";
            else
                return "NONE";
        } else if (field3.getText().equals(field5.getText()) && field3.getText().equals(field7.getText())
                && field3.getText().equals("0")) {
            if (PC.isSelected())
                return "computer";
            else if (twoPlayers.isSelected())
                return "O";
            else
                return "NONE";
        } else if (field1.getText().equals(field4.getText()) && field1.getText().equals(field7.getText())
                && field1.getText().equals("X")) {
            if (PC.isSelected())
                return "player";
            else if (twoPlayers.isSelected())
                return "X";
            else
                return "NONE";
        } else if (field1.getText().equals(field4.getText()) && field1.getText().equals(field7.getText())
                && field1.getText().equals("0")) {
            if (PC.isSelected())
                return "computer";
            else if (twoPlayers.isSelected())
                return "O";
            else
                return "NONE";
        } else if (field2.getText().equals(field5.getText()) && field2.getText().equals(field8.getText())
                && field2.getText().equals("X")) {
            if (PC.isSelected())
                return "player";
            else if (twoPlayers.isSelected())
                return "X";
            else
                return "NONE";
        } else if (field2.getText().equals(field5.getText()) && field2.getText().equals(field8.getText())
                && field2.getText().equals("0")) {
            if (PC.isSelected())
                return "computer";
            else if (twoPlayers.isSelected())
                return "O";
            else
                return "NONE";
        } else if (field3.getText().equals(field6.getText()) && field3.getText().equals(field9.getText())
                && field3.getText().equals("X")) {
            if (PC.isSelected())
                return "player";
            else if (twoPlayers.isSelected())
                return "X";
            else
                return "NONE";
        } else if (field3.getText().equals(field6.getText()) && field3.getText().equals(field9.getText())
                && field3.getText().equals("0")) {
            if (PC.isSelected())
                return "computer";
            else if (twoPlayers.isSelected())
                return "O";
            else
                return "NONE";
        } else if (field1.getText().equals(field2.getText()) && field1.getText().equals(field3.getText())
                && field1.getText().equals("X")) {
            if (PC.isSelected())
                return "player";
            else if (twoPlayers.isSelected())
                return "X";
            else
                return "NONE";
        } else if (field1.getText().equals(field2.getText()) && field1.getText().equals(field3.getText())
                && field1.getText().equals("0")) {
            if (PC.isSelected())
                return "computer";
            else if (twoPlayers.isSelected())
                return "O";
            else
                return "NONE";
        } else if (field4.getText().equals(field5.getText()) && field4.getText().equals(field6.getText())
                && field4.getText().equals("X")) {
            if (PC.isSelected())
                return "player";
            else if (twoPlayers.isSelected())
                return "X";
            else
                return "NONE";
        } else if (field4.getText().equals(field5.getText()) && field4.getText().equals(field6.getText())
                && field4.getText().equals("0")) {
            if (PC.isSelected())
                return "computer";
            else if (twoPlayers.isSelected())
                return "O";
            else
                return "NONE";
        } else if (field7.getText().equals(field8.getText()) && field7.getText().equals(field9.getText())
                && field7.getText().equals("X")) {
            if (PC.isSelected())
                return "player";
            else if (twoPlayers.isSelected())
                return "X";
            else
                return "NONE";
        } else if (field7.getText().equals(field8.getText()) && field7.getText().equals(field9.getText())
                && field7.getText().equals("0")) {
            if (PC.isSelected())
                return "computer";
            else if (twoPlayers.isSelected())
                return "O";
            else
                return "NONE";
        } else {
            return "NONE";
        }

    }

    private void callTotalDialogWindow(String totalSituation) {
        switch (totalSituation) {
            case "player" ->
                JOptionPane.showMessageDialog(null, "Congrats\nU win!");
            case "computer" ->
                JOptionPane.showMessageDialog(null, "Unfortunately u lose\nTry again!");
            case "draw" ->
                JOptionPane.showMessageDialog(null, "Draw!");
            case "X" ->
                JOptionPane.showMessageDialog(null, "X mark player win!");
            case "O" ->
                JOptionPane.showMessageDialog(null, "O mark player win!");
            default ->
                JOptionPane.showMessageDialog(null, "Error!\nDeveloper didn't learn smth");
        }
    }

    private void getRestartContent(char[] symbol) {
        field1.setEnabled(true);
        field2.setEnabled(true);
        field3.setEnabled(true);
        field4.setEnabled(true);
        field5.setEnabled(true);
        field6.setEnabled(true);
        field7.setEnabled(true);
        field8.setEnabled(true);
        field9.setEnabled(true);

        field1.setText("");
        field2.setText("");
        field3.setText("");
        field4.setText("");
        field5.setText("");
        field6.setText("");
        field7.setText("");
        field8.setText("");
        field9.setText("");

        updateSymbolValue(symbol[0]);
    }

    private void updateSymbolValue(char symbol) {
        symbol = 'X';
    }
}
