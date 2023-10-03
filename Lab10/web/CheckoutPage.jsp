<%-- 
    Document   : CheckoutPage
    Created on : Sep 18, 2023, 2:15:20 PM
    Author     : user1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Checkout</title>
    </head>
    <body>
        <%
            String userName = null, sessionId = null;
            Cookie[] cookie = request.getCookies();
            if (cookie != null) {
                for (Cookie c : cookie) {
                    if (c.getName().equals("user")) {
                        userName = c.getValue();
                    }
                }
            }
        %>

        <h3>

            Hi <%=userName%>, do the checkout
            <br/>
            <form action="LogoutServlet" method="post">
                <input type="submit" value="Logout"/>               
            </form>
        </h3>
    </body>
</html>