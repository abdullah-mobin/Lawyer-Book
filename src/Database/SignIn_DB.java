package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class SignIn_DB {

    String email = Frames.SignIn.mail_phone;
    String password = Frames.SignIn.signin_pass;

    public SignIn_DB() {
    }

    public boolean verify() {
        String storedPass = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "admin", "0000");
            Statement statement = connect.createStatement();
            PreparedStatement passCollect = connect.prepareStatement("SELECT password FROM " + "LAWYER_BOOK" + ".signup_info WHERE email = ?");

            passCollect.setString(1, email);
            ResultSet resultSet = passCollect.executeQuery();

            if (resultSet.next()) {
                storedPass = resultSet.getString("password");
            } else {
                return false;
            }
            if (storedPass.equals(password)) {
                return true;
            } else {
                return false;
            }

        } catch (ClassNotFoundException e) {
        } catch (SQLException ex) {
            Logger.getLogger(CreateDataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public void loggingin(String loginmail, String loginpass) {
        String storedPass = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "admin", "1234");

            PreparedStatement passCollect = connect.prepareStatement("SELECT password FROM test.user WHERE email = ?");

            passCollect.setString(1, loginmail);
            ResultSet resultSet = passCollect.executeQuery();

            if (resultSet.next()) {
                storedPass = resultSet.getString("password");
            } else {
                JOptionPane.showMessageDialog(null, "Invalid user or password");
            }
            if (storedPass.equals(loginpass)) {
                JOptionPane.showMessageDialog(null, "Welcome!! Login Successful");
            } else {
                JOptionPane.showMessageDialog(null, "Invalid user or password");
            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(SignIn_DB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
