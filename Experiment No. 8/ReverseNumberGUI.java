import javax.swing.*;
import java.awt.event.*;

public class ReverseNumberGUI {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Reverse Number");
        frame.setSize(300, 200);
        frame.setLayout(null);

        JLabel label = new JLabel("Enter Number:");
        label.setBounds(20, 20, 120, 25);

        JTextField input = new JTextField();
        input.setBounds(140, 20, 120, 25);

        JButton btn = new JButton("Reverse");
        btn.setBounds(80, 60, 120, 30);

        JLabel result = new JLabel("Result:");
        result.setBounds(20, 110, 250, 25);

        frame.add(label);
        frame.add(input);
        frame.add(btn);
        frame.add(result);

        btn.addActionListener(e -> {
            String num = input.getText();
            String rev = new StringBuilder(num).reverse().toString();
            result.setText("Result: " + rev);
        });

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}