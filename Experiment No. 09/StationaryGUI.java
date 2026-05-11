import javax.swing.*;
import java.awt.event.*;

public class StationaryGUI {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Stationary Purchase System");
        frame.setSize(350, 300);
        frame.setLayout(null);

        JCheckBox notebook = new JCheckBox("Notebook @ 50");
        notebook.setBounds(50, 50, 150, 25);

        JCheckBox pen = new JCheckBox("Pen @ 30");
        pen.setBounds(50, 80, 150, 25);

        JCheckBox pencil = new JCheckBox("Pencil @ 10");
        pencil.setBounds(50, 110, 150, 25);

        JButton order = new JButton("Order");
        order.setBounds(100, 160, 100, 30);

        frame.add(notebook);
        frame.add(pen);
        frame.add(pencil);
        frame.add(order);

        order.addActionListener(e -> {
            int total = 0;
            String message = "";

            if (notebook.isSelected()) {
                String qty = JOptionPane.showInputDialog("Enter quantity for Notebook:");
                int q = Integer.parseInt(qty);
                total += q * 50;
                message += "Notebook Quantity: " + q + "\n";
            }

            if (pen.isSelected()) {
                String qty = JOptionPane.showInputDialog("Enter quantity for Pen:");
                int q = Integer.parseInt(qty);
                total += q * 30;
                message += "Pen Quantity: " + q + "\n";
            }

            if (pencil.isSelected()) {
                String qty = JOptionPane.showInputDialog("Enter quantity for Pencil:");
                int q = Integer.parseInt(qty);
                total += q * 10;
                message += "Pencil Quantity: " + q + "\n";
            }

            message += "Total: " + total;

            JOptionPane.showMessageDialog(frame, message);
            JOptionPane.showMessageDialog(frame, "Successfully Ordered!");
        });

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}