package devcldkai.lab3.utils;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//Singleton
public class DatabaseUtils {

    private static final String URL_CONNECTION = "jdbc:sqlserver://localhost:1433;databaseName=CourseManagement;encrypt=false;trustServerCertificate=true";

    private static final String USERNAME = "sa";

    private static final String PASSWORD = "123456";

    //constructor = private
    private DatabaseUtils(){}

    public static Connection getConnection() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            return DriverManager.getConnection(URL_CONNECTION, USERNAME, PASSWORD);
        } catch (ClassNotFoundException | SQLException e){
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args){
        Connection connection = DatabaseUtils.getConnection();

        if(connection != null){
            System.out.println("establish connection");
        }
    }

}
