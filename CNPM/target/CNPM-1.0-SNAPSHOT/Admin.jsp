<%-- 
    Document   : Admin
    Created on : Nov 23, 2022, 10:53:47 AM
    Author     : Linh
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title> Admin </title>
    </head>
    <body>
        <a href="${pageContext.request.contextPath }/Logout"> Đăng xuất</a>
        <form action="DangNhap"></form>
        <h1>Admin!</h1>
        <a href="${pageContext.request.contextPath }/Admin/DKHD"> Đăng ký hội đồng mới</a>
        <br>
        <a href="${pageContext.request.contextPath }/Admin/DKHD?action=suaHoiDong"> Chỉnh sửa hội đồng</a>
    </body>
</html>
