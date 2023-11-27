package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CreateDataBase {

    public CreateDataBase() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "admin", "0000");

            Statement statement = connect.createStatement();
            statement.execute("CREATE SCHEMA " + "LAWYER_BOOK" + ";");

            Boolean lawyerinfoTable = statement.execute("CREATE TABLE " + "LAWYER_BOOK" + ".`lawyerinfo` (\n"
                    + "  `email` VARCHAR(45) NOT NULL,\n"
                    + "  `password` VARCHAR(45) NOT NULL,\n"
                    + "  `name` VARCHAR(45) NOT NULL,\n"
                    + "  `phone` VARCHAR(45) NOT NULL,\n"
                    + "  `gender` VARCHAR(45) NOT NULL,\n"
                    + "  `country` VARCHAR(45) NOT NULL,\n"
                    + "  `nid` INT NOT NULL,\n"
                    + "  `uni` VARCHAR(45) NOT NULL,\n"
                    + "  `graduation` VARCHAR(45) NOT NULL,\n"
                    + "  `grade` VARCHAR(45) NOT NULL,\n"
                    + "  `catagory` VARCHAR(45) NOT NULL,\n"
                    + "  `barID` VARCHAR(45) NOT NULL,\n"
                    + "  PRIMARY KEY (`email`));");

            Boolean userinfoTable = statement.execute("CREATE TABLE " + "LAWYER_BOOK" + ".`userinfo` (\n"
                    + "  `email` VARCHAR(45) NOT NULL,\n"
                    + "  `password` VARCHAR(45)  NULL,\n"
                    + "  `name` VARCHAR(45)  NULL,\n"
                    + "  `phone` VARCHAR(45)  NULL,\n"
                    + "  `gender` VARCHAR(45)  NULL,\n"
                    + "  `country` VARCHAR(45)  NULL,\n"
                    + "  `nid` INT  NULL,\n"
                    + "  PRIMARY KEY (`email`));");

            Boolean signupinfoTable = statement.execute("CREATE TABLE " + "LAWYER_BOOK" + ".`signup_info` (\n"
                    + "`Name` VARCHAR(50) NOT NULL,\n"
                    + "`Email` VARCHAR(45) NOT NULL,\n"
                    + "`password` VARCHAR(45) NOT NULL,\n"
                    + " PRIMARY KEY (`Email`));");


            Boolean BOOKpanelMsg = statement.execute("CREATE TABLE `lawyer_book`.`add` (\n"
                    + "  `email` VARCHAR(100) NOT NULL,\n"
                    + "  `msg` VARCHAR(405) NOT NULL,\n"
                    + "  `time` VARCHAR(405) NOT NULL,\n"
                    + "  `cost` VARCHAR(45) NOT NULL,\n"
                    + "  `LC` VARCHAR(45) NOT NULL,\n"
                    + "  PRIMARY KEY (`email`));");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException ex) {
            Logger.getLogger(CreateDataBase.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void main(String[] args) {
        CreateDataBase cc = new CreateDataBase();
    }
}
