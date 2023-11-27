package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProfileUpdate {

    String email = Frames.SignIn.mail_phone;

    String mail = Frames.HomePage.mail_edit;
    String phone = Frames.HomePage.phone_edit;
    int nid = Frames.HomePage.nid_edit;
    String country = Frames.HomePage.country_edit;
    String gender = Frames.HomePage.gender_edit;
    String uni = Frames.HomePage.UNI;
    String bar = Frames.HomePage.BAR;
    String yr = Frames.HomePage.YR;
    String GPA = Frames.HomePage.GPA;
    String cat = Frames.HomePage.CAT;

    public ProfileUpdate() {
    }

    public void AddLawyerAccount() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "admin", "0000");
            Statement statement = connect.createStatement();


            PreparedStatement passCollect = connect.prepareStatement("SELECT Name, password FROM " + "LAWYER_BOOK" + ".signup_info WHERE email = '" + email + "' ");
            ResultSet resultSet = passCollect.executeQuery();

            String pass = null;
            String name = null;

            if (resultSet.next()) {
                pass = resultSet.getString("password");
                name = resultSet.getString("Name");
            }
            if (mail == null) {
                mail = email;
            }

            statement.execute("INSERT INTO `lawyer_book`.`lawyerinfo` "
                    + "(`email`, `password`, `name`, `phone`, `gender`, `country`, `nid`, `uni`, `graduation`, `grade`, `catagory`, `barID`) "
                    + "VALUES "
                    + "('" + mail + "', '" + pass + "', '" + name + "', '" + phone + "', '" + gender + "', '" + country + "', '" + nid + "', '" + uni + "', '" + yr + "', '" + GPA + "', '" + cat + "', '" + bar + "');");

        } catch (ClassNotFoundException e) {
        } catch (SQLException ex) {
            Logger.getLogger(CreateDataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void UpdateUserAccount() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "admin", "0000");
            Statement statement = connect.createStatement();
            PreparedStatement previousEdit = connect.prepareStatement("SELECT email FROM " + "LAWYER_BOOK" + ".userinfo WHERE email = '" + email + "' ;");

            ResultSet prevAccount = previousEdit.executeQuery();
            if (prevAccount.next()) {

                PreparedStatement prevInfo = connect.prepareStatement("SELECT email,password,name,phone,gender,country,nid FROM " + "LAWYER_BOOK" + ".userinfo WHERE email = '" + email + "' ;");
                ResultSet oldInfo = prevInfo.executeQuery();

                String oldpass = null;
                String oldname = null;
                String oldmail = null;
                String oldphone = null;
                String oldgender = null;
                String oldcountry = null;
                String oldnid = null;

                if (oldInfo.next()) {
                    oldpass = oldInfo.getString("password");
                    oldname = oldInfo.getString("name");
                    oldmail = oldInfo.getString("email");
                    oldphone = oldInfo.getString("phone");
                    oldgender = oldInfo.getString("gender");
                    oldcountry = oldInfo.getString("country");
                    oldnid = oldInfo.getString("nid");
                }

                if (mail == null) {
                    mail = oldmail;
                }
                if (phone == null) {
                    phone = oldphone;
                }
                if (country == null) {
                    country = oldcountry;
                }
                if (gender == null) {
                    gender = oldgender;
                }
                if (nid == 0) {
                    nid = Integer.parseInt(oldnid);
                }
                statement.execute("UPDATE `lawyer_book`.`signup_info` SET `Email` = '" + mail + "' WHERE (`Email` = '" + email + "');");

                statement.execute("UPDATE `lawyer_book`.`userinfo` SET `email` = '" + mail + "', `password` = '" + oldpass + "', `name` = '" + oldname + "', `phone` = '" + phone + "', `gender` = '" + gender + "', `country` = '" + country + "', `nid` = '" + nid + "' WHERE (`email` = '" + email + "');");

            } else {
                PreparedStatement passCollect = connect.prepareStatement("SELECT Name, password FROM " + "LAWYER_BOOK" + ".signup_info WHERE email = '" + email + "' ");
                ResultSet resultSet = passCollect.executeQuery();

                String pass = null;
                String name = null;

                if (resultSet.next()) {
                    pass = resultSet.getString("password");
                    name = resultSet.getString("Name");
                }
                if (mail == null) {
                    mail = email;
                }

                statement.execute("UPDATE `lawyer_book`.`signup_info` SET `Email` = '" + mail + "' WHERE (`Email` = '" + email + "');");

                statement.execute("INSERT INTO `lawyer_book`.`userinfo` (`email`, `password`, `name`, `phone`, `gender`, `country`, `nid`) "
                        + "VALUES ('" + mail + "', '" + pass + "', '" + name + "', '" + phone + "', '" + gender + "', '" + country + "', '" + nid + "');");
            }
        } catch (ClassNotFoundException e) {
        } catch (SQLException ex) {
            Logger.getLogger(CreateDataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void verify() {
        String storedPass = null;
        String storedName = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "admin", "0000");
            Statement statement = connect.createStatement();
            PreparedStatement passCollect = connect.prepareStatement("SELECT Name, password FROM " + "LAWYER_BOOK" + ".signup_info WHERE email = ?");

            passCollect.setString(1, email);
            ResultSet resultSet = passCollect.executeQuery();

            if (resultSet.next()) {
                storedPass = resultSet.getString("password");
                System.out.println(storedPass);
                storedName = resultSet.getString("Name");
                System.out.println(storedName);
            } else {
            }
//            if (storedPass.equals(password)) {
//                return true;
//            } else {
//                return false;
//            }

        } catch (ClassNotFoundException e) {
        } catch (SQLException ex) {
            Logger.getLogger(CreateDataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String[] args) {
        ProfileUpdate m = new ProfileUpdate();
        m.UpdateUserAccount();
    }
}
