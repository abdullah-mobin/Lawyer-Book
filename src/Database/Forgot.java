package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Forgot {

    public Forgot() {
    }

    public static Connection connectToDatabase() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "admin", "0000");
    }

    public void forget(String email, String oldPass, String newPass, String confirmPass) {
        try {
            Connection conn = connectToDatabase();

            String query = "SELECT * FROM lawyer_book.signup_info WHERE email = ? AND password = ?";
            PreparedStatement pst = conn.prepareStatement(query);
            pst.setString(1, email);
            pst.setString(2, oldPass);

            ResultSet rs = pst.executeQuery();

            String oldP = null;

            if (rs.next()) {
                oldP = rs.getString("password");
            }

            if (newPass.equals(confirmPass)) {

                query = "UPDATE lawyer_book.signup_info SET password = ? WHERE email = ? AND password = ?";
                pst = conn.prepareStatement(query);
                pst.setString(1, newPass);
                pst.setString(2, email);
                pst.setString(3, oldPass);
                pst.executeUpdate();
                query = "UPDATE lawyer_book.userinfo SET password = ? WHERE email = ? AND password = ?";
                pst = conn.prepareStatement(query);
                pst.setString(1, newPass);
                pst.setString(2, email);
                pst.setString(3, oldPass);
                pst.executeUpdate();

            } else {
                JOptionPane.showMessageDialog(null, "Invalid password or confirm password", "password unmatched", JOptionPane.ERROR_MESSAGE);

            }

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
