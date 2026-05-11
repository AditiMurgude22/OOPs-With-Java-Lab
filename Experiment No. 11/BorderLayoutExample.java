import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BorderLayoutExample extends JFrame implements ActionListener {
    JTextField input, result;
    JButton binary, octal, hex;

    BorderLayoutExample() {
        setLayout(new BorderLayout());

        JPanel top = new JPanel();
        top.add(new JLabel("Enter Number"));
        input = new JTextField(10);
        top.add(input);

        JPanel center = new JPanel();
        binary = new JButton("Binary");
        octal = new JButton("Octal");
        hex = new JButton("Hex");

        center.add(binary);
        center.add(octal);
        center.add(hex);

        JPanel bottom = new JPanel();
        bottom.add(new JLabel("Result"));
        result = new JTextField(10);
        bottom.add(result);

        add(top, BorderLayout.NORTH);
        add(center, BorderLayout.CENTER);
        add(bottom, BorderLayout.SOUTH);

        binary.addActionListener(this);
        octal.addActionListener(this);
        hex.addActionListener(this);

        setTitle("Border Layout");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        int num = Integer.parseInt(input.getText());

        if (e.getSource() == binary)
            result.setText(Integer.toBinaryString(num));
        else if (e.getSource() == octal)
            result.setText(Integer.toOctalString(num));
        else if (e.getSource() == hex)
            result.setText(Integer.toHexString(num));
    }

    public static void main(String[] args) {
        new BorderLayoutExample();
    }
}