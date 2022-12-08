/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cnpm.controller;

import com.mycompany.cnpm.entities.User;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Linh
 */
@WebServlet(urlPatterns = "/Waiting")
public class WaitingController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        if (session != null && session.getAttribute("account") != null) {
            User u = (User) session.getAttribute("account");
            req.setAttribute("username", u.getUsername());
            if (u.getRole().equals("Admin")) {
                resp.sendRedirect(req.getContextPath() + "/Admin");
            } else if (u.getRole().equals("SinhVien")) {
                resp.sendRedirect(req.getContextPath() + "/SinhVien");
            } else if (u.getRole().equals("GiangVien")) {
                resp.sendRedirect(req.getContextPath() + "/GiangVien");
            } else if (u.getRole().equals("TruongBoMon")) {
                resp.sendRedirect(req.getContextPath() + "/TruongBoMon");
            } 
        } else {
            resp.sendRedirect(req.getContextPath() + "/Login");
        }
    }
}
