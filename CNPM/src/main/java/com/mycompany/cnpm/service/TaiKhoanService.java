package com.mycompany.cnpm.service;

import java.util.List;

import com.mycompany.cnpm.entities.User;

public interface TaiKhoanService {
	int themTaiKhoan(User t);
	List <User> allTaiKhoan();
	void xoaTaiKhoan ( String id);

}
