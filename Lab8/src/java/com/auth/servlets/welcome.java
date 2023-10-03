package com.auth.servlets;

import jakarta.servlet.*;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = {"/welcome"}, initParams = @WebInitParam(name = "Abc", value = "ok@gmail.com"))
public class welcome extends HttpServlet {

    public welcome() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("Welcome to the Application");

        HttpSession hp = request.getSession();

//        String password = null, username = null;
        String username = (String) hp.getAttribute("username");
        String password = (String) hp.getAttribute("password");

//        Cookie[] cookies = request.getCookies();
//        for (Cookie c : cookies) {
//            if (c.getName().equals("username")) {
//                username = c.getValue();
//            }
//            if (c.getName().equals("password")) {
//                password = c.getValue();
//            }
//        }
        out.println("USERNAME: " + username);
        out.println("PASSWORD: " + password);

        ServletConfig welcome = getServletConfig();
        out.println(welcome.getInitParameter("value"));
        
        hp.invalidate();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

}
