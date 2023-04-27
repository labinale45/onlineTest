package db;
import java.sql.*;

public class Connector {
    public String sql;
    public static Connection getConnector() throws SQLException {
        try{
        String dburl="jdbc:mysql://localhost:3306/ot";
        String username="root";
        String password="";
        Connection conn=DriverManager.getConnection(dburl,username,password);
        System.out.println("Connected Successfully");
        return conn;
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        return null;
}}
