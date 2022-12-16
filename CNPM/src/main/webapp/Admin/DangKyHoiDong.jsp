<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<jsp:include page="adminNav.jsp"></jsp:include>
    <style>
        * {
            box-sizing: border-box;
        }

        input[type=text], select, textarea {
            width: 100%;
            padding: 12px;
            border: 1px solid #ccc;
            border-radius: 4px;
            resize: vertical;
        }

        label {
            padding: 12px 12px 12px 0;
            display: inline-block;
        }

        input[type=submit] {
            background-color: #04AA6D;
            color: white;
            padding: 12px 20px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            float: right;
        }

        input[type=submit]:hover {
            background-color: #45a049;
        }

        .container {
            border-radius: 5px;
            background-color: #f2f2f2;
            padding: 20px;
        }

        .col-25 {
            float: left;
            width: 25%;
            margin-top: 6px;
        }

        .col-75 {
            float: left;
            width: 75%;
            margin-top: 6px;
        }

        /* Clear floats after the columns */
        .row:after {
            content: "";
            display: table;
            clear: both;
        }

        /* Responsive layout - when the screen is less than 600px wide, make the two columns stack on top of each other instead of next to each other */
        @media screen and (max-width: 600px) {
            .col-25, .col-75, input[type=submit] {
                width: 100%;
                margin-top: 0;
            }
        }
    </style>

    <div class="main">

        <h1>Tạo hội đồng</h1>        
        <p style="color:red;"> ${thongBao}</p>
        <div class="container">
            <form name="Tạo hội đồng" action="DKHD" method="POST">
                <input type="hidden" name="action" 
                       value="taoHoiDong">    
                <label for="maHoiDong" >Mã hội đồng</label>
                <input type=text id = "maHoiDong"  name="maHoiDong">
                <label for="tenHoiDong">Tên hội đồng</label>
                <input type=text id="tenHoiDong" name="tenHoiDong">
                <input type="submit" value="Tạo">
            </form>
        </div>
    </div>
</body>
</html>
