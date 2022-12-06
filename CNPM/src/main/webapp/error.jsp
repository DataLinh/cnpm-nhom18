<%-- 
    Document   : error
    Created on : Nov 22, 2022, 12:07:46 AM
    Author     : Linh
--%>


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title> Đã có lỗi xảy ra! </title>
    </head>
    <body>
        <h1>Đã có lỗi xảy ra, chúng tôi sẽ hoàn thiện trong thời gian tới!</h1>
        <% String error = (String) request.getParameter("ERROR");%>
        <h2> <%= error %> </h2>
        <h2> <a href ="login.jsp"> Back </a>    </h2> 
    </body>
</html>
