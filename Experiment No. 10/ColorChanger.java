import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class ColorChanger extends JFrame {
    JButton button;

    ColorChanger() {
        button = new JButton("Choose Color");

        button.addActionListener(e -> {
            Color c = JColorChooser.showDialog(this, "Select Color", Color.WHITE);
            if (c != null) {
                getContentPane().setBackground(c);
            }
        });

        add(button);

        setSize(400, 300);
        setTitle("Background Color Changer");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ColorChanger();
    }
}