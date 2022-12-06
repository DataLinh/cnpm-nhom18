

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Sửa hội đồng</title>
        <style>
        #customers {
            font-family: Arial, Helvetica, sans-serif;
            border-collapse: collapse;
            width: 100%;
        }

        #customers td, #customers th {
            border: 1px solid #ddd;
            padding: 8px;
        }

        #customers tr:nth-child(even){
            background-color: #f2f2f2;
        }

        #customers tr:hover {
            background-color: #ddd;
        }

        #customers th {
            padding-top: 12px;
            padding-bottom: 12px;
            text-align: left;
            background-color: #04AA6D;
            color: white;
        }
    </style>
    </head>
    <body>
        <a href="${pageContext.request.contextPath }/Logout"> Đăng xuất</a> <br>
        <a href="${pageContext.request.contextPath }"> Về trang chủ</a>
        <h1>Danh sách Hội đồng</h1>
        <table id="customers">
            <th>Mã hội đồng</th>
            <th>Tên hội đồng</th>
            <th></th>           
            <th></th>
                <c:forEach items="${hoiDongs}" var ="hd">
                <tr> 
                    <td> ${hd.maHoiDong} </td>
                    <td> ${hd.tenHoiDong} </td>     
                    <td> 
                        <a href="<c:url value="/Admin/DKHD?action=xoaHD&maHoiDong=${hd.maHoiDong}"/>">Xóa</a> 
                    </td> 
                    <td> 
                        <a href="<c:url value="/Admin/DKHD?action=themGV&maHoiDong=${hd.maHoiDong}"/>">Thêm Giảng Viên</a> 
                    </td> 
                </tr>
            </c:forEach>

        </table>
    </body>
</html>
