package com.auth.servlets;

import com.auth.jdbc.credentials.Credentials;
import com.auth.jdbc.credentials.CredentialsDAO;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (CredentialsDAO.createUser(new Credentials(username, password))) {
            HttpSession hp = request.getSession();
            hp.setAttribute("username", username);
            hp.setAttribute("password", password);
            response.sendRedirect("welcome.jsp");
        } else {
            response.sendRedirect("/LoginSession/register.jsp/");
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
