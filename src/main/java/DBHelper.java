
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guven
 */
public class DBHelper {

    String connectionUrl = "jdbc:postgresql://ec2-54-75-245-196.eu-west-1.compute.amazonaws.com:5432/dc7r3mthu333un";
    private final String url = "jdbc:postgresql://localhost/dvdrental";
    private final String user = "lgkxkmshddxzvj";
    private final String password = "ab3d66ebe3160b43edb312f0387660056e121f4840e5bfd8ee9c6b8289ceca29";
    
    public Connection connect() throws ClassNotFoundException{
                Connection conn = null;
        try {
            conn = DriverManager.getConnection(connectionUrl, user , password);
            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.err.println("ERROR");
        }
        return conn;
    }
    
    public static void main(String[] args) throws ClassNotFoundException{
    DBHelper db = new DBHelper();
    db.connect();
    }

}
