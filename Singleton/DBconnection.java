package Singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnection {
    private String dbHost = "localhost";
    private String dbPort = "3305";
    private String dbUser = "root";
    private String dbPass = "12345";
    private String dbName = "products";
    private  static DBconnection instance;
    Connection dbConnection;

    public static DBconnection getInstance(){
        if (instance == null){
            instance = new DBconnection();
        }
        return instance;
    }

    public Connection getDbConnection() throws ClassNotFoundException, SQLException {
        if (dbConnection == null) {
            String connectionString = "jdbc:mysql://" + dbHost + ":" + dbPort + "/" + dbName;
            Class.forName("com.mysql.cj.jdbc.Driver");
            dbConnection = DriverManager.getConnection(connectionString, dbUser, dbPass);
        }
        return dbConnection;
    }
}
