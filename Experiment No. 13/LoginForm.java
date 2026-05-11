import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class LoginForm extends JFrame implements ActionListener {
    JTextField user;
    JPasswordField pass;
    JButton register;

    LoginForm() {
        JLabel l1 = new JLabel("Username:");
        JLabel l2 = new JLabel("Password:");

        user = new JTextField();
        pass = new JPasswordField();
        register = new JButton("Register");

        l1.setBounds(50, 50, 100, 30);
        l2.setBounds(50, 100, 100, 30);
        user.setBounds(150, 50, 150, 30);
        pass.setBounds(150, 100, 150, 30);
        register.setBounds(120, 160, 100, 30);

        add(l1);
        add(l2);
        add(user);
        add(pass);
        add(register);

        register.addActionListener(this);

        setTitle("Login Form");
        setSize(400, 300);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/college",
                "root",
                "password"
            );

            PreparedStatement ps = con.prepareStatement(
                "INSERT INTO users(username,password) VALUES(?,?)"
            );

            ps.setString(1, user.getText());
            ps.setString(2, new String(pass.getPassword()));

            ps.executeUpdate();

            JOptionPane.showMessageDialog(this, "Registered Successfully");

            con.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public static void main(String[] args) {
        new LoginForm();
    }
}