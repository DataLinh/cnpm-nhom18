<%-- 
    Document   : TruongBoMon
    Created on : Nov 23, 2022, 10:54:12 AM
    Author     : Linh
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
    <title>JSP Page</title>

    <body>
        <h1>Trưởng bộ môn </h1>
        <c:forEach items="${deTai}" var ="d">
        <tr> 
            <td> ${d.maDeTai} </td>
            <td> ${d.gvHuongDan.fullname} </td>
        </tr>
        </c:forEach>

</body>
</html>
