import javax.swing.*;
import java.awt.event.*;

public class StopwatchApp extends JFrame implements ActionListener, Runnable {
    JLabel label;
    JButton start, stop, reset;

    int seconds = 0;
    boolean running = false;

    StopwatchApp() {
        label = new JLabel("00:00:00");
        start = new JButton("Start");
        stop = new JButton("Stop");
        reset = new JButton("Reset");

        label.setBounds(150, 50, 100, 30);
        start.setBounds(50, 120, 80, 30);
        stop.setBounds(150, 120, 80, 30);
        reset.setBounds(250, 120, 80, 30);

        add(label);
        add(start);
        add(stop);
        add(reset);

        start.addActionListener(this);
        stop.addActionListener(this);
        reset.addActionListener(this);

        setTitle("Stopwatch");
        setSize(400, 250);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        Thread t = new Thread(this);
        t.start();
    }

    public void run() {
        while (true) {
            if (running) {
                seconds++;

                int hrs = seconds / 3600;
                int mins = (seconds % 3600) / 60;
                int secs = seconds % 60;

                label.setText(
                    String.format("%02d:%02d:%02d", hrs, mins, secs)
                );
            }

            try {
                Thread.sleep(1000);
            } catch (Exception e) {}
        }
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == start)
            running = true;
        else if (e.getSource() == stop)
            running = false;
        else if (e.getSource() == reset) {
            running = false;
            seconds = 0;
            label.setText("00:00:00");
        }
    }

    public static void main(String[] args) {
        new StopwatchApp();
    }
}