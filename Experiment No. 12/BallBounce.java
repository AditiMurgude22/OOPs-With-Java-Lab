import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class BallPanel extends JPanel implements Runnable, MouseListener {
    int x = 50, y = 50;
    int dx = 2, dy = 2;
    boolean start = false;

    BallPanel() {
        addMouseListener(this);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        g.fillOval(x, y, 30, 30);
    }

    public void run() {
        while (true) {
            if (start) {
                x += dx;
                y += dy;

                if (x <= 0 || x >= getWidth() - 30)
                    dx = -dx;

                if (y <= 0 || y >= getHeight() - 30)
                    dy = -dy;

                repaint();
            }

            try {
                Thread.sleep(10);
            } catch (Exception e) {}
        }
    }

    public void mousePressed(MouseEvent e) {
        start = true;
    }

    public void mouseClicked(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
}

public class BallBounce {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ball Bounce");

        BallPanel panel = new BallPanel();
        frame.add(panel);

        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        Thread t = new Thread(panel);
        t.start();
    }
}