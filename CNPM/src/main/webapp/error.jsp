<%-- 
    Document   : error
    Created on : Nov 22, 2022, 12:07:46 AM
    Author     : Linh
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title> ERROR PAGE </title>
    </head>
    <body>
        <h1>LOI RUI</h1>
        <% String error = (String) request.getParameter("ERROR");%>
        <h2> <%= error %> </h2>
        <h2> <a href ="login.jsp"> Back </a>    </h2> 
    </body>
</html>
