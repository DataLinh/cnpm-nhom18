package com.mycompany.cnpm.service.impl;
import com.mycompany.cnpm.dao.TaiKhoanDao;
import java.util.List;

import com.mycompany.cnpm.dao.UserDao;
import com.mycompany.cnpm.dao.impl.TaiKhoanDaoImpl;
import com.mycompany.cnpm.dao.impl.UserDaoImpl;
import com.mycompany.cnpm.entities.User;
import com.mycompany.cnpm.service.TaiKhoanService;
public class TaiKhoanServiceImpl  implements TaiKhoanService {
	
	UserDaoImpl userDao = new UserDaoImpl();
	TaiKhoanDao taiKhoanDao = new TaiKhoanDaoImpl();
	 @Override 
	 public int themTaiKhoan ( User u) {
		 return taiKhoanDao.themTaiKhoan(u);
	 }
	 @Override 
	 public void xoaTaiKhoan  ( String id) {
		  taiKhoanDao.xoaTaiKhoan(taiKhoanDao.get(id));
	 }
	 @Override 
	 public List<User> allTaiKhoan() {
		 return taiKhoanDao.allTaiKhoan();
	 }

}
