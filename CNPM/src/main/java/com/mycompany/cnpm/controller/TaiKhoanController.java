package com.mycompany.cnpm.controller;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.mycompany.cnpm.entities.User;
import com.mycompany.cnpm.service.TaiKhoanService;
import com.mycompany.cnpm.service.impl.TaiKhoanServiceImpl;
@WebServlet("/Admin/TTK")
public class TaiKhoanController extends HttpServlet {
	
	TaiKhoanService taiKhoanService = new TaiKhoanServiceImpl ();
	@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            doGet_Display(request, response);
        } else if (action.equalsIgnoreCase("taoTaiKhoan")) {
            doPost_taoTaiKhoan(request, response);

        } else {
            doGet_Display(request, response);

        }
    }
	 protected void doGet_Display(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	        req.getRequestDispatcher("ThemTaiKhoan.jsp").forward(req, resp);

	    }
	 protected void doPost_taoTaiKhoan(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        String username = request.getParameter("username");
	        String password = request.getParameter("password");
		String email = request.getParameter("email");
		String role = request.getParameter("role");
	        User t = new User();
	        t.setUsername(username);
	        t.setPassword(password);
	        t.setEmail(email);
	        t.setRole(role);
	        if (taiKhoanService.themTaiKhoan(t) == 1) {
	            request.setAttribute("thongBao", "Thêm mới thành công");
	            doGet_Display(request, response);
	        } else {
	            request.setAttribute("thongBao", "Đã có lỗi không mong muốn xảy ra trong lúc tạo hội đồng");
	            doGet_Display(request, response);
	        }

	    }
	 protected void doGet_xoaTK(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	        String maTaiKhoan = req.getParameter("maTaiKhoan");

	        taiKhoanService.xoaTaiKhoan(maTaiKhoan);
	        resp.sendRedirect(req.getContextPath() + "/Admin/TTK");

	    }
	 protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	        String action = req.getParameter("action");
	        if (action == null) {
	            doGet_Display(req, resp);
	        }
	        else if ( action.equalsIgnoreCase ("suaTaiKhoan"))
	        {
	        	req.setAttribute("taiKhoans", taiKhoanService.allTaiKhoan());
	        	req.getRequestDispatcher("SuaTaiKhoan.jsp").forward(req, resp);
	        }
	           else if (action.equalsIgnoreCase("xoaTK")) {
	                doGet_xoaTK(req, resp);
	           }

	 }
}
