

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Sửa hội đồng</title>
    </head>
    <body>
        <a href="${pageContext.request.contextPath }"> Về trang chủ</a>
        <h1>Danh sách Hội đồng</h1>
        <table>
                <c:forEach items="${hoiDongs}" var ="hd">
                <tr> 
                    <td> ${hd.maHoiDong} </td>
                    <td> ${hd.tenHoiDong} </td>     
                    <td> 
                        <a href="<c:url value="/Admin/DKHD?action=xoaHD&maHoiDong=${hd.maHoiDong}"/>">Xóa</a> 
                    </td> 
                    <td>  &emsp; </td>
                    <td> 
                        <a href="<c:url value="/Admin/DKHD?action=themGV&maHoiDong=${hd.maHoiDong}"/>">Thêm Giảng Viên</a> 
                    </td> 
                </tr>
            </c:forEach>

        </table>
    </body>
</html>
