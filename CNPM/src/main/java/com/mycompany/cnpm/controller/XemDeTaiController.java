/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cnpm.controller;

import com.mycompany.cnpm.service.NganhService;
import com.mycompany.cnpm.service.DeTaiService;
import com.mycompany.cnpm.service.impl.DeTaiServiceImpl;
import com.mycompany.cnpm.service.impl.NganhServiceImpl;
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
@WebServlet("/Admin/XemDeTai")
public class XemDeTaiController extends HttpServlet {

    NganhService nganhService = new NganhServiceImpl();
    DeTaiService deTaiService = new DeTaiServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String maNganh = req.getParameter("maNganh");
        
        if (maNganh == null) {
            req.setAttribute("nganh", nganhService.getAllNganh());            
            req.getRequestDispatcher("PhanDeTaiTheoNganh.jsp").forward(req, resp);
        } else {
            req.setAttribute("deTai", deTaiService.getAllByNganh(maNganh));            
            req.getRequestDispatcher("XemDeTai.jsp").forward(req, resp);
        }
    }
}
