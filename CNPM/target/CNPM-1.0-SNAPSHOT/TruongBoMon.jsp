<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%-- 
    Document   : TruongBoMon
    Created on : Nov 23, 2022, 10:54:12 AM
    Author     : Linh
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="TruongBoMon/tbmNav.jsp" %>
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
<body>
    <table  id="customers">
        <th>Mã đề tài</th>
        <th>GVHD</th>
        <th>GV Phản Biện</th>
        <th>Sinh viên làm đề tài</th>
            <c:forEach items="${deTai}" var ="d">
            <tr> 
                <td> ${d.maDeTai} </td>
                <td> ${d.gvHuongDan.fullname} </td>
                <td>
                    <c:if test="${d.gvPhanBien!=null}">
                        ${d.gvPhanBien.fullname}
                    </c:if>
                    <c:if test="${d.gvPhanBien==null}">
                        <a href="<c:url value="/TruongBoMon/DKGV?maDeTai=${d.maDeTai}"/>">Đăng ký giảng viên phản biện</a>
                    </c:if>
                </td>   
                <td> ${d.sinhVien.fullname} </td>
            </tr>
        </c:forEach>

    </table>
</div>
</body>
</html>
