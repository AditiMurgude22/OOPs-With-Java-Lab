import java.sql.*;

public class StudentCRUD {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/college",
                "root",
                "password"
            );

            Statement stmt = con.createStatement();

            // Insert
            stmt.executeUpdate("INSERT INTO student VALUES(1,'Aditi',19)");

            // Select
            ResultSet rs = stmt.executeQuery("SELECT * FROM student");
            while (rs.next()) {
                System.out.println(
                    rs.getInt(1) + " " +
                    rs.getString(2) + " " +
                    rs.getInt(3)
                );
            }

            // Update
            stmt.executeUpdate("UPDATE student SET age=20 WHERE id=1");

            // Delete
            stmt.executeUpdate("DELETE FROM student WHERE id=1");

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}