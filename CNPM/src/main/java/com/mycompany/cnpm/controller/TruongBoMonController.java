/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cnpm.controller;

import com.mycompany.cnpm.service.DeTaiService;
import com.mycompany.cnpm.service.impl.DeTaiServiceImpl;
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
@WebServlet("/TruongBoMon")
public class TruongBoMonController extends HttpServlet {

    private DeTaiService deTai = new DeTaiServiceImpl();
    

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("deTai", deTai.getAllDeTai());
        req.getRequestDispatcher("TruongBoMon.jsp").forward(req, resp);
    }
}
