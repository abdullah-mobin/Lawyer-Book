
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SignUp_DB {
    
    String name = Frames.SignUp.firstName + " " + Frames.SignUp.lastName ;
    String email = Frames.SignUp.mail_phone ;
    String password = Frames.SignUp.signup_pass ;



    public SignUp_DB(){}

    public void createAccount() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "admin", "0000");

            Statement statement = connect.createStatement();
            
            statement.execute("INSERT INTO " + "LAWYER_BOOK" + ".`signup_info` (`Name`, `Email`, `password`) VALUES ('"+name+"', '"+email+"', '"+password+"');");

            

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException ex) {
            Logger.getLogger(CreateDataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
