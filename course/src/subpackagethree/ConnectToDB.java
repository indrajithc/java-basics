package  course.src.subpackagethree;

import java.sql.*;

public class ConnectToDB {
    static Connection con = null;
    ConnectToDB() { 
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

    void add ( String username, String password) {

        String query = "insert into admins"
        + "(username, password)"
        + "values('"+ username +"', '" + password + "')"
        + "";

        try {
            Statement statement = con.createStatement();
            statement.executeQuery(query);
            statement.close();
            System.out.println("User added");
        } catch( Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    void getAll () {
        String query = "select * from admins";
        try {
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            
            System.out.println("===== db data =========");
            while( resultSet.next()) {
                int id  = resultSet.getInt("id");
                String username = resultSet.getString("username");
                String password = resultSet.getString("password");
                System.out.println(
                      "\n ID       : " + id 
                    + "\n Username : " + username 
                    + "\n Password : " + password );
            }
            resultSet.close();
            statement.close();
        } catch( Exception e ) {
            System.out.println("Error : " + e.getMessage());
        }
    }

    void getById ( int id ) {
        String query = "select * from admins where id =" + id;
        try {
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            
            System.out.println("===== db user =========");
            while( resultSet.next()) {
                int userId  = resultSet.getInt("id");
                String username = resultSet.getString("username");
                String password = resultSet.getString("password");
                System.out.println(
                      "\n ID       : " + userId 
                    + "\n Username : " + username 
                    + "\n Password : " + password );
            }
            resultSet.close();
            statement.close();
        } catch( Exception e ) {
            System.out.println("Error : " + e.getMessage());
        }
    }


    void update ( String username, String password, int id ) {
      
        String query = "update admins set "
        + " username = '"+ username +"' , password = '" + password + "'"
        + "where id = " + id
        + "";

        try {
            Statement statement = con.createStatement();
            statement.executeQuery(query);
            statement.close();
            System.out.println("User updated");
        } catch( Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }


    void delete ( int id ) {
        String query = " delete from admins where id = " + id;
        try {
            Statement statement = con.createStatement();
             statement.executeQuery(query); 
            System.out.println("===== user id : "+ id +" deleted =========");
            statement.close();
        } catch( Exception e ) {
            System.out.println("Error : " + e.getMessage());
        }
    }
} 