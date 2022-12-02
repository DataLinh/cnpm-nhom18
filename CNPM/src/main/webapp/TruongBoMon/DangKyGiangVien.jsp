<%-- 
    Document   : DangKyGiangVien
    Created on : Dec 1, 2022, 10:47:29 AM
    Author     : Linh
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>DKGV</title>
    </head>
    <body>
        <a href="${pageContext.request.contextPath }"> Về trang chủ</a>
        <h1>Thêm giảng viên </h1>
        <table>
            <th>Tên giảng viên</th>
            <th>Khoa</th>
            <th></th>
            <th></th>
            
                <c:forEach items="${giangVien}" var ="gv">
                <tr> 
                    <td> ${gv.fullname} </td>
                    <td> ${gv.nganh.tenNganh} </td>     
                    <td> 
                        <a href="<c:url value="/TruongBoMon/DKGV?maDeTai=${param.maDeTai}&amp;maGiangVien=${gv.username}"/>">Đăng ký giảng viên phản biện</a> 
                    </td> 
                </tr>
            </c:forEach>

        </table>
    </body>
</html>
