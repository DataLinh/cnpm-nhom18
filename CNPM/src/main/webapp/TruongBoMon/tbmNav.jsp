<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title> Quản lý đề tài NCKH </title>
        <style>
            body {
                font-family: "Times New Roman", Times, serif;
            }

            .sidenav {
                height: 100%;
                width: 250px;
                position: fixed;
                z-index: 1;
                top: 0;
                left: 0;
                background-color: #111;
                overflow-x: hidden;
                padding-top: 20px;
            }

            .sidenav a {
                padding: 6px 6px 6px 32px;
                text-decoration: none;
                font-size:15px;
                color: #818181;
                display: block;
            }


            .sidenav a:hover {
                color: #f1f1f1;
            }
            .sidenav img {
                display: block;
                margin-left: auto;
                margin-right: auto;
                width: 50%;
            }


            .main {
                margin-left: 250px; /* Same as the width of the sidenav */
            }

            @media screen and (max-height: 450px) {
                .sidenav {
                    padding-top: 15px;
                }
                .sidenav a {
                    font-size: 13px;
                }
            }
        </style>
    </head>
    <body>

        <div class="sidenav"> 
            <a style="color: cyan; text-align: center;" href="${pageContext.request.contextPath }/Logout"">Đăng xuất</a>
            <br><br><br><br><br><br>
            <img src="${pageContext.request.contextPath }/img/logo.png" alt="logo" width="100px" >
            <br>
        </div>

