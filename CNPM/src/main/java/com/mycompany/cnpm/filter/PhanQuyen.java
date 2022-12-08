/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cnpm.filter;

import com.mycompany.cnpm.entities.User;
import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Linh
 */
public class PhanQuyen implements Filter {

    private ServletContext context;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.context = filterConfig.getServletContext();
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse resp = (HttpServletResponse) response;
        String url = req.getRequestURI();
        if (url.contains("Login") || url.contains("Waiting")|| url.contains("Logout")) {
            chain.doFilter(request, response);
        } else {
            HttpSession session = req.getSession();
            if (session != null && session.getAttribute("account") != null) {
                User u = (User) session.getAttribute("account");
                String role = u.getRole();
                if (role.equals("Admin") && url.contains("Admin")) {
                    chain.doFilter(request, response);
                } else if (role.equals("SinhVien") && url.contains("SinhVien")) {
                    chain.doFilter(request, response);
                } else if (role.equals("GiangVien") && url.contains("GiangVien")) {
                    chain.doFilter(request, response);
                } else if (role.equals("TruongBoMon") && url.contains("TruongBoMon")) {
                    chain.doFilter(request, response);
                } else {
                    resp.sendRedirect(req.getContextPath() + "/Waiting");
                }
            } else {
                resp.sendRedirect(req.getContextPath() + "/Login");
            }
        }

    }

    @Override
    public void destroy() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
