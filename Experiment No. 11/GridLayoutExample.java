import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GridLayoutExample extends JFrame implements ActionListener {
    JButton buttons[] = new JButton[6];
    String temp = "";

    GridLayoutExample() {
        setLayout(new GridLayout(2, 3));

        for (int i = 0; i < 6; i++) {
            buttons[i] = new JButton("" + (i + 1));
            buttons[i].addActionListener(this);
            add(buttons[i]);
        }

        setTitle("Grid Layout");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        JButton clicked = (JButton) e.getSource();

        if (temp.equals("")) {
            temp = clicked.getText();
            clicked.setText("");
        } else {
            clicked.setText(temp);
            temp = "";
        }
    }

    public static void main(String[] args) {
        new GridLayoutExample();
    }
}