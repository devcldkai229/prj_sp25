package devcldkai.lab3.utils;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Base64;

//Singleton
public class DatabaseUtils {

    private static final String URL_CONNECTION = "jdbc:sqlserver://localhost:1433;databaseName=CourseManagement;encrypt=false;trustServerCertificate=true";

    private static final String USERNAME = "sa";

    private static final String PASSWORD = "12345";

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

        public static void main(String[] args) {
            String id = "user123@" + System.currentTimeMillis();
            String idEncode = Base64.getEncoder().encodeToString(id.getBytes());

            System.out.println("Before encoder: ");
            System.out.println(idEncode);

            // Giải mã đúng cách
            byte[] decodedBytes = Base64.getDecoder().decode(idEncode);
            String decodedString = new String(decodedBytes); // Chuyển về String

            System.out.println("After decoder: ");
            System.out.println(decodedString);


    }
}
