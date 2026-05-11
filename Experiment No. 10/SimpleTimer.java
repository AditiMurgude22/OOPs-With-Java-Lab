import javax.swing.*;
import java.awt.event.*;

public class SimpleTimer extends JFrame {
    JLabel label;
    JButton start, stop;
    Timer timer;
    int count = 0;

    SimpleTimer() {
        label = new JLabel("Time: 0");
        start = new JButton("Start");
        stop = new JButton("Stop");

        setLayout(new java.awt.FlowLayout());
        add(label);
        add(start);
        add(stop);

        timer = new Timer(1000, e -> {
            count++;
            label.setText("Time: " + count);
        });

        start.addActionListener(e -> timer.start());
        stop.addActionListener(e -> timer.stop());

        setSize(300, 200);
        setTitle("Timer");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new SimpleTimer();
    }
}