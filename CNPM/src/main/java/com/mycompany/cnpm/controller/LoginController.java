/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mycompany.cnpm.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.mycompany.cnpm.dao.UserDao;
import com.mycompany.cnpm.dao.impl.UserDaoImpl;
import com.mycompany.cnpm.entities.User;
import com.mycompany.cnpm.service.LoginService;
import com.mycompany.cnpm.service.impl.LoginServiceImpl;
import com.mycompany.cnpm.until.HibernateUtil;
import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Linh
 */
@WebServlet("/Login")
public class LoginController extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private LoginService loginService = new LoginServiceImpl();

    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        HttpSession session = req.getSession(false);
        if (session != null && session.getAttribute("account") != null) {
            resp.sendRedirect(req.getContextPath() + "/Waiting");
            return;
        }
        req.getRequestDispatcher("login.jsp").forward(req, resp);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String username = req.getParameter("username");

        String password = req.getParameter("password");

        String alertMsg = "";

        if (username.isEmpty() || password.isEmpty()) {
            alertMsg = "Tài khoản mật khẩu không được để trống!";
            req.setAttribute("alert", alertMsg);
            req.getRequestDispatcher("login.jsp").forward(req, resp);
            return;
        }

        User user = loginService.login(username, password);

        if (user != null) {
            HttpSession session = req.getSession(true);
            session.setAttribute("account", user);
            resp.sendRedirect(req.getContextPath() + "/Waiting");
        } else {
            alertMsg = "Tài khoản hoặc mật khẩu không đúng!";
            req.setAttribute("alert", alertMsg);
            req.getRequestDispatcher("login.jsp").forward(req, resp);
        }
    }

}