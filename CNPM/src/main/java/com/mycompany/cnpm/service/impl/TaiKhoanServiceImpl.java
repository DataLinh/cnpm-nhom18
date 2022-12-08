package com.mycompany.cnpm.service.impl;
import com.mycompany.cnpm.entities.User;
import com.mycompany.cnpm.service.TaiKhoanService;
import com.mycompany.cnpm.dao.impl.UserDaoImpl;
import com.mycompany.cnpm.dao.UserDao;
import java.util.List;
public class TaiKhoanServiceImpl  implements TaiKhoanService{

	UserDao userDao = new UserDaoImpl();
	@Override
	 public int themTaiKhoan(User t) {
	        return userDao.themTaiKhoan(t);
	    }

	 @Override
	 public List<User>allTaiKhoan() {
	        return userDao.allTaiKhoan();
	    }

	 @Override
	 public void xoaTaiKhoan(String id) {
	        userDao.xoaTaiKhoan(userDao.get(id));
	    }
	

}
