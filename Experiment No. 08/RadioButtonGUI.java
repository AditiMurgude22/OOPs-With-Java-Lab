import javax.swing.*;
import java.awt.event.*;

public class RadioButtonGUI {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Gender Selection");
        frame.setSize(300, 200);
        frame.setLayout(null);

        JLabel label = new JLabel("Select Gender:");
        label.setBounds(20, 20, 120, 25);

        JRadioButton male = new JRadioButton("Male");
        male.setBounds(20, 50, 100, 25);

        JRadioButton female = new JRadioButton("Female");
        female.setBounds(120, 50, 100, 25);

        ButtonGroup group = new ButtonGroup();
        group.add(male);
        group.add(female);

        JButton submit = new JButton("Submit");
        submit.setBounds(80, 90, 100, 30);

        JLabel result = new JLabel("");
        result.setBounds(20, 130, 200, 25);

        frame.add(label);
        frame.add(male);
        frame.add(female);
        frame.add(submit);
        frame.add(result);

        submit.addActionListener(e -> {
            if (male.isSelected()) {
                result.setText("Selected: Male");
            } else if (female.isSelected()) {
                result.setText("Selected: Female");
            } else {
                result.setText("Please select gender");
            }
        });

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}