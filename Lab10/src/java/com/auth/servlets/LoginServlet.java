package com.auth.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.auth.jdbc.credentials.Credentials;
import com.auth.jdbc.credentials.CredentialsDAO;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpSession;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (CredentialsDAO.isValidUser(new Credentials(username, password))) {
            HttpSession hp = request.getSession();
            hp.setAttribute("username", username);
            hp.setAttribute("password", password);

//            Cookie c1=new Cookie("username",username);
//            Cookie c2=new Cookie("password",password);
//            response.addCookie(c1);
//            response.addCookie(c2);
            response.sendRedirect("welcome.jsp");
        } else {
            response.sendRedirect("/LoginSession/");
        }
    }
}
