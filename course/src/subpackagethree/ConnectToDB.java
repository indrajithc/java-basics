package  course.src.subpackagethree;

import java.sql.*;

public class ConnectToDB {

    public static void main(String[] args) {
        Connection con = null;
        try {
            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection("jdbc:sqlite:data.db");
            System.out.println("Connection successful");
        } catch( Exception e ) {
            System.out.println("Con not connect");
            System.out.println("Error : " + e.getMessage());
            System.exit(0);
        }
    }
} 