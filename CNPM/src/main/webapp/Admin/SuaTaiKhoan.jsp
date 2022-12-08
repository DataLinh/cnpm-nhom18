   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Sửa tài khoản</title>
</head>
<body>
        <a href="${pageContext.request.contextPath }"> Về trang chủ</a>
        <h1>Danh sách tài khoản</h1>
        <table>
                <c:forEach items="${taiKhoans}" var ="hd">
                <tr> 
                <td> ${tk.username} </td>
                <td> ${tk.maTaiKhoan} </td>
                <td> ${tk.password} </td>
                <td> ${tk.email} </td>
                <td> ${tk.phone} </td>
                <td> ${tk.role} </td>
                     <a href="<c:url value="/Admin/TTK?action=suaTaiKhoan&maTaiKhoan=${tk.maTaiKhoan}"/>">Xóa</a> 
                    </td> 
                    <td>  &emsp; </td>
                      </tr>
            </c:forEach>
        </table>
</body>
</html>