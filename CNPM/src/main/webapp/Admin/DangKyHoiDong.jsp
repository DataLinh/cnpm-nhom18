

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Đăng ký hội đồng</title>
    </head>
    <body>
        <a href="${pageContext.request.contextPath }/Logout"> Đăng xuất</a> <br>
        <a href="${pageContext.request.contextPath }"> Về trang chủ</a>
        <h1>Tạo hội đồng</h1>
        <form name="Tạo hội đồng" action="DKHD" method="POST">
            <li> ${thongBao}</li>
            <input type="hidden" name="action" 
                   value="taoHoiDong">    
            <li>Mã hội đồng</li>
            <input type=text name="maHoiDong">
            <li>Tên hội đồng</li>
            <input type=text name="tenHoiDong">
            <input type="submit" value="Tạo">
        </form>
    </body>
</html>
