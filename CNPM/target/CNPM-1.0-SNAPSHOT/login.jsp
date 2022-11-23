<%-- 
    Document   : login
    Created on : Nov 21, 2022, 11:47:34 PM
    Author     : Linh
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Quản lý đề tài NCKH</title>
    </head>
    <body>
        <div class="container col-md-8 col-md-offset-3" style="overflow: auto">
            <h1>Login Form</h1>
            <form action="<%=request.getContextPath()%>/login" method="post">

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


                <button type="submit" class="btn btn-primary">Submit</button>
            </form>
        </div>
    </body>
</html>