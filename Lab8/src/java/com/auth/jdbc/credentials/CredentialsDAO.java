package com.auth.jdbc.credentials;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.auth.jdbc.ConnectionProvider;

public class CredentialsDAO {

    public static boolean isValidUser(Credentials credentials) {

        try {
            Connection con = ConnectionProvider.getConnection();
            System.out.println(con);
            String query = "select * from AUTH";
            Statement stmt = con.createStatement();
            ResultSet resultSet = stmt.executeQuery(query);
            while (resultSet.next()) {
                String user = resultSet.getString("USERNAME");
                String pwd = resultSet.getString("PASSWORD");
                if (credentials.getUsername().equals(user) && credentials.getPassword().equals(pwd)) {
                    return true;
                }
            }
            con.close();
            stmt.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean createUser(Credentials credentials) {
        try {
            Connection con = ConnectionProvider.getConnection();
            String query = "insert into AUTH(USERNAME,PASSWORD) values(?,?)";
            PreparedStatement pstmt = con.prepareStatement(query);

            pstmt.setString(1, credentials.getUsername());
            pstmt.setString(2, credentials.getPassword());
            pstmt.executeUpdate();
            return true;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
