import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculatorGUI {
    static JTextField textField;
    static double num1, num2, result;
    static char operator;

    public static void main(String[] args) {

        JFrame frame = new JFrame("Calculator");
        frame.setSize(300, 400);
        frame.setLayout(new BorderLayout());

        textField = new JTextField();
        textField.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(textField, BorderLayout.NORTH);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 4));

        String[] buttons = {
                "7","8","9","/",
                "4","5","6","*",
                "1","2","3","-",
                "0","C","=","+",
                "√","x²","%","."
        };

        for (String b : buttons) {
            JButton btn = new JButton(b);
            panel.add(btn);

            btn.addActionListener(e -> handleInput(b));
        }

        frame.add(panel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    static void handleInput(String input) {
        try {
            if (input.matches("[0-9.]")) {
                textField.setText(textField.getText() + input);
            } else if (input.matches("[+\\-*/%]")) {
                num1 = Double.parseDouble(textField.getText());
                operator = input.charAt(0);
                textField.setText("");
            } else if (input.equals("=")) {
                num2 = Double.parseDouble(textField.getText());

                switch (operator) {
                    case '+': result = num1 + num2; break;
                    case '-': result = num1 - num2; break;
                    case '*': result = num1 * num2; break;
                    case '/': result = num1 / num2; break;
                    case '%': result = num1 % num2; break;
                }

                textField.setText(String.valueOf(result));
            } else if (input.equals("C")) {
                textField.setText("");
            } else if (input.equals("√")) {
                double val = Double.parseDouble(textField.getText());
                textField.setText(String.valueOf(Math.sqrt(val)));
            } else if (input.equals("x²")) {
                double val = Double.parseDouble(textField.getText());
                textField.setText(String.valueOf(val * val));
            }
        } catch (Exception e) {
            textField.setText("Error");
        }
    }
}