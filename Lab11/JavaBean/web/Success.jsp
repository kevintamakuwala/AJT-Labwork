<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
    <jsp:useBean id="sBean" scope="request" class="com.StudentBean">
        <jsp:setProperty name="sBean" property="studentName" value="<%= request.getParameter("StudentName")%>" />
        <jsp:setProperty name="sBean" property="studentRollNo" value="<%=Integer.parseInt(request.getParameter("StudentRollNo"))%>"/>
    </jsp:useBean>
    
    <body>
        Student Name : <jsp:getProperty name="sBean" property="studentName" />
        Student Roll Number : <jsp:getProperty name="sBean" property="studentRollNo" />
    </body>
</html>