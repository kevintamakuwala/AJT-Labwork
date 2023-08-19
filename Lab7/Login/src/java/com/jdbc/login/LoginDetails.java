/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdbc.login;

/**
 *
 * @author user1
 */
public class LoginDetails {
    String userName,password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "LoginDao{" + "userName=" + userName + ", password=" + password + '}';
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LoginDetails(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
}
