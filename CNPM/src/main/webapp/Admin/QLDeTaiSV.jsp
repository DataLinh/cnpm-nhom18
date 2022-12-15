<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!-- Designined by CodingLab | www.youtube.com/codinglabyt -->
<html lang="en" dir="ltr">

<head>
    <meta charset="UTF-8">
    <title> Quản lí đề tài SV </title>
    <!-- Boxicons CDN Link -->
    <link href='https://unpkg.com/boxicons@2.0.7/css/boxicons.min.css' rel='stylesheet'>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <style>
        /* Googlefont Poppins CDN Link */
        @import url('https://fonts.googleapis.com/css2?family=Poppins:wght@200;300;400;500;600;700&display=swap');

        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
            font-family: 'Poppins', sans-serif;
        }

        .sidebar {
            position: fixed;
            height: 100%;
            width: 240px;
            background: #04AA6D;
            transition: all 0.5s ease;
        }

        .sidebar.active {
            width: 60px;
        }

        .sidebar .logo-details {
            height: 80px;
            display: flex;
            align-items: center;
        }

        .sidebar .logo-details i {
            font-size: 28px;
            font-weight: 500;
            color: #fff;
            min-width: 60px;
            text-align: center
        }

        .sidebar .logo-details .logo_name {
            color: #fff;
            font-size: 24px;
            font-weight: 500;
        }

        .sidebar .nav-links {
            margin-top: 10px;
        }

        .sidebar .nav-links li {
            position: relative;
            list-style: none;
            height: 50px;
        }

        .sidebar .nav-links li a {
            height: 100%;
            width: 100%;
            display: flex;
            align-items: center;
            text-decoration: none;
            transition: all 0.4s ease;
        }

        .sidebar .nav-links li a.active {
            background: #081D45;
        }

        .sidebar .nav-links li a:hover {
            background: ##ddd;
        }

        .sidebar .nav-links li i {
            min-width: 60px;
            text-align: center;
            font-size: 18px;
            color: #fff;
        }

        .sidebar .nav-links li a .links_name {
            color: #fff;
            font-size: 15px;
            font-weight: 400;
            white-space: nowrap;
        }

        .home-section {
            position: relative;
            background: #f5f5f5;
            min-height: 100vh;
            width: calc(100% - 240px);
            left: 240px;
            transition: all 0.5s ease;
        }

        .sidebar.active~.home-section {
            width: calc(100% - 60px);
            left: 60px;
        }

        .home-section nav {
            display: flex;
            justify-content: space-between;
            height: 80px;
            background: #fff;
            display: flex;
            align-items: center;
            position: fixed;
            width: calc(100% - 240px);
            left: 240px;
            z-index: 100;
            padding: 0 20px;
            box-shadow: 0 1px 1px rgba(0, 0, 0, 0.1);
            transition: all 0.5s ease;
        }

        .sidebar.active~.home-section nav {
            left: 60px;
            width: calc(100% - 60px);
        }

        .home-section nav .sidebar-button {
            display: flex;
            align-items: center;
            font-size: 24px;
            font-weight: 500;
        }

        nav .sidebar-button i {
            font-size: 35px;
            margin-right: 10px;
        }


        nav .search-box input {
            height: 100%;
            width: 100%;
            outline: none;
            background: #F5F6FA;
            border: 2px solid #EFEEF1;
            border-radius: 6px;
            font-size: 18px;
            padding: 0 15px;
        }


        .home-section nav .profile-details {
            display: flex;
            align-items: center;
            background: #F5F6FA;
            border: 2px solid #EFEEF1;
            border-radius: 6px;
            height: 50px;
            min-width: 190px;
            padding: 0 15px 0 2px;
        }

        nav .profile-details img {
            height: 40px;
            width: 40px;
            border-radius: 6px;
            object-fit: cover;
        }

        nav .profile-details .admin_name {
            font-size: 15px;
            font-weight: 500;
            color: #333;
            margin: 0 10px;
            white-space: nowrap;
        }

        nav .profile-details i {
            font-size: 25px;
            color: #00FF00;
        }

        .home-section .home-content {
            position: relative;
            padding-top: 104px;
        }

        .home-content .overview-boxes {
            display: flex;
            align-items: center;
            justify-content: space-between;
            flex-wrap: wrap;
            padding: 0 20px;
            margin-bottom: 26px;
        }

        .overview-boxes .box {
            display: flex;
            align-items: center;
            justify-content: center;
            width: calc(100% / 4 - 15px);
            background: #fff;
            padding: 15px 14px;
            border-radius: 12px;
            box-shadow: 0 5px 10px rgba(0, 0, 0, 0.1);
        }

       
      


        
    </style>
</head>

<body>
    <script>
        let sidebar = document.querySelector(".sidebar");
        let sidebarBtn = document.querySelector(".sidebarBtn");
        sidebarBtn.onclick = function () {
            sidebar.classList.toggle("active");
            if (sidebar.classList.contains("active")) {
                sidebarBtn.classList.replace("bx-menu", "bx-menu-alt-right");
            } else
                sidebarBtn.classList.replace("bx-menu-alt-right", "bx-menu");
        }
    </script>
    <div class="sidebar">
        <div class="logo-details">
            <i class='bx bxl-c-plus-plus'></i>
            <span class="logo_name"> Quản lý đề tài SV </span>
        </div>  
        <ul class="nav-links">
            <li>
                <a href="/XemDeTai">
                    <i class='bx bx-box'></i>
                    <span class="links_name">Đăng ký đề tài </span>
                </a>
            </li>
     
            <li>
                <a href="UserServlet">
                    <i class='bx bx-cog'></i>
                    <span class="links_name">Xem thành viên </span>
                </a>
            </li>
            <li>
                <a href="UserServlet">
                    <i class='bx bx-cog'></i>
                    <span class="links_name">Đăng ký nhóm</span>
                </a>
            </li>
            <li>
                <a href="UserServlet">
                    <i class='bx bx-cog'></i>
                    <span class="links_name">Nộp đề tài </span>
                </a>
            </li>
            <li>
                <a href="UserServlet">
                     <i class='bx bx-cog'></i>
                     <span class="links_name">Xem điểm đề tài</span>
                    </a>
            </li>
            <li>
                 <a href="UserServlet">
                     <i class='bx bx-cog'></i>
                    <span class="links_name">Xem đánh giá đề tài </span>
                </a>
            </li>
        </ul>
    </div>
    <section class="home-section">
        <nav>
            <div class="sidebar-button">
                <i class='bx bx-menu sidebarBtn'></i>
                <span class="dashboard">Quản lý </span>
            </div>
            <div class="search-box">
                <input type="text" placeholder="Search...">
                <i class='bx bx-search'></i>
            </div>
            <div class="profile-details">
                <img src="https://fit.hcmute.edu.vn/Resources/Images/SubDomain/fit/logo-cntt2021.png" alt="">
                <span class="admin_name">Prem Shahi</span>
                <i class='bx bx-chevron-down'></i>
            </div>
        </nav>
     
    </section>

</body>

</html>