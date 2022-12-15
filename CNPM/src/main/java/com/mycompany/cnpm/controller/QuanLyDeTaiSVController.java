package com.mycompany.cnpm.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Admin/QLDeTaiSv")
public class QuanLyDeTaiSVController extends HttpServlet  {
	@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("QLDeTaiSV.jsp").forward(req, resp);
    }

}
