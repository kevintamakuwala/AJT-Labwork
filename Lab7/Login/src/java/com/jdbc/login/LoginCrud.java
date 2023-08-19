/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdbc.login;

import com.jdbc.ConnectionProvider;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author user1
 */
public class LoginCrud {
    public static boolean register(LoginDetails login)
    {
        try {
                Connection con = ConnectionProvider.CreateConnection();
                String query = "insert into AUTH(USERNAME,PASSWORD) values(?,?)";
                PreparedStatement pstmt = con.prepareStatement(query);

//			Setting values of parameters
                pstmt.setString(1, login.getUserName());
                pstmt.setString(2, login.getPassword());

                pstmt.executeUpdate();

                return true;

        } catch (Exception e) {
                e.printStackTrace();
        }
        return false;
    }
    public static boolean getLogin(LoginDetails checkLogin) {
        try {
            Connection con = ConnectionProvider.CreateConnection();
            String query = "select * from AUTH";
            Statement stmt = con.createStatement();

            ResultSet resultSet = stmt.executeQuery(query);
            while (resultSet.next()) {
                String user = resultSet.getString("USERNAME");
                String pwd = resultSet.getString("PASSWORD");

                if (checkLogin.getUserName().equals(user) && checkLogin.getPassword().equals(pwd)) {
                    return true;
                }

//                    loginDetails=new LoginDetails(user,pwd);
//                    System.out.println("ID: " + user);
//                    System.out.println("Name: " + pwd);
//                    
//                    System.out.println("----------------------------------------");
            }

            con.close();
            stmt.close();

        } catch (SQLException e) {
        }
        return false;
    }

}

//
//public class StudentDao {
//	public static boolean insertStudentToDB(Student student) {
//		
//	}
//
//	public static void getStudentToDB() {
//		
//
//	}
//
//	public static boolean updateStudentToDB(int sid, Student student) {
//
//		try {
//			Connection con = ConnectionProvider.CreateConnection();
//			String query = "update students set name = ?, phone = ?, city = ? where id = ? ";
//
//			PreparedStatement pstmt = con.prepareStatement(query);
//			pstmt.setInt(4, sid);
//			pstmt.setString(1, student.getStudentName());
//			pstmt.setString(2, student.getStudentPhone());
//			pstmt.setString(3, student.getStudentCity());
//			pstmt.executeUpdate();
//
//			return true;
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//		return false;
//	}
//
//	public static boolean deleteStudentToDB(int id) {
//		try {
//			Connection con = ConnectionProvider.CreateConnection();
//			String query = "delete from students where id=?";
//			PreparedStatement pstmt = con.prepareStatement(query);
//
////			Setting id to delete
//
//			pstmt.setInt(1, id);
//			pstmt.executeUpdate();
//			return true;
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return false;
//	}
//
//}
