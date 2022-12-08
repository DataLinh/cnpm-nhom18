<%-- 
    Document   : login
    Created on : Nov 21, 2022, 11:47:34 PM
    Author     : Linh
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title> Quản lý đề tài NCKH </title>
    </head>
    <body>
        <div class="container col-md-8 col-md-offset-3" style="overflow: auto">
            <h1>Login Form</h1>
            <p>${alert}<p>
            <form action="<%=request.getContextPath()%>/Login" method="post">

                <div class="form-group">
                    <label for="uname">User Name:</label> <input type="text"
                                                                 class="form-control" id="username" placeholder="User Name"
                                                                 name="username" required>
                </div>

                <div class="form-group">
                    <label for="uname">Password:</label> <input type="password"
                                                                class="form-control" id="password" placeholder="Password"
                                                                name="password" required>
                </div>


                <button type="submit" class="btn btn-primary">Đăng nhập</button>
            </form>
        </div>
    </body>
</html>