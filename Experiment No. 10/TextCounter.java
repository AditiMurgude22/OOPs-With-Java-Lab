import javax.swing.*;
import java.awt.event.*;

public class TextCounter extends JFrame {
    JTextArea textArea;
    JLabel label;

    TextCounter() {
        textArea = new JTextArea(5, 20);
        label = new JLabel("Chars: 0 Words: 0");

        textArea.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent e) {
                String text = textArea.getText();
                int chars = text.length();
                int words = text.trim().isEmpty() ? 0 : text.trim().split("\\s+").length;

                label.setText("Chars: " + chars + " Words: " + words);
            }
        });

        setLayout(new java.awt.FlowLayout());
        add(new JScrollPane(textArea));
        add(label);

        setSize(400, 300);
        setTitle("Text Counter");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TextCounter();
    }
}