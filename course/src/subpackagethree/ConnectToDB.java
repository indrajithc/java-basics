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

        String query = "insert into admins"
        + "(username, password)"
        + "values('Aby', '12324')"
        + "";

        try {
            Statement statement = con.createStatement();
            statement.executeQuery(query);
            System.out.println("User added");
        } catch( Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
} 