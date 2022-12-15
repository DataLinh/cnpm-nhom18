/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cnpm.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Linh
 */
@WebServlet("/SinhVien")
public class SinhVienController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       
       //req.getRequestDispatcher("QuanLyDeTaiSV.jsp").forward(req, resp);
       String action = req.getParameter("action");
       if (action == null) {
           req.getRequestDispatcher("SinhVien.jsp").forward(req, resp);
       }else if ( action.equalsIgnoreCase ("xem"))
       {
    	   req.getRequestDispatcher("QuanLyDeTaiSV.jsp").forward(req, resp);
       }
    }
    
}
