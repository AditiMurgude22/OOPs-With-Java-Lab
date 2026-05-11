import javax.swing.*;
import java.awt.event.*;

public class CounterGUI {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Counter");
        frame.setSize(300, 150);
        frame.setLayout(null);

        JLabel label = new JLabel("Counter");
        label.setBounds(20, 20, 60, 25);

        JTextField textField = new JTextField("0");
        textField.setBounds(80, 20, 80, 25);

        JButton up = new JButton("Count Up");
        up.setBounds(20, 60, 90, 25);

        JButton down = new JButton("Count Down");
        down.setBounds(120, 60, 110, 25);

        JButton reset = new JButton("Reset");
        reset.setBounds(240, 60, 70, 25);

        frame.add(label);
        frame.add(textField);
        frame.add(up);
        frame.add(down);
        frame.add(reset);

        // Action Listeners
        up.addActionListener(e -> {
            int val = Integer.parseInt(textField.getText());
            textField.setText(String.valueOf(val + 1));
        });

        down.addActionListener(e -> {
            int val = Integer.parseInt(textField.getText());
            textField.setText(String.valueOf(val - 1));
        });

        reset.addActionListener(e -> {
            textField.setText("0");
        });

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}