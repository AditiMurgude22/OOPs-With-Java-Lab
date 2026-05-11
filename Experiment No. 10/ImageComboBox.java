import javax.swing.*;
import java.awt.event.*;

public class ImageComboBox extends JFrame {
    JComboBox<String> combo;
    JLabel label;

    ImageComboBox() {
        String images[] = {"img1.jpg", "img2.jpg", "img3.jpg"};

        combo = new JComboBox<>(images);
        label = new JLabel();

        combo.addItemListener(e -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                String img = (String) combo.getSelectedItem();
                label.setIcon(new ImageIcon(img));
            }
        });

        setLayout(new java.awt.FlowLayout());
        add(combo);
        add(label);

        setSize(400, 400);
        setTitle("Image Viewer");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ImageComboBox();
    }
}