<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<jsp:include page="adminNav.jsp"></jsp:include>
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
    
        <h1>Danh sách tài khoản</h1>
        <table id="customers">
        	<th>Tài khoản</th>
       		 <th>Mật Khẩu</th>
       		 <th>Email</th>
       		 <th>SDT</th>
      		 <th>Quyền</th>
      		  <th></th>
      		  <th></th>
        <c:forEach items="${taiKhoans}" var ="tk">
            <tr> 
                <td> ${tk.username} </td>
                <td> ${tk.password} </td>
                <td> ${tk.email} </td>
                <td> ${tk.phone} </td>
                <td> ${tk.role} </td>
                <td>
                    <a href="<c:url value="/Admin/TTK?action=xoaTK&username=${tk.username}"/>">Xóa</a>
                </td> 
            </tr>
            </c:forEach>
    </table>
</div>  
</body>
</html>
