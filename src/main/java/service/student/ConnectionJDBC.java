package service.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionJDBC {
    private static Connection connection;
    private ConnectionJDBC() {
    }
    public static final String URL = "jdbc:mysql://localhost:3306/jbdcstudent";
    public static final String USER = "root";
    public static final String PASSWORD = "D4tRSzbc";
    public static Connection getConnection(){
        if(connection == null){
            try {
                Class.forName("com.mysql.jdbc.Driver");
                connection = DriverManager.getConnection(URL, USER, PASSWORD);
                System.out.println("Connection established");
            } catch (ClassNotFoundException | SQLException e) {
                System.out.println("Connection could not be established");
                e.printStackTrace();
            }
        }
        return connection;
    }
}
