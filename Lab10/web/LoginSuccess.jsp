<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Success</title>
    </head>
    <body>


        <%
            String user = (String) session.getAttribute("user");
            String userName = null, sessionId = null;
            Cookie[] cookie = request.getCookies();
            if (cookie != null) {
                for (Cookie c : cookie) {
                    if (c.getName().equals("user")) {
                        userName = c.getValue();
                    }
                    if (c.getName().equals("JSESSIONID")) {
                        sessionId = c.getValue();
                    }
                }
            }


        %>

        <h3>

            Hi <%=userName%>, Login Successful, your session Id is: <%=sessionId%>
            <br/>
            User= <%=user%>
            <br/>
            <a href="CheckoutPage.jsp"> Checkout</a>
            <form action="LogoutServlet" method="post">
                <input type="submit" value="Logout"/>               
            </form>

        </h3>
    </body>
</html>
