import javax.swing.*;
import java.awt.*;

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

    public TicTacToeForm() throws Exception {

        this.setTitle("Tic-Tac-Toe game");
        this.setContentPane(contentPanel);
        this.setLocation(800, 450);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.pack();

        Boolean[] fieldArray = new Boolean[9];
        fillArray(fieldArray);

        exitButton.addActionListener(e -> System.exit(1));

        restartButton.addActionListener(e -> {
            field1.setEnabled(true);
            field2.setEnabled(true);
            field3.setEnabled(true);
            field4.setEnabled(true);
            field5.setEnabled(true);
            field6.setEnabled(true);
            field7.setEnabled(true);
            field8.setEnabled(true);
            field9.setEnabled(true);

            field1.setText(null);
            field2.setText(null);
            field3.setText(null);
            field4.setText(null);
            field5.setText(null);
            field6.setText(null);
            field7.setText(null);
            field8.setText(null);
            field9.setText(null);
        });

        field1.addActionListener(e -> {
            field1.setText("X");
            field1.setEnabled(false);
            fieldArray[0] = true;
            setZeroField(field1, field2, field3, field4, field5, field6, field7, field8, field9, fieldArray);
            winCheck();
            checkDrawSituation(fieldArray);
        });

        field2.addActionListener(e -> {
            field2.setText("X");
            field2.setEnabled(false);
            fieldArray[1] = true;
            setZeroField(field1, field2, field3, field4, field5, field6, field7, field8, field9, fieldArray);
            winCheck();
            checkDrawSituation(fieldArray);
        });

        field3.addActionListener(e -> {
            field3.setText("X");
            field3.setEnabled(false);
            fieldArray[2] = true;
            setZeroField(field1, field2, field3, field4, field5, field6, field7, field8, field9, fieldArray);
            winCheck();
            checkDrawSituation(fieldArray);
        });

        field4.addActionListener(e -> {
            field4.setText("X");
            field4.setEnabled(false);
            fieldArray[3] = true;
            setZeroField(field1, field2, field3, field4, field5, field6, field7, field8, field9, fieldArray);
            winCheck();
            checkDrawSituation(fieldArray);
        });

        field5.addActionListener(e -> {
            field5.setText("X");
            field5.setEnabled(false);
            fieldArray[4] = true;
            setZeroField(field1, field2, field3, field4, field5, field6, field7, field8, field9, fieldArray);
            winCheck();
            checkDrawSituation(fieldArray);
        });

        field6.addActionListener(e -> {
            field6.setText("X");
            field6.setEnabled(false);
            fieldArray[5] = true;
            setZeroField(field1, field2, field3, field4, field5, field6, field7, field8, field9, fieldArray);
            winCheck();
            checkDrawSituation(fieldArray);
        });

        field7.addActionListener(e -> {
            field7.setText("X");
            field7.setEnabled(false);
            fieldArray[6] = true;
            setZeroField(field1, field2, field3, field4, field5, field6, field7, field8, field9, fieldArray);
            winCheck();
            checkDrawSituation(fieldArray);
        });

        field8.addActionListener(e -> {
            field8.setText("X");
            field8.setEnabled(false);
            fieldArray[7] = true;
            setZeroField(field1, field2, field3, field4, field5, field6, field7, field8, field9, fieldArray);
            winCheck();
            checkDrawSituation(fieldArray);
        });

        field9.addActionListener(e -> {
            field9.setText("X");
            field9.setEnabled(false);
            fieldArray[8] = true;
            setZeroField(field1, field2, field3, field4, field5, field6, field7, field8, field9, fieldArray);
            winCheck();
            checkDrawSituation(fieldArray);
        });

    }

    private void fillArray(Boolean[] Array) {
        for (int i = 0; i < 9; i++)
            Array[i] = false;
    }

    private int checkField(Boolean[] Array) {
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
                                   JButton field6, JButton field7, JButton field8, JButton field9, Boolean[] Array) {
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

    private void winCheck() {
        int winStatus = checkWinStatus(field1, field2, field3, field4, field5, field6, field7, field8, field9);

        if (winStatus == 0 || winStatus == 1)
            callTotalDialogWindow(winStatus);
    }

    private void checkDrawSituation(Boolean[] Array) {
        int countFilledCells = 0;

        for (int i = 0; i < 9; i++) {
            if (Array[i])
                countFilledCells++;
        }

        if (countFilledCells == 8)
            callTotalDialogWindow(10);
    }

    private int checkWinStatus(JButton field1, JButton field3, JButton field2, JButton field4, JButton field5,
                               JButton field6, JButton field7, JButton field8, JButton field9) {

        if (field1.getText().equals(field5.getText()) && field1.getText().equals(field9.getText())
                && field1.getText().equals("X")) {
             return 1;
        } else if (field1.getText().equals(field5.getText()) && field1.getText().equals(field9.getText())
                && field1.getText().equals("0")) {
            return 0;
        }  else if (field3.getText().equals(field5.getText()) && field3.getText().equals(field7.getText())
                && field3.getText().equals("X")) {
            return 1;
        } else if (field3.getText().equals(field5.getText()) && field3.getText().equals(field7.getText())
                && field3.getText().equals("0")) {
            return 0;
        } else if (field1.getText().equals(field4.getText()) && field1.getText().equals(field7.getText())
                && field1.getText().equals("X")) {
            return 1;
        } else if (field1.getText().equals(field4.getText()) && field1.getText().equals(field7.getText())
                && field1.getText().equals("0")) {
            return 0;
        } else if (field2.getText().equals(field5.getText()) && field2.getText().equals(field8.getText())
                && field2.getText().equals("X")) {
            return 1;
        } else if (field2.getText().equals(field5.getText()) && field2.getText().equals(field8.getText())
                && field2.getText().equals("0")) {
            return 0;
        } else if (field3.getText().equals(field6.getText()) && field3.getText().equals(field9.getText())
                && field3.getText().equals("X")) {
            return 1;
        } else if (field3.getText().equals(field6.getText()) && field3.getText().equals(field9.getText())
                && field3.getText().equals("0")) {
            return 0;
        } else if (field1.getText().equals(field2.getText()) && field1.getText().equals(field3.getText())
                && field1.getText().equals("X")) {
            return 1;
        } else if (field1.getText().equals(field2.getText()) && field1.getText().equals(field3.getText())
                && field1.getText().equals("0")) {
            return 0;
        } else if (field4.getText().equals(field5.getText()) && field4.getText().equals(field6.getText())
                && field4.getText().equals("X")) {
            return 1;
        } else if (field4.getText().equals(field5.getText()) && field4.getText().equals(field6.getText())
                && field4.getText().equals("0")) {
            return 0;
        } else if (field7.getText().equals(field8.getText()) && field7.getText().equals(field9.getText())
                && field7.getText().equals("X")) {
            return 1;
        } else if (field7.getText().equals(field8.getText()) && field7.getText().equals(field9.getText())
                && field7.getText().equals("0")) {
            return 0;
        } else {
            return -1;
        }
    }

    private void callTotalDialogWindow(int number) {
        EventQueue.invokeLater(() -> {
            JFrame totalFrame = null;
            try {
                totalFrame = new WinOrLoseDialogForm(number);
            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }
            totalFrame.setExtendedState(JFrame.NORMAL);
            totalFrame.setVisible(true);
        });
    }
}
