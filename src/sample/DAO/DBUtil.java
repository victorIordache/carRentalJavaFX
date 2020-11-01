package sample.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {


    private static String databaseURL = "jdbc:mysql://localhost:3306/jademydatabase";
    private static String userDB = "root";
    private static String passwordDB = "password";

    public static Connection getConnection(){
        Connection myConn = null;
        try{
            myConn = DriverManager.getConnection(databaseURL,userDB,passwordDB);
        }catch(Exception exc){
            exc.printStackTrace();
        }
        return myConn;
    }

    public static void closeConnection(){
        try{
            DBUtil.getConnection().close();
        }catch (SQLException e){
            System.out.println("Connection error.");
        }
    }
}
