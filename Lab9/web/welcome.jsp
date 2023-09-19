<%-- 
    Document   : welcome
    Created on : 11-Sep-2023, 2:15:44 pm
    Author     : kevin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    HttpSession hp = request.getSession(false);
    String username = (String) hp.getAttribute("username");
    String password = (String) hp.getAttribute("password");
    out.println("USERNAME: " + username);
    out.println("PASSWORD: " + password);
    hp.invalidate();
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome</title>
    </head>

</html>
