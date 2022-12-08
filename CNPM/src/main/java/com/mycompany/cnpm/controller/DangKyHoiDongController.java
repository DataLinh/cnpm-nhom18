/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cnpm.controller;

import com.mycompany.cnpm.service.HoiDongService;
import com.mycompany.cnpm.entities.HoiDong;
import com.mycompany.cnpm.service.GiangVienService;
import com.mycompany.cnpm.service.impl.GiangVienServiceImpl;
import com.mycompany.cnpm.service.impl.HoiDongServiceImpl;
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
@WebServlet("/Admin/DKHD")
public class DangKyHoiDongController extends HttpServlet {

    GiangVienService giangVienService = new GiangVienServiceImpl();
    HoiDongService hoiDongService = new HoiDongServiceImpl();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            doGet_Display(request, response);
        } else if (action.equalsIgnoreCase("taoHoiDong")) {
            doPost_taoHoiDong(request, response);

        } else {
            doGet_Display(request, response);

        }
    }

    protected void doPost_taoHoiDong(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String maHoiDong = request.getParameter("maHoiDong");
        String tenHoiDong = request.getParameter("tenHoiDong");
        HoiDong h = new HoiDong();
        h.setMaHoiDong(maHoiDong);
        h.setTenHoiDong(tenHoiDong);
        if (hoiDongService.themHoiDong(h) == 1) {
            request.setAttribute("thongBao", "Thêm mới thành công");
            doGet_Display(request, response);
        } else {
            request.setAttribute("thongBao", "Đã có lỗi không mong muốn xảy ra trong lúc tạo hội đồng");
            doGet_Display(request, response);
        }

    }

    protected void doGet_Display(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.getRequestDispatcher("DangKyHoiDong.jsp").forward(req, resp);

    }

    protected void doGet_xoaHD(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String maHoiDong = req.getParameter("maHoiDong");

        hoiDongService.xoaHoiDong(maHoiDong);
        resp.sendRedirect(req.getContextPath() + "/Admin");

    }

    protected void doGet_themGV(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String maHoiDong = req.getParameter("maHoiDong");
        req.setAttribute("hoiDongID", maHoiDong);
        req.setAttribute("giangViens", giangVienService.allGiangVienChuaCoHD());
        req.getRequestDispatcher("ThemGiangVien.jsp").forward(req, resp);

    }

    protected void doGet_chonGV(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String userId = req.getParameter("maGiangVien");

        String hoiDongID = req.getParameter("hoiDongID");
        
        giangVienService.themHoiDong(userId, hoiDongID);
        
        resp.sendRedirect(req.getContextPath() + "/Admin");

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action == null) {
            doGet_Display(req, resp);
        } else if (action.equalsIgnoreCase("suaHoiDong")) {
            req.setAttribute("hoiDongs", hoiDongService.allHoiDong());
            req.getRequestDispatcher("SuaHoiDong.jsp").forward(req, resp);
        } else if (action.equalsIgnoreCase("xoaHD")) {
            doGet_xoaHD(req, resp);

        } else if (action.equalsIgnoreCase("themGV")) {
            doGet_themGV(req, resp);

        } else if (action.equalsIgnoreCase("chonGV")) {
            doGet_chonGV(req, resp);

        } else {
            doGet_Display(req, resp);
        }
    }

}
