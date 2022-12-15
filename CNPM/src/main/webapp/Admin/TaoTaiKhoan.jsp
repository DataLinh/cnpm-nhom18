<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<jsp:include page="adminNav.jsp"></jsp:include>
<div class="main">
<h1>Thêm tài khoản</h1>

        <form name="Tạo tài khoản" action="TTK" method="POST">
            <li> ${thongBao}</li>
            <input type="hidden" name="action" 
                   value="taoTaiKhoan">    
            <li>Username</li>
            <input type=text name="username">
            <li>Password</li>
            <input type=password name="password">
            <li>Email</li>
            <input type=email name="email">
            <li>Phone</li>
            <input type=tel name="phone">
             <li>Role</li>
            <input list = Role >
            <datalist id = "role">
            <option value = "Admin">
            <option value = "SinhVien">
            <option value = "GiangVien">
            <option value = "TruongBoMon">
            </datalist>
            <input type="submit" value="Tạo">
        </form>
 </div>
</body>
</html>