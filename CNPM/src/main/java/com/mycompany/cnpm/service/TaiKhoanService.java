package com.mycompany.cnpm.service;
import java.util.List;

import com.mycompany.cnpm.entities.User;

public interface TaiKhoanService {
	
	int themTaiKhoan(User u);
	List<User> allTaiKhoan();
	void xoaTaiKhoan(String id);

}
