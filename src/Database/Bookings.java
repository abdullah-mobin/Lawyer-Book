package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Bookings {
    
    public Bookings(){}
    
    public void AdvToDb(String email,String msg,String time, String cost,String lc) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "admin", "0000");
            Statement statement = connect.createStatement();

            statement.execute("INSERT INTO `lawyer_book`.`add` "
                    + "(`email`, `msg`, `time`, `cost`, `LC`) "
                    + "VALUES ('"+email+"', '"+msg+"', '"+time+"', '"+cost+"', '"+lc+"');");

        } catch (ClassNotFoundException e) {
        } catch (SQLException ex) {
            Logger.getLogger(CreateDataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public void DbToBookPanel() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "admin", "0000");
            Statement statement = connect.createStatement();

            statement.execute("SELECT * FROM lawyer_book.add;");
            
            

        } catch (ClassNotFoundException e) {
        } catch (SQLException ex) {
            Logger.getLogger(CreateDataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}