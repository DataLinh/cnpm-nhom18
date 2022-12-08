
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
   <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Thêm tài khoản</title>
</head>
<body>
  <a href="${pageContext.request.contextPath }"> Về trang chủ</a>
        <h1>Tạo tài khoản </h1>
        <form name="Tạo tài khoản" action="TTK" method="POST">
            <li> ${thongBao}</li>
            <input type="hidden" name="action" 
                   value="taoTaiKhoan">    
            <li>Username</li>
            <input type=text name="username">
            <li>Password</li>
            <input type=text name="password">
            <li>Email</li>
            <input type=text name="email">
              <li>Phone/li>
            <input type=text name="phone">
             <li>Role</li>
            <input type=text name="role">
            <input type="submit" value="Tạo">
        </form>
</body>
</html>