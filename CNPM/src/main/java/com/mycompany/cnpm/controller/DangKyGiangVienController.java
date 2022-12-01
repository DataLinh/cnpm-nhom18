/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cnpm.controller;

import com.mycompany.cnpm.dao.DeTaiDao;
import com.mycompany.cnpm.dao.UserDao;
import com.mycompany.cnpm.dao.impl.DeTaiDaoImpl;
import com.mycompany.cnpm.dao.impl.UserDaoImpl;
import com.mycompany.cnpm.service.DeTaiService;
import com.mycompany.cnpm.service.impl.DeTaiServiceImpl;
import com.mycompany.cnpm.service.impl.LoginServiceImpl;
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
@WebServlet("/TruongBoMon/DKGV")
public class DangKyGiangVienController extends HttpServlet {

    private DeTaiService deTaiService;
    public void init() {
        deTaiService = new DeTaiServiceImpl();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String maGiangVien = req.getParameter("maGiangVien");
        String maDeTai = req.getParameter("maDeTai");

        if (maGiangVien != null) {
            deTaiService.themGVPB(maDeTai, maGiangVien);
            resp.sendRedirect(req.getContextPath() + "/TruongBoMon");

        } else {
            req.setAttribute("giangVien", deTaiService.getAllGiangVien());
            req.getRequestDispatcher("DangKyGiangVien.jsp").forward(req, resp);
        }
    }
}
