<%-- 
    Document   : register
    Created on : 11-Sep-2023, 2:09:29 pm
    Author     : kevin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <link rel="stylesheet" href="style.css">
        <link href="https://fonts.googleapis.com/css?family=Ubuntu" rel="stylesheet">
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <link rel="stylesheet" href="path/to/font-awesome/css/font-awesome.min.css">
        <title>Register</title>
    </head>

    <body>
        <div class="main">
            <p class="sign" align="center">Register</p>
            <form class="form1" action="register" method="post">
                <input class="un " type="text" align="center" placeholder="Username" name="username">
                <input class="pass" type="password" align="center" placeholder="Password" name="password">
                <input class="submit" align="center" value="Register" type="submit">
                <p class="register" align="center"><a href="index.jsp">Already Have an Account? Login here</p>
            </form>
        </div>
    </body>
</html>
