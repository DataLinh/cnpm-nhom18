<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="adminNav.jsp" %>
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

<div class="main">
    <table  id="customers">
        <th>Mã ngành</th>
        <th>Tên ngành</th>
        <th></th>
        
            <c:forEach items="${nganh}" var ="n">
            <tr> 
                <td> ${n.maNganh} </td>
                <td> ${n.tenNganh} </td>
                <td>
                    <a href="<c:url value="/Admin/XemDeTai?maNganh=${n.maNganh}"/>">Xem đề tài của ngành này</a>
                </td>   
            </tr>
        </c:forEach>

    </table>
</div>
</body>
</html>
