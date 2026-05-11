import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class FactorialApplet extends Applet implements ActionListener {
    TextField t1, t2;
    Button b;

    public void init() {
        add(new Label("Enter Number:"));
        t1 = new TextField(10);
        add(t1);

        b = new Button("Find Factorial");
        add(b);

        add(new Label("Result:"));
        t2 = new TextField(10);
        add(t2);

        b.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        int num = Integer.parseInt(t1.getText());
        int fact = 1;

        for (int i = 1; i <= num; i++) {
            fact *= i;
        }

        t2.setText(String.valueOf(fact));
    }
}